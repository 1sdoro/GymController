/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller;

/**
 *
 * @author William Arias
 */

import java.util.Date;

public class UsuarioMembresia {
    // Atributos
    private int idUsuario;
    private int idMembresia;
    private Date fechaInicio;

    // Constructor principal
    public UsuarioMembresia(int idUsuario, int idMembresia, Date fechaInicio) {
        this.idUsuario = idUsuario;
        this.idMembresia = idMembresia;
        this.fechaInicio = fechaInicio;
    }

    // Constructor adicional sin fecha (usará la fecha actual)
    public UsuarioMembresia(int idUsuario, int idMembresia) {
        this.idUsuario = idUsuario;
        this.idMembresia = idMembresia;
        this.fechaInicio = new Date(); // Asignar fecha actual
    }

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}

