package com.mycompany.gymcontroller.modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Probo
 */
public class Usuario {
    private int cedulaUsuario;
    private String nombreUsuario;
    private String usuario;
    private String contrasennaUsuario;

    public Usuario(int cedulaUsuario, String nombreUsuario, String usuario, String contrasennaUsuario)
    {
        this.cedulaUsuario = cedulaUsuario;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.contrasennaUsuario = contrasennaUsuario;
    }

    public Usuario(int Cedula, String nombre, int Apellido) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasennaUsuario() {
        return contrasennaUsuario;
    }

    public void setContrasennaUsuario(String contrasennaUsuario) {
        this.contrasennaUsuario = contrasennaUsuario;
    }
}
