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

public class Ejercicio {
    // Atributos
    private int id;
    private String nombre;
    private String categoria;

    // Constructor
    public Ejercicio(int id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    Ejercicio(String nombre, int id, String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    // Método para inicializar la lista de ejercicios
    public static List<Ejercicio> inicializarEjercicios() {
        List<Ejercicio> ejercicios = new ArrayList<>();

        // Ejercicios de Fuerza
        ejercicios.add(new Ejercicio(1, "Press de banca", "Fuerza"));
        ejercicios.add(new Ejercicio(2, "Sentadillas", "Fuerza"));
        ejercicios.add(new Ejercicio(3, "Peso muerto", "Fuerza"));
        ejercicios.add(new Ejercicio(4, "Press militar", "Fuerza"));
        ejercicios.add(new Ejercicio(5, "Curl de biceps", "Fuerza"));
        ejercicios.add(new Ejercicio(6, "Extensiones de triceps", "Fuerza"));
        ejercicios.add(new Ejercicio(7, "Remo con barra", "Fuerza"));
        ejercicios.add(new Ejercicio(8, "Elevacion de gemelos", "Fuerza"));
        ejercicios.add(new Ejercicio(9, "Dominadas", "Fuerza"));
        ejercicios.add(new Ejercicio(10, "Elevaciones laterales de hombros", "Fuerza"));

        // Ejercicios de Cardio
        ejercicios.add(new Ejercicio(11, "Correr en cinta", "Cardio"));
        ejercicios.add(new Ejercicio(12, "Saltar la cuerda", "Cardio"));
        ejercicios.add(new Ejercicio(13, "Eliptica", "Cardio"));
        ejercicios.add(new Ejercicio(14, "Remo", "Cardio"));
        ejercicios.add(new Ejercicio(15, "Ciclismo", "Cardio"));
        ejercicios.add(new Ejercicio(16, "Burpees", "Cardio"));
        ejercicios.add(new Ejercicio(17, "Mountain climbers", "Cardio"));
        ejercicios.add(new Ejercicio(18, "Box jumps", "Cardio"));
        ejercicios.add(new Ejercicio(19, "Sprints", "Cardio"));
        ejercicios.add(new Ejercicio(20, "Escaladora", "Cardio"));

        // Ejercicios de Flexibilidad
        ejercicios.add(new Ejercicio(21, "Estiramientos de piernas", "Flexibilidad"));
        ejercicios.add(new Ejercicio(22, "Yoga", "Flexibilidad"));
        ejercicios.add(new Ejercicio(23, "Estiramientos de brazos", "Flexibilidad"));
        ejercicios.add(new Ejercicio(24, "Estiramientos de espalda", "Flexibilidad"));
        ejercicios.add(new Ejercicio(25, "Estiramientos de cuello", "Flexibilidad"));
        ejercicios.add(new Ejercicio(26, "Rotaciones de tronco", "Flexibilidad"));
        ejercicios.add(new Ejercicio(27, "Flexiones hacia adelante", "Flexibilidad"));
        ejercicios.add(new Ejercicio(28, "Flexiones laterales", "Flexibilidad"));
        ejercicios.add(new Ejercicio(29, "Movilidad de hombros", "Flexibilidad"));
        ejercicios.add(new Ejercicio(30, "Postura del nino", "Flexibilidad"));

        // Ejercicios de Equilibrio
        ejercicios.add(new Ejercicio(31, "Plancha", "Equilibrio"));
        ejercicios.add(new Ejercicio(32, "Equilibrio en una pierna", "Equilibrio"));
        ejercicios.add(new Ejercicio(33, "Elevaciones de talones", "Equilibrio"));
        ejercicios.add(new Ejercicio(34, "Postura del arbol (Yoga)", "Equilibrio"));
        ejercicios.add(new Ejercicio(35, "Desplantes", "Equilibrio"));
        ejercicios.add(new Ejercicio(36, "Sentadilla con una pierna", "Equilibrio"));
        ejercicios.add(new Ejercicio(37, "Paso lateral con goma", "Equilibrio"));
        ejercicios.add(new Ejercicio(38, "Balanceo sobre Bosu", "Equilibrio"));
        ejercicios.add(new Ejercicio(39, "Plank con levantamiento de pierna", "Equilibrio"));
        ejercicios.add(new Ejercicio(40, "Kettlebell swings", "Equilibrio"));

        // Ejercicios de Resistencia
        ejercicios.add(new Ejercicio(41, "Circuito de pesas", "Resistencia"));
        ejercicios.add(new Ejercicio(42, "CrossFit", "Resistencia"));
        ejercicios.add(new Ejercicio(43, "Battle ropes", "Resistencia"));
        ejercicios.add(new Ejercicio(44, "Slam ball", "Resistencia"));
        ejercicios.add(new Ejercicio(45, "Flexiones con rotacion", "Resistencia"));
        ejercicios.add(new Ejercicio(46, "Kettlebell thrusters", "Resistencia"));
        ejercicios.add(new Ejercicio(47, "Man makers", "Resistencia"));
        ejercicios.add(new Ejercicio(48, "Rope climbing", "Resistencia"));
        ejercicios.add(new Ejercicio(49, "Farmer's carry", "Resistencia"));
        ejercicios.add(new Ejercicio(50, "Ski erg", "Resistencia"));

        return ejercicios;
    }
}



