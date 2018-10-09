/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Stigma
 */
public class BD {
    
    static Connection Conection = null;
    static Statement Sentencia;
    static ResultSet Resultado;
    private Connection Conexion;

    
    public boolean Conectar() {
        try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
            Conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/riesgos", "root", "");
            if (Conexion != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void Desconectar() {
        try {
            this.Conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean AgregarUsuario(Usuario mUsuario) {
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            consulta.execute("insert into  usuarios "
                    + "(nombre,nombre_user,email,password,tipo_user) "
                    + "values ('" + mUsuario.getNombre() + "'," + mUsuario.getNomUser() + "," + mUsuario.getEmail() + "," + mUsuario.getPassword() + "," + mUsuario.getTipoUser() + ");");
            return true;
        } catch (Exception e) {
            //  e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList ConsultarProductos() {
        ArrayList mListaProductos = new ArrayList();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto;");

            while (resultado.next()) {
                mUsuario = new Usuario();

                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setNombre(resultado.getString("nombre_producto"));
                mProducto.setPrecio(Float.parseFloat(resultado.getString("precio_producto")));
                mProducto.setPrecio_venta(Float.parseFloat(resultado.getString("precio_venta")));
                mProducto.setCantidad(Integer.parseInt(resultado.getString("cantidad")));

                mListaProductos.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProductos;
    }
    
    public ArrayList ConsultaFiltro(String Criterio) {
        Usuario mUsuario = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList Lista = new ArrayList();

        try {
            mUsuario = new Usuario();
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from usuarios where idusuario like '%" + Criterio + "%' "
                    + "or nombre like '%" + Criterio + "%' or nombreuser like '%" + Criterio  + "%' or email like'%" + Criterio + "%';");
            while (resultado.next()) {
                mUsuario = new Usuario();
                
                mUsuario.setNombre(resultado.getString("nombre"));
                mUsuario.setNomUser(resultado.getString("nombreuser"));
                mUsuario.setEmail(resultado.getString("email"));
                mUsuario.setTipoUser(resultado.getString("tipouser"));
                Lista.add(mUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Lista;
    }
    
    public boolean EliminarUsuario(int ID) {
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            consulta.execute("delete from usuarios"
                    + " where idusuario = " + ID + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
