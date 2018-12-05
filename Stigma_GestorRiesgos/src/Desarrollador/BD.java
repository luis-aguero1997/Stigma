/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
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
    public void ConsultarCombo(JComboBox CBProyecto)
    {
        Statement consulta;
        ResultSet resultado = null;
        
        try{
            String SQL = "select clave from proyecto order by clave";
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery(SQL);
            CBProyecto.addItem("Seleccione un Proyecto");
            
            while(resultado.next()){
                CBProyecto.addItem(resultado.getString("clave"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    public ResultSet ConsultaRiesgos(String C){
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idriesgo, nombre, estado, fecharevicion from riesgo "
                    + "where nombreuser ='" + Usuario.User + "';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public ResultSet ConsultaRiesgos2(String C){
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idriesgo, nombre, npro, nimp, exposicion from riesgo "
                    + "where nombreuser ='" + Usuario.User 
                    + "' AND clave ='" + C + "'"
                    + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public boolean AltaSeguimiento(Riesgo mR){
        Statement consulta;
        String sql = "";
        try {
            consulta = Conexion.createStatement();
            sql = "update riesgo set " + 
                        "estado = '" + mR.getEstado() + "'," +
                        "fecharevicion = '" + mR.getFechaRevicion() + "'" +
                        " where idriesgo = '" + mR.getID() + "';";
            consulta.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean AltaPIE(Riesgo mR){
        Statement consulta;
        String sql = "";
        try {
            consulta = Conexion.createStatement();
            sql = "update riesgo set " + 
                        "npro = '" + mR.getNpro() + "'," +
                        "nimp = '" + mR.getNimp() + "'," +
                        "exposicion = '" + mR.getExp() + "'" +
                        "where idriesgo = '" + mR.getID() + "';";
            consulta.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
