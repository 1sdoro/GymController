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
    private static  List<Usuario> usuarios;

    public UsuarioController() 
    {
        usuarios = new ArrayList<>();
        cargarDatos();
    }
    
    // Crear
    public static void agregarUsuario(Usuario usuario) 
    {
        usuarios.add(usuario);
        guardarDatos();
    }
    
    // Leer
    public static Usuario obtenerUsuario(String usuario)
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
    public static boolean actualizarUsuarios(Usuario usuario) 
    {
        if(buscarUsuario(usuario.getUsuario()) != -1)
        {
            Usuario usuarioaux = obtenerUsuario(usuario.getUsuario());
            
            usuarioaux.setContrasennaUsuario(usuario.getContrasennaUsuario());
            usuarioaux.setCedulaUsuario(usuario.getCedulaUsuario());
            usuarioaux.setNombreUsuario(usuario.getNombreUsuario());
            guardarDatos();
        }
        return false;
    }
    
     // Borrar
    public static boolean borrarUsuario(String usuario) 
    {
        if (buscarUsuario(usuario) != -1)
        {
            usuarios.remove(buscarUsuario(usuario));
            guardarDatos();
            return true;
        }
        return false;
    }
    
     private static void cargarDatos() 
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
     
     private static  void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(usuarios);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
     
     public static int buscarUsuario(String usuario)
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
     
     public static boolean autentificarUsuario(String usuario, String contrasenna)
    {
        if (obtenerUsuario(usuario) !=null)
        {
            Usuario usuarioConsulta=obtenerUsuario(usuario);
            if (usuarioConsulta.getUsuario().equals(usuario)&& usuarioConsulta.getContrasennaUsuario().equals(contrasenna))
            {
                return true;
            }
        }
        else
        {
           return false;
        }
        return false;
    }
    
}
