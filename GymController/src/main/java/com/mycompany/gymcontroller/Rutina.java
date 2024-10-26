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

public class Rutina {
    // Atributos
    private int id;
    private int idUsuario;
    private List<Integer> dias; // Podría ser una lista de días de la semana (1-7)
    private List<Integer> idEjercicio; // Lista de IDs de ejercicios
    private String nombre;
    private int repeticiones;

    // Constructor
    public Rutina(int id, int idUsuario, List<Integer> dias, List<Integer> idEjercicio, String nombre, int repeticiones) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.dias = dias;
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.repeticiones = repeticiones;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public List<Integer> getDias() {
        return dias;
    }

    public List<Integer> getIdEjercicio() {
        return idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setDias(List<Integer> dias) {
        this.dias = dias;
    }

    public void setIdEjercicio(List<Integer> idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    // Método para asignar un ejercicio a un usuario
    public void asignarEjercicio(int idEjercicio) {
        if (!this.idEjercicio.contains(idEjercicio)) {
            this.idEjercicio.add(idEjercicio);
        } else {
            System.out.println("El ejercicio ya está asignado a esta rutina.");
        }
    }

    // Método para inicializar una rutina de ejemplo
    public static Rutina crearRutinaEjemplo() {
        List<Integer> dias = new ArrayList<>();
        dias.add(1); // Lunes
        dias.add(3); // Miércoles
        dias.add(5); // Viernes

        List<Integer> idEjercicios = new ArrayList<>();
        idEjercicios.add(1); // ID de "Press de banca"
        idEjercicios.add(2); // ID de "Sentadillas"

        return new Rutina(1, 101, dias, idEjercicios, "Rutina de Fuerza", 10);
    }
}
