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
import javax.swing.JComboBox;
/**
 *
 * @author Luis
 */
public class BDUsuario {
    
    static Connection Conection = null;
    static Statement Sentencia;
    static ResultSet Resultado;
    private Connection Conexion;

    public boolean ConectarUsuario() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/riesgos", "root", "");
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

    public void DesconectarUsuario() {
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
            String SQL = "INSERT INTO riesgos.usuarios "
                    + "(idusuario,nombre,nombreuser,email,password,tipouser) "
                    + "VALUES ("
                    + "null" + ",'"
                    + mUsuario.getNombre() + "','" 
                    + mUsuario.getNomUser() + "','" 
                    + mUsuario.getEmail() + "','" 
                    + mUsuario.getPassword() + "','" 
                    + mUsuario.getTipoUser() + "');";
            consulta.execute(SQL);
            return true; 
        } catch (Exception e) {
              e.printStackTrace();
            return false;
        }
    }

    public ResultSet Consulta() {
        ArrayList mLista = new ArrayList();
        Usuario mUsuario = new Usuario();
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idusuario, nombre, nombreuser, email, tipouser from usuarios;");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ResultSet ConsultaFiltro(String Criterio) {
        Usuario mUsuario = null;
        Statement consulta;
        ResultSet resultado = null;
        ArrayList Lista = new ArrayList();

        try {
            mUsuario = new Usuario();
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idusuario, nombre, nombreuser, email, tipouser"
                    + " from usuarios where idusuario like '%" + Criterio + "%' "
                    + "or nombre like '%" + Criterio + "%' or nombreuser like '%" + Criterio + 
                    "%' or email like'%" + Criterio + "%';");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
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

    public boolean ModificarUsuario(Usuario mUsuario, Usuario nUsuario){
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "UPDATE riesgos.usuarios SET "
                    + "nombreuser = '" + nUsuario.getNomUser() + "'," 
                    + "password = '" + nUsuario.getPassword() + "'"
                    + " where idusuario = '" + mUsuario.getID() + "';";
            consulta.execute(SQL);
            return true; 
        } catch (Exception e) {
              e.printStackTrace();
            return false;
        }
    }
    
    public boolean DuplicidadNombre(Usuario mUsuario)
    {Statement consulta;
        ResultSet resultado;
        String Res = "";
        String Sentencia = null;
        try {
            consulta = Conexion.createStatement();
            Sentencia = "SELECT nombre FROM usuarios " +"WHERE nombre == '" + mUsuario.getNombre() + "';";
                    
            resultado = consulta.executeQuery(Sentencia);
            while (resultado.next()) {
               Res = resultado.getString("nombre");
            }
            if (Res.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
    public boolean DuplicidadNombUser(Usuario mUsuario) {
        Statement consulta;
        ResultSet resultado;
        String Res = "";
        String Sentencia = null;
        try {
            consulta = Conexion.createStatement();
            Sentencia = ("SELECT nombre_usuario FROM usuarios where nombreuser = '" + mUsuario.getNomUser() + "';");
            resultado = consulta.executeQuery(Sentencia);
            while (resultado.next()) {
                Res = resultado.getString("nombreuser");
            }

            if (Res.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean DuplicidadEmail(Usuario mUsuario) {
        Statement consulta;
        ResultSet resultado;
        String Res = "";
        String Sentencia = null;
        try {
            consulta = Conexion.createStatement();
            Sentencia = ("SELECT email FROM usuarios where email = '" + mUsuario.getEmail() + "';");
            resultado = consulta.executeQuery(Sentencia);
            while (resultado.next()) {
                Res = resultado.getString("email");
            }

            if (Res.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean DuplicidadPassword(String Password) {
        Statement consulta;
        ResultSet resultado;
        String Res = "";
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT password FROM usuario wWHERE paswword = '" + Password + "';");
            while (resultado.next()) {
                Res = resultado.getString("Password");
            }

            if (Res.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean DuplicidadTipoUsuario(String TipoUsuario) {
        Statement consulta;
        ResultSet resultado;
        String Res = "";
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT tipouser FROM usuario WHERE tipouser = '" + TipoUsuario + "';");
            while (resultado.next()) {
                Res = resultado.getString("tipouser");
            }

            if (Res.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void ConsultarComboU(JComboBox CBDesarrolladores)
    {
        Statement consulta;
        ResultSet resultado = null;
        
        try{
            String SQL = "select nombreuser from usuarios where tipouser = 'Desarrollador' order by nombreuser;";
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery(SQL);
            CBDesarrolladores.addItem("Seleccione un Usuario");
            
            while(resultado.next()){
                CBDesarrolladores.addItem(resultado.getString("nombreuser"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
