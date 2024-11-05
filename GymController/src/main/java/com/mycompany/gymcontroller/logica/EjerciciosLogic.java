/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.logica;

import com.mycompany.gymcontroller.controllers.EjercicioController;
import com.mycompany.gymcontroller.modelo.Ejercicio;

/**
 *
 * @author Probo
 */
public class EjerciciosLogic {
    
    EjercicioController ec = new EjercicioController();
    //Funcion para agregar ejercicios al archivo plano
    public void agregarUsuario(Ejercicio ejercicio)
    {
        ec.agregarEjercicio(ejercicio);
    }
    
    
    
    
    
}
