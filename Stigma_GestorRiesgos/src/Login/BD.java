/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public void Desconectar() {
        try {
            this.Conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public String ConsultaUser(String User) {
        String Usuario = "Incorrecto";
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select nombreuser from usuarios where nombreuser  = '" + User + "' or email = '" + User + "';");
            while (resultado.next()) {
                Usuario = resultado.getString("nombreuser");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Existe");
            e.printStackTrace();
        }

        return Usuario;
    }
    
     public String ConsultaCorreo(String User) {
        String Email = "";
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select email from usuarios where nombreuser  = '" + User + "' or email = '" + User + "';");
            while (resultado.next()) {
                Email = resultado.getString("email");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Existe");
            e.printStackTrace();
        }

        return Email;
    }
     
    public String ConsultaPassword(String User) {
        String Pass = "";
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select password from usuarios where nombreuser  = '" + User + "' or email = '" + User + "';");
            while (resultado.next()) {
                Pass = resultado.getString("password");
            }
            //JOptionPane.showMessageDialog(null, "Existe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
            e.printStackTrace();
        }

        return Pass;
    } 
    
    public String ConsultaTipo(String User) {
        String Tipo = "";
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select tipouser from usuarios where nombreuser = '" + User + "' or email = '" + User + "';");
            while (resultado.next()) {
                Tipo = resultado.getString("tipouser");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Existe");
            e.printStackTrace();
        }

        return Tipo;
    }
}
