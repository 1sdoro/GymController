/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymcontroller.modelo;

/**
 *
 * @author William Arias
 */

import java.io.Serializable;
import java.util.Date;

public class Factura implements Serializable{
    // Atributos
    private int idFactura;
    private int idUsuario;
    private int idMembresia;
    private Date fechaEmision;
    private double total; // aca si en la factura pongo decimales profe

    // Constructor
    public Factura(int idFactura, int idUsuario, int idMembresia, Date fechaEmision, double total) {
        this.idFactura = idFactura;
        this.idUsuario = idUsuario;
        this.idMembresia = idMembresia;
        this.fechaEmision = fechaEmision;
        this.total = total;
    }

    // Getters
    public int getIdFactura() {
        return idFactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public double getTotal() {
        return total;
    }

    // Setters
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método para imprimir la factura
    public void imprimirFactura() {
        System.out.println("Factura ID: " + idFactura);
        System.out.println("Usuario ID: " + idUsuario);
        System.out.println("Membresía ID: " + idMembresia);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Total a Pagar: $" + total);
    }
}
