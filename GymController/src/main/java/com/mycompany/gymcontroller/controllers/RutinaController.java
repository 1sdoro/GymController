/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

/**
 *
 * @author William Arias
 */

import com.mycompany.gymcontroller.modelo.Rutina;
import com.mycompany.gymcontroller.modelo.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RutinaController {

    private static final String FILE_NAME = "rutinas.dat";
    private List<Rutina> rutinas;

    public RutinaController() {
        rutinas = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
        guardarDatos();
    }

    // Leer
    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }

    // Actualizar
    public void actualizarRutina(int index, Rutina nuevaRutina) {
        if (index >= 0 && index < rutinas.size()) {
            rutinas.set(index, nuevaRutina);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarRutina(int index) {
        if (index >= 0 && index < rutinas.size()) {
            rutinas.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            rutinas = (List<Rutina>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(rutinas);
        } catch (IOException e) {
        }
    }
    
//     public Usuario obtenerUsuarioR(String usuarioNombre) 
//     {
//         for (Usuario usuario : usuarios) 
//         {
//             if (usuario.getNombreUsuario().equals(usuarioNombre))
//             {
//                 return usuario;
//             }
//         }
//         return null;
//     }
//    
//    pasar obtener a rutinaC
//    public void asignarRutinaAUsuario(String usuarioNombre, Rutina rutina) {
//    Usuario usuario = obtenerUsuarioR(usuarioNombre);
//    if (usuario != null) {
//        usuario.agregarRutina(rutina);
//        guardarDatos();  // Guardar cambios en el archivo
//    } else {
//        System.out.println("Usuario no encontrado.");
//    }
//}
    
}

