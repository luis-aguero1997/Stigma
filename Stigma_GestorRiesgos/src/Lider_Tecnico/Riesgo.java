/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lider_Tecnico;

/**
 *
 * @author Luis
 */
public class Riesgo {
    private int ID;
    private String Clave;
    private String Titulo;
    private String Detalles;
    private int Npro;
    private int Nimp;
    private int Exp;
    private String Mitigacion;
    private String Contingencia;
    private String FechaRevicion;
    private String Estado;
    private int IdUsuario;
    private String NombreUser;

    public Riesgo() {
        ID = 0;
        Clave = "";
        Titulo = "";
        Detalles = "";
        Npro = 0;
        Nimp = 0;
        Exp = 0;
        Mitigacion = "";
        Contingencia = "";
        FechaRevicion = null;
        Estado = "";
        IdUsuario = 0;
        NombreUser = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public int getNpro() {
        return Npro;
    }

    public void setNpro(int Npro) {
        this.Npro = Npro;
    }

    public int getNimp() {
        return Nimp;
    }

    public void setNimp(int Nimp) {
        this.Nimp = Nimp;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int Exp) {
        this.Exp = Exp;
    }

    public String getMitigacion() {
        return Mitigacion;
    }

    public void setMitigacion(String Mitigacion) {
        this.Mitigacion = Mitigacion;
    }

    public String getContingencia() {
        return Contingencia;
    }

    public void setContingencia(String Contingencia) {
        this.Contingencia = Contingencia;
    }

    public String getFechaRevicion() {
        return FechaRevicion;
    }

    public void setFechaRevicion(String FechaRevicion) {
        this.FechaRevicion = FechaRevicion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUser() {
        return NombreUser;
    }

    public void setNombreUser(String NombreUser) {
        this.NombreUser = NombreUser;
    }
    
}
