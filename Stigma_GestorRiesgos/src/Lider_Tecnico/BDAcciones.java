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
//import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author Luis
 */
public class BDAcciones {
    static Connection Conection = null;
    static Statement Sentencia;
    static ResultSet Resultado;
    private Connection Conexion;
    
    public boolean ConectarAcciones() {
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

    public void DesconectarAcciones() {
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
    
    public ResultSet ConsultaRiesgos1(String C){
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idriesgo, nombre, acccontingencia  from riesgo where clave ='" + C + "';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public ResultSet ConsultaRiesgos(String C){
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select idriesgo, nombre, accmitigacion from riesgo where clave ='" + C + "';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public boolean AgregarMitigacion(Riesgo mRiesgo) {
        Statement consulta;

        try {
            consulta = Conexion.createStatement();
            consulta.execute("update riesgo set " + 
                        "accmitigacion = '" + mRiesgo.getMitigacion() + "'" +
                        " where clave = '" + mRiesgo.getID() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean AgregarContingencia(Riesgo mRiesgo) {
        Statement consulta;

        try {
            consulta = Conexion.createStatement();
            consulta.execute("update riesgo set " + 
                        "acccontingencia = '" + mRiesgo.getContingencia() + "'" +
                        " where clave = '" + mRiesgo.getID() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
