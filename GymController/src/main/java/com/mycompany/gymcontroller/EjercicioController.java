/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller;

/**
 *
 * @author William Arias
 */
import java.util.ArrayList;
import java.util.List;

public class EjercicioController {
    private final List<Ejercicio> ejercicios;

    public EjercicioController() {
        this.ejercicios = new ArrayList<>();
    }

    // Método para agregar un nuevo ejercicio
    public void agregarEjercicio(String nombre, int id, String categoria) {
        Ejercicio nuevoEjercicio = new Ejercicio(nombre, id, categoria);
        ejercicios.add(nuevoEjercicio);
        System.out.println("Ejercicio agregado: " + nombre);
    }

    // Método para buscar un ejercicio por ID
    public Ejercicio buscarEjercicio(int id) {
        for (Ejercicio ejercicio : ejercicios) {
            if (ejercicio.getId() == id) {
                return ejercicio;
            }
        }
        return null; // Retorna null si no se encuentra el ejercicio
    }

}

