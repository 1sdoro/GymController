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
import com.mycompany.gymcontroller.pantallas.Principal;
import com.mycompany.gymcontroller.pantallas.RegistroUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GymController {
    

    public static void main(String[] args)
    {
        LogInUsuario log = new LogInUsuario();
        log.setVisible(true);
    }

}