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

public class Ejercicio implements Serializable {
    private int id;
    private String nombre;
    private String categoria;
    private String usuario; // Declaramos la variable 'usuario' correctamente.
    private int repeticiones;

    // Constructor con parámetros para nombre, categoría y usuario
    public Ejercicio(String nombre, String categoria) {
    this.id = (int) (Math.random() * 1000); // Genera un id aleatorio
    this.nombre = nombre;
    this.categoria = categoria;
    this.usuario = ""; // Asigna un valor por defecto o null si lo prefieres
}

    // Constructor adicional para pruebas u otros usos
    public Ejercicio(int id, String nombre, String categoria, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.usuario = usuario;
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

    public String getUsuario() {
        return usuario != null ? usuario : ""; // Aseguramos que no devuelva null, sino una cadena vacía si el usuario no está definido
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

    public void setUsuario(String usuario) {
        this.usuario = usuario; // Asigna el valor recibido al atributo 'usuario'
    }

    public void setRepeticiones(int repeticiones) {
        if (repeticiones < 0) {
            throw new IllegalArgumentException("Las repeticiones no pueden ser negativas.");
        }
        this.repeticiones = repeticiones;
    }

    public int getRepeticiones() {
        return this.repeticiones;
    }
}
