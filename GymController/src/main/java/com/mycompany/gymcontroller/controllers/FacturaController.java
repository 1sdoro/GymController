/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.controllers;

/**
 *
 * @author William Arias
 */

import com.mycompany.gymcontroller.modelo.Factura;
import com.mycompany.gymcontroller.modelo.Factura;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacturaController {
    private List<Factura> facturas;

    public FacturaController() {
        facturas = new ArrayList<>();
    }

    // Crear una nueva factura
    public void crearFactura(int idFactura, int idUsuario, int idMembresia, double total) {
        Factura nuevaFactura = new Factura(idFactura, idUsuario, idMembresia, new Date(), total);
        facturas.add(nuevaFactura);
    }

    // Imprimir todas las facturas
    public void imprimirFacturas() {
        for (Factura factura : facturas) {
            factura.imprimirFactura();
            System.out.println(); // Para un espacio entre las facturas
        }
    }

    
}

