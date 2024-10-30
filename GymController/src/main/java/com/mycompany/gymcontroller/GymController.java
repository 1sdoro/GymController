/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gymcontroller;

/**
 *
 * @author Probo
 */

import com.mycompany.gymcontroller.pantallas.LogInUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GymController {

    public static void main(String[] args)
    {
        //creando la pantalla del login
        LogInUsuario logpantalla = new LogInUsuario();
        logpantalla.setVisible(true);
        //linea para que la pantalla se ubique en el medio
        logpantalla.setLocationRelativeTo(null);
        
        // Inicializar ejercicios
        List<Ejercicio> ejercicios = inicializarEjercicios();

        // Crear membresías
        List<Membresia> membresias = new ArrayList<>();
        membresias.add(new Membresia(1, "Básica", 100, "Mensual"));
        membresias.add(new Membresia(2, "Premium", 200, "Mensual"));

        // Crear usuarios de membresía (Ejemplo)
        List<UsuarioMembresia> usuariosMembresia = new ArrayList<>();
        usuariosMembresia.add(new UsuarioMembresia(1, 1, new Date())); // Usa la fecha actual
        usuariosMembresia.add(new UsuarioMembresia(2, 2, new Date())); // Usa la fecha actual

        // Crear rutinas de ejercicios (Ejemplo)
        Rutina rutina = new Rutina(1, 1, List.of(1, 2, 3), List.of(1, 2), "Rutina de Fuerza", 10);

        // Generar una factura (Ejemplo)
        String factura = generarFactura(usuariosMembresia.get(0), membresias.get(0));
        System.out.println(factura);

        // Imprimir todos los ejercicios (Ejemplo)
        System.out.println("Ejercicios disponibles:");
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(ejercicio.getNombre());
        }
    }

    // Método para inicializar ejercicios
    private static List<Ejercicio> inicializarEjercicios() {
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

    // Método para generar factura
    private static String generarFactura(UsuarioMembresia usuarioMembresia, Membresia membresia) {
        return "Factura:\n" +
               "ID Usuario: " + usuarioMembresia.getIdUsuario() + "\n" +
               "Nombre Membresía: " + membresia.getNombre() + "\n" +
               "Precio: $" + membresia.getPrecio() + "\n" +
               "Tipo: " + membresia.getTipo() + "\n" +
               "Fecha Inicio: " + usuarioMembresia.getFechaInicio() + "\n";
    }
}
