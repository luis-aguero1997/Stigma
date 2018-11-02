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
public class BDProyecto {
    
    static Connection Conection = null;
    static Statement Sentencia;
    static ResultSet Resultado;
    private Connection Conexion;
    
    public boolean ConectarProyecto() {
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

    public void DesconectarProyecto() {
        try {
            this.Conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean AgregarProyecto(Proyecto mProyecto) {
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "INSERT INTO riesgos.proyecto "
                    + "(clave,nombre,descripcion,fecha_inicio,fecha_fin) "
                    + "VALUES ('"
                    + mProyecto.getClave() + "','"
                    + mProyecto.getNombre() + "','" 
                    + mProyecto.getDescripcion() + "','" 
                    + mProyecto.getFechaInicio() + "','" 
                    + mProyecto.getFechaFin() + "');";
            consulta.execute(SQL);
            return true; 
        } catch (Exception e) {
              e.printStackTrace();
            return false;
        }
    }
    
    public boolean EliminarProyecto(String Clave) {
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            consulta.execute("delete from proyecto"
                    + " where clave = '" + Clave + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }        
    }
    
    public ResultSet ConsultaProyectos() {
        ArrayList mLista = new ArrayList();
        Proyecto mProyecto = new Proyecto();
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from proyecto;");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public ResultSet ConsultaFiltroP(String Criterio) {
        ArrayList mLista = new ArrayList();
        Proyecto mProyecto = new Proyecto();
        Statement consulta;
        ResultSet resultado = null;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from Proyecto where clave like '%" + Criterio + "%' "
                    + "or nombre like '%" + Criterio + "%';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
     public boolean ModificarProyecto(Proyecto mProyecto, Proyecto nProyecto){
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "UPDATE riesgos.Proyecto SET " 
                    + "nombre = '" + nProyecto.getNombre()+ "'"
                    + "descripcion = '" + nProyecto.getDescripcion()+ "'"
                    + "fecha_inicio = '" + nProyecto.getFechaInicio()+ "'"
                    + "fecha_fin = '" + nProyecto.getFechaFin()+ "'"
                    + " where clave = '" + mProyecto.getClave()+ "';";
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
    
}
