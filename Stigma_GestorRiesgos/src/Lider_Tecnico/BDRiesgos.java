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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;

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

    public void DesconectarRiesgos() {
        try {
            this.Conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean AgregarRiesgo(Riesgo mRiesgo) {
        Statement consulta;
        Date Hoy = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy/MM/dd");
        try {
            
            consulta = Conexion.createStatement();
            String SQL = "INSERT INTO riesgos.riesgo "
                    + "(idriesgo,clave,nombre,detalles,npro,nimp,exposicion,accmitigacion,"
                    + "acccontingencia, fecharevicion, estado,nombreuser)"
                    + "VALUES ("
                    + "NULL" + ",'"
                    + mRiesgo.getClave() + "','" 
                    + mRiesgo.getTitulo() + "','" 
                    + mRiesgo.getDetalles() + "',"
                    + "0" + ","
                    + "0" + ","
                    + "0" + ",'"
                    + "-" + "','"
                    + "-" + "','"
                    + formatofecha.format(Hoy) + "','"
                    + "No Presentado" + "','"
                    + "-" + "'"
                    + ");";
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
    public boolean ModificarRiesgo(Riesgo mRiesgo, Riesgo nRiesgo){
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "UPDATE riesgos.riesgo SET " 
                    + "nombre = '" + nRiesgo.getTitulo()+ "'," 
                    + "detalles = '" + nRiesgo.getDetalles()+ "'"
                    + " where clave = '" + mRiesgo.getClave()+ "';";
            consulta.execute(SQL);
            return true; 
        } catch (Exception e) {
              e.printStackTrace();
            return false;
        }
    }
    
    public void ComboClaveProyecto(JComboBox CBProyecto){
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
            resultado = consulta.executeQuery("select idriesgo, nombre, detalles from riesgo where clave ='" + C + "';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
     
     public ResultSet Matriz(String C) {
        ArrayList mLista = new ArrayList();
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idriesgo, clave, nombre, npro, nimp, "
                    + "exposicion, accmitigacion, acccontingencia, fecharevicion, estado, nombreuser from riesgo"
                    + " where clave ='" + C + "';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
}