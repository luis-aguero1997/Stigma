/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

/**
 *
 * @author Stigma
 */
public class Usuario {
    private String Nombre;
    private String NomUser;
    private String Email;
    private String Password;
    private String TipoUser;

    public Usuario() {
        Nombre = "";
        NomUser = "";
        Email = "";
        Password = "";
        TipoUser = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNomUser() {
        return NomUser;
    }

    public void setNomUser(String NomUser) {
        this.NomUser = NomUser;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTipoUser() {
        return TipoUser;
    }

    public void setTipoUser(String TipoUser) {
        this.TipoUser = TipoUser;
    }
    
    
}
