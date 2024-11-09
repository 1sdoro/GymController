package com.mycompany.gymcontroller;

/**
 *
 * @author Probo
 */

import com.mycompany.gymcontroller.modelo.Administradores;
import com.mycompany.gymcontroller.modelo.UsuarioMembresia;
import com.mycompany.gymcontroller.modelo.Rutina;
import com.mycompany.gymcontroller.modelo.Membresia;
import com.mycompany.gymcontroller.modelo.Ejercicio;
import com.mycompany.gymcontroller.modelo.Usuario;
import com.mycompany.gymcontroller.pantallas.LogInUsuario;
import com.mycompany.gymcontroller.pantallas.RegistroUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GymController {

    public static void main(String[] args)
    {
        
        //creando los administradores
        Usuario doro = new Usuario("Doro", "isdoroo");
        Usuario will = new Usuario("William", "iswilliam");
        Usuario gaboo = new Usuario("Gaboo", "isgaboo");
        
        //creando la pantalla del login
//        LogInUsuario logpantalla = new LogInUsuario();
//        logpantalla.setVisible(true);
//        RegistroUsuarioGym s = new RegistroUsuarioGym();
//        s.setVisible(true);
//        //linea para que la pantalla se ubique en el medio
//        logpantalla.setLocationRelativeTo(null);
//        
//        // Inicializar ejercicios
//        List<Ejercicio> ejercicios = inicializarEjercicios();
//
//        // Crear membresías
//        List<Membresia> membresias = new ArrayList<>();
//        membresias.add(new Membresia(1, "Básica", 100, "Mensual"));
//        membresias.add(new Membresia(2, "Premium", 200, "Mensual"));
//
//        // Crear usuarios de membresía (Ejemplo)
//        List<UsuarioMembresia> usuariosMembresia = new ArrayList<>();
//        usuariosMembresia.add(new UsuarioMembresia(1, 1, new Date())); // Usa la fecha actual
//        usuariosMembresia.add(new UsuarioMembresia(2, 2, new Date())); // Usa la fecha actual
//
//        // Crear rutinas de ejercicios (Ejemplo)
//        Rutina rutina = new Rutina(1, 1, List.of(1, 2, 3), List.of(1, 2), "Rutina de Fuerza", 10);
//
//        // Generar una factura (Ejemplo)
//        String factura = generarFactura(usuariosMembresia.get(0), membresias.get(0));
//        System.out.println(factura);
//
//        // Imprimir todos los ejercicios (Ejemplo)
//        System.out.println("Ejercicios disponibles:");
//        for (Ejercicio ejercicio : ejercicios) {
//            System.out.println(ejercicio.getNombre());
//        }
    }

     private List<Ejercicio> listaEjercicios;

    public GymController() {
        listaEjercicios = new ArrayList<>();
        // Agrega aquí los ejercicios o llámalos desde otro método
    }
    
    private List<Ejercicio> ejercicios;

    {
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public List<Ejercicio> obtenerEjercicios() {
        return ejercicios;
    }

    
    // Método para inicializar ejercicios
    private static List<Ejercicio> inicializarEjercicios() {
        List<Ejercicio> ejercicios = new ArrayList<>();
        
        
        // Ejercicios de Fuerza
        ejercicios.add(new Ejercicio("Press de banca", 1));
        ejercicios.add(new Ejercicio("Sentadillas", 2));
        ejercicios.add(new Ejercicio("Peso muerto", 3));
        ejercicios.add(new Ejercicio("Press militar", 4));
        ejercicios.add(new Ejercicio("Curl de biceps", 5));
        ejercicios.add(new Ejercicio("Extensiones de triceps", 6));
        ejercicios.add(new Ejercicio("Remo con barra", 7));
        ejercicios.add(new Ejercicio("Elevacion de gemelos", 8));
        ejercicios.add(new Ejercicio("Dominadas", 9));
        ejercicios.add(new Ejercicio("Elevaciones laterales de hombros", 10));

        // Ejercicios de Cardio
        ejercicios.add(new Ejercicio("Correr en cinta", 11));
        ejercicios.add(new Ejercicio("Saltar la cuerda", 12));
        ejercicios.add(new Ejercicio("Eliptica", 13));
        ejercicios.add(new Ejercicio("Remo", 14));
        ejercicios.add(new Ejercicio("Ciclismo", 15));
        ejercicios.add(new Ejercicio("Burpees", 16));
        ejercicios.add(new Ejercicio("Mountain climbers", 17));
        ejercicios.add(new Ejercicio("Box jumps", 18));
        ejercicios.add(new Ejercicio("Sprints", 19));
        ejercicios.add(new Ejercicio("Escaladora", 20));

        // Ejercicios de Flexibilidad
        ejercicios.add(new Ejercicio("Estiramientos de piernas", 21));
        ejercicios.add(new Ejercicio("Yoga", 22));
        ejercicios.add(new Ejercicio("Estiramientos de brazos", 23));
        ejercicios.add(new Ejercicio("Estiramientos de espalda", 24));
        ejercicios.add(new Ejercicio("Estiramientos de cuello", 25));
        ejercicios.add(new Ejercicio("Rotaciones de tronco", 26));
        ejercicios.add(new Ejercicio("Flexiones hacia adelante", 27));
        ejercicios.add(new Ejercicio("Flexiones laterales", 28));
        ejercicios.add(new Ejercicio("Movilidad de hombros", 29));
        ejercicios.add(new Ejercicio("Postura del nino", 30));

        // Ejercicios de Equilibrio
        ejercicios.add(new Ejercicio("Plancha", 31));
        ejercicios.add(new Ejercicio("Equilibrio en una pierna", 32));
        ejercicios.add(new Ejercicio("Elevaciones de talones", 33));
        ejercicios.add(new Ejercicio("Postura del arbol (Yoga)", 34));
        ejercicios.add(new Ejercicio("Desplantes", 35));
        ejercicios.add(new Ejercicio("Sentadilla con una pierna", 36));
        ejercicios.add(new Ejercicio("Paso lateral con goma", 37));
        ejercicios.add(new Ejercicio("Balanceo sobre Bosu", 38));
        ejercicios.add(new Ejercicio("Plank con levantamiento de pierna", 39));
        ejercicios.add(new Ejercicio("Kettlebell swings", 40));

        // Ejercicios de Resistencia
        ejercicios.add(new Ejercicio("Circuito de pesas", 41));
        ejercicios.add(new Ejercicio("CrossFit", 42));
        ejercicios.add(new Ejercicio("Battle ropes", 43));
        ejercicios.add(new Ejercicio("Slam ball", 44));
        ejercicios.add(new Ejercicio("Flexiones con rotacion", 45));
        ejercicios.add(new Ejercicio("Kettlebell thrusters", 46));
        ejercicios.add(new Ejercicio("Man makers", 47));
        ejercicios.add(new Ejercicio("Rope climbing", 48));
        ejercicios.add(new Ejercicio("Farmer's carry", 49));
        ejercicios.add(new Ejercicio("Ski erg", 50));

        return ejercicios;
    }
    

    // Método para generar factura
    private static String generarFactura(UsuarioMembresia usuarioMembresia, Membresia membresia) {
        return "Factura:\n" +
               "ID Usuario: " + usuarioMembresia.getIdUsuario() + "\n" +
               "Nombre Membresía: " + membresia.getNombre() + "\n" +
               "Precio: $" + membresia.getPrecio() + "\n" +
               "Tipo: " + membresia.getTipo() + "\n" +
               "Fecha Inicio: " + usuarioMembresia.getFechaInicio() + "\n";
    }

    public void LogInUsuario(LogInUsuario u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //public void agregarEjercicio(Ejercicio ejercicio) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}