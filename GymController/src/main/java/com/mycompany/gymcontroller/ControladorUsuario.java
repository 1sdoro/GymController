/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller;

import com.mycompany.gymcontroller.usuario.UsuarioMembresia;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Probo
 */
public class ControladorUsuario {
    public class UsuarioMembresiaController {
    
   private static final String FILE_NAME = "ControladorDeUsuarios.dat";
    private List<UsuarioMembresia> Usuario;

    public UsuarioMembresiaController() {
        Usuario = new ArrayList<>();
        cargarDatos();
    }

    
    public void agregarUsuarioMembresia(UsuarioMembresia persona) {
        Usuario.add(persona);
        guardarDatos();
    }

    
    public List<UsuarioMembresia> obtenerUsuarioMembresias() {
        return Usuario;
    }

    
    public void actualizarUsuarioMembresia(int index, UsuarioMembresia nuevaUsuarioMembresia) {
        if (index >= 0 && index < Usuario.size()) {
            Usuario.set(index, nuevaUsuarioMembresia);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    
    public void borrarUsuarioMembresia(int index) {
        if (index >= 0 && index < Usuario.size()) {
            Usuario.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Usuario = (List<UsuarioMembresia>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(Usuario);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
