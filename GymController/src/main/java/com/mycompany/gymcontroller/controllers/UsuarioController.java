/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

import com.mycompany.gymcontroller.modelo.Ejercicio;
import com.mycompany.gymcontroller.modelo.Rutina;
import com.mycompany.gymcontroller.modelo.Usuario;
import com.mycompany.gymcontroller.modelo.Usuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
 * @author Dorothea Ramirez
 */
public class UsuarioController 
{
    private static final String FILE_NAME = "usuarios.dat";
    private static final String ID_FILE_NAME = "ultimoId.dat";
    private static int ultimoId = 0; // Variable estática para llevar la cuenta del último ID
    private  List<Usuario> usuarios;

    public UsuarioController() 
    {
        usuarios = new ArrayList<>();
        cargarDatos();
        cargarUltimoId(); // Cargar el último ID utilizado
    }
    
    private int generarNuevoId() {
        return ++ultimoId; // Incrementar y devolver el nuevo ID
    }
    
    // Crear
    public void agregarUsuario(Usuario usuario) 
    {
        
        usuario.setId(generarNuevoId()); // Asignar un nuevo ID al usuario
        usuarios.add(usuario);
        guardarDatos();
        guardarUltimoId();
    }
    
    // Leer
   public List<Usuario> obtenerUsuarioList()
   {
        return usuarios;
    }
      
     // Actualizar
  public void actualizarUsuario(int index, Usuario nuevoUsuario) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.set(index, nuevoUsuario);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    
     // Borrar
    public void borrarUsuario(String usuario) 
    {
        if (buscarUsuario(usuario) != -1)
        {
            usuarios.remove(buscarUsuario(usuario));
            guardarDatos();
        }
    }
    
     private void cargarDatos() 
     {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (FileNotFoundException e) 
        {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
     
     private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(usuarios);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
     
     public int buscarUsuario(String usuario)
     {
         int n= 0;
         for (int i = 0; i < usuarios.size(); i++) 
         {
             if(usuarios.get(i).getUsuario().equals(usuario))
             {
                 n=i;
                 break;
             }
         }
         return n;
     }
     
     public  Usuario autentificarUsuario(String usuario, String contrasenna)
    {
       for (Usuario usuariosConsult : usuarios) 
            {
                if (usuariosConsult.getNombreUsuario().equals(usuario) && usuariosConsult.getContrasennaUsuario().equals(contrasenna)) 
                {
                   return usuariosConsult;
                } 
            }
       return null;
    }
     
     
     public Usuario obtenerUsuarioR(String usuarioNombre) 
     {
         for (Usuario usuario : usuarios) 
         {
             if (usuario.getNombreUsuario().equals(usuarioNombre))
             {
                 return usuario;
             }
         }
         return null;
     }
     
     public void asignarRutinaAUsuario(String usuarioNombre, Rutina rutina) {
    Usuario usuario = obtenerUsuarioR(usuarioNombre);
    if (usuario != null) {
        usuario.agregarRutina(rutina);
        guardarDatos();  // Guardar cambios en el archivo
    } else {
        System.out.println("Usuario no encontrado.");
    }
}
     
     private void guardarUltimoId()
     {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ultimoId.dat"))) 
        {
            dos.writeInt(ultimoId);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
     
     private void cargarUltimoId()
     {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("ultimoId.dat"))) 
        {
            ultimoId = dis.readInt();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Archivo de último ID no encontrado, se creará uno nuevo.");
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
     }

    public void asignarEjercicioAUsuario(String usuario, Ejercicio ejercicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
