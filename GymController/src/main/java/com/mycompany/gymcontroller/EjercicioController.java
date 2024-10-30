/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller;

/**
 *
 * @author William Arias
 */

import com.mycompany.gymcontroller.Ejercicio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioController {

    private static final String FILE_NAME = "ejercicios.dat";
    private List<Ejercicio> ejercicios;

    public EjercicioController() {
        ejercicios = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
        guardarDatos();
    }

    // Leer
    public List<Ejercicio> obtenerEjercicios() {
        return ejercicios;
    }

    // Actualizar
    public void actualizarEjercicio(int index, Ejercicio nuevoEjercicio) {
        if (index >= 0 && index < ejercicios.size()) {
            ejercicios.set(index, nuevoEjercicio);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarEjercicio(int index) {
        if (index >= 0 && index < ejercicios.size()) {
            ejercicios.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            ejercicios = (List<Ejercicio>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(ejercicios);
        } catch (IOException e) {
        }
    }
}


