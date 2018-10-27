/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lider_Tecnico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
  @author Stigma
**/
public class BDRiesgos {
    
    static Connection Conection = null;
    static Statement Sentencia;
    static ResultSet Resultado;
    private Connection Conexion;
    
    public boolean ConectarRiesgos() {
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

    public void DesconectarRiesgos() {
        try {
            this.Conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean AgregarRiesgo(Riesgo mRiesgo) {
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "INSERT INTO riesgos.riesgo "
                    + "(clave,titulo,detalles) "
                    + "VALUES ('"
                    + mRiesgo.getClave() + "','" 
                    + mRiesgo.getTitulo() + "','" 
                    + mRiesgo.getDetalles() + "');";
            consulta.execute(SQL);
            return true; 
        } catch (Exception e) {
              e.printStackTrace();
            return false;
        }
    }
    
    public boolean EliminarRiesgo(int ID){
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            consulta.execute("delete from riesgo"
                    + " where idriesgo = " + ID + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}