/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

import com.mycompany.gymcontroller.modelo.Administradores;
import com.mycompany.gymcontroller.modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorothea Ramirez
 */
public class AdminController 
{
    private static final String FILE_NAME = "administradores.dat";
    private static  List<Administradores> administradores;
    
     public AdminController() 
    {
        administradores = new ArrayList<>();
        cargarDatos();
    }
     
     private static void cargarDatos() 
     {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            administradores = (List<Administradores>) ois.readObject();
        } catch (FileNotFoundException e) 
        {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
    
    public static Administradores obtenerAdministrador(String administrador)
    {
        if(buscarAdministrador(administrador)!= -1)
        {
            return administradores.get(buscarAdministrador(administrador));
        }
        else
        {
            return null;
        }
    }
    
    public static int buscarAdministrador(String administrador)
     {
         int n= 0;
         for (int i = 0; i < administradores.size(); i++) 
         {
             if(administradores.get(i).getAdministrador().equals(administrador))
             {
                 n=i;
                 break;
             }
         }
         return n;
     }
    
    public static boolean autentificarAdministrador(String administrador, String contrasenna)
    {
        if (obtenerAdministrador(administrador) !=null)
        {
            Administradores administradorConsulta=obtenerAdministrador(administrador);
            if (administradorConsulta.getAdministrador().equals(administrador)&& administradorConsulta.getContrasennaAdm().equals(contrasenna))
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
