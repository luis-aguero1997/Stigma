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
}