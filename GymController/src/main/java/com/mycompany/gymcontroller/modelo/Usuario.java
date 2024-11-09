package com.mycompany.gymcontroller.modelo;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Probo
 */
public class Usuario {
    private boolean isAdmin;
    private String adminNombre;
    private String adminContra;
    private String nombreUsuario;
    private String usuario;
    private String contrasennaUsuario;

    public Usuario(String adminNombre, String adminContra) {
        this.adminNombre = adminNombre;
        this.adminContra = adminContra;
    }

    public String getAdminNombre() {
        return adminNombre;
    }

    public void setAdminNombre(String adminNombre) {
        this.adminNombre = adminNombre;
    }

    public String getAdminContra() {
        return adminContra;
    }

    public void setAdminContra(String adminContra) {
        this.adminContra = adminContra;
    }

    
    
    public Usuario(boolean isAdmin, String nombreUsuario, String usuario, String contrasennaUsuario)
    {
        this.isAdmin=isAdmin;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.contrasennaUsuario = contrasennaUsuario;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    
    
    public Usuario(boolean isAdmin, String nombre, int Apellido) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
    
    private List<Rutina> rutinas;  // Lista de rutinas asignadas al usuario

public Usuario() {
    rutinas = new ArrayList<>();  // Inicializar lista
}

public void agregarRutina(Rutina rutina) {
    rutinas.add(rutina);
}

public List<Rutina> getRutinas() {
    return rutinas;
}
}

