/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

import com.mycompany.gymcontroller.modelo.Ejercicio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioController {

    private List<Ejercicio> ejercicios; // Lista principal de ejercicios
    private List<Ejercicio> ejerciciosSeleccionados; // Lista de ejercicios seleccionados

    private static final String FILE_NAME = "ejercicios.dat";

    public EjercicioController() {
        this.ejercicios = new ArrayList<>();
        this.ejerciciosSeleccionados = new ArrayList<>();
        cargarDatos(); // Carga datos al inicializar el controlador
    }

    // Método para agregar un ejercicio
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
        guardarDatos(); // Guarda los cambios en el archivo
    }

    // Método para obtener todos los ejercicios
    public List<Ejercicio> obtenerEjercicios() {
        return new ArrayList<>(ejercicios); // Retorna una copia para evitar modificaciones externas
    }

    // Método para actualizar un ejercicio por índice
    public void actualizarEjercicio(int index, Ejercicio nuevoEjercicio) {
        if (index >= 0 && index < ejercicios.size()) {
            ejercicios.set(index, nuevoEjercicio);
            guardarDatos(); // Guarda los cambios en el archivo
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Método para borrar un ejercicio por índice
    public void borrarEjercicio(int index) {
        if (index >= 0 && index < ejercicios.size()) {
            ejercicios.remove(index);
            guardarDatos(); // Guarda los cambios en el archivo
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Método para buscar un ejercicio por nombre
    public Ejercicio obtenerEjercicioPorNombre(String nombre) {
        for (Ejercicio e : ejercicios) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e; // Devuelve el ejercicio encontrado
            }
        }
        return null; // Si no se encuentra, retorna null
    }

    // Método para actualizar los ejercicios seleccionados
    public void actualizarEjerciciosSeleccionados(List<Ejercicio> seleccionados) {
        if (seleccionados == null || seleccionados.isEmpty()) {
            throw new IllegalArgumentException("La lista de ejercicios seleccionados no puede ser nula o vacía.");
        }
        this.ejerciciosSeleccionados.clear(); // Limpia la lista anterior
        this.ejerciciosSeleccionados.addAll(seleccionados); // Agrega los nuevos ejercicios
        System.out.println("Ejercicios seleccionados actualizados.");
    }

    // Método para obtener los ejercicios seleccionados
    public List<Ejercicio> getEjerciciosSeleccionados() {
        return new ArrayList<>(this.ejerciciosSeleccionados); // Retorna una copia para evitar modificaciones externas
    }

    // Método para cargar datos desde un archivo
    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            ejercicios = (List<Ejercicio>) ois.readObject();
            System.out.println("Datos cargados exitosamente desde el archivo.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se iniciará con una lista vacía.");
            // Agregar datos de prueba si el archivo no existe
            agregarEjercicio(new Ejercicio(1, "Sentadillas", "Fuerza", "Juan"));
            agregarEjercicio(new Ejercicio(2, "Trote", "Cardio", "Maria"));
            agregarEjercicio(new Ejercicio(3, "Estiramientos", "Flexibilidad", "Carlos"));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
            ejercicios = new ArrayList<>();
        }
    }

    // Método para guardar datos en un archivo
    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(ejercicios);
            System.out.println("Datos guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}




