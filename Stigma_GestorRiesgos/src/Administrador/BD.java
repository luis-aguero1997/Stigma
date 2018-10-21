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

    public ArrayList Consulta() {
        ArrayList mLista = new ArrayList();
        Usuario mUsuario = new Usuario();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from usuarios;");

            while (resultado.next()) {
                mUsuario = new Usuario();

                mUsuario.setNombre(resultado.getString("nombre"));
                mUsuario.setNomUser(resultado.getString("nombreuser"));
                mUsuario.setEmail(resultado.getString("email"));
                mUsuario.setPassword(resultado.getString("password"));
                mUsuario.setTipoUser(resultado.getString("tipouser"));

                mLista.add(mUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mLista;
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
                    + "or nombre like '%" + Criterio + "%' or nombreuser like '%" + Criterio + "%' or email like'%" + Criterio + "%';");
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

    public boolean ModificarUsuario(Usuario mUsuario, Usuario nUsuario){
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "UPDATE INTO riesgos.usuarios "
                    + "(idusuario,nombre,nombreuser,email,password,tipouser) "
                    + "VALUES ("
                    + "null" + ",'"
                    + nUsuario.getNombre() + "','" 
                    + nUsuario.getNomUser() + "','" 
                    + nUsuario.getEmail() + "','" 
                    + mUsuario.getPassword() + "','" 
                    + nUsuario.getTipoUser() + "');";
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
    
    /*public boolean ModificarUsuario(Usuario mUsuario){
        
    }*/
}
