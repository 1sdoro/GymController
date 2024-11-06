/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

import com.mycompany.gymcontroller.modelo.Usuario;
import com.mycompany.gymcontroller.modelo.Usuario;
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
    private  List<Usuario> usuarios;

    public UsuarioController() 
    {
        usuarios = new ArrayList<>();
        cargarDatos();
    }
    
    // Crear
    public void agregarUsuario(Usuario usuario) 
    {
        usuarios.add(usuario);
        guardarDatos();
    }
    
    // Leer
    public Usuario obtenerUsuario(String usuario)
    {
        if(buscarUsuario(usuario)!=-1)
        {
            return usuarios.get(buscarUsuario(usuario));
        }
        else
        {
            return null;
        }
    }
    
     // Actualizar
    public void actualizarUsuarios(Usuario usuario) 
    {
        if(buscarUsuario(usuario.getUsuario()) != -1)
        {
            Usuario usuarioaux = obtenerUsuario(usuario.getUsuario());
            
            usuarioaux.setContrasennaUsuario(usuario.getContrasennaUsuario());
            usuarioaux.setNombreUsuario(usuario.getNombreUsuario());
            guardarDatos();
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
    
}
