/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.modelo;

import java.io.Serializable;

/**
 *
 * @author William Arias
 */

public class Ejercicio implements Serializable{
    private int id;
    private String nombre;
    private String categoria;

    // Constructor
    public Ejercicio(String nombre, String categoria) {
        this.id = (int) Math.random();
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
