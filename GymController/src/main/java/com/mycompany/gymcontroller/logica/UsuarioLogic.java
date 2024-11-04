package com.mycompany.gymcontroller.logica;

import com.mycompany.gymcontroller.modelo.Usuario;
import com.mycompany.gymcontroller.controllers.UsuarioController;

/**
 *
 * @author Dorothea Ramirez
 */
public class UsuarioLogic
{
    private static UsuarioController usuarioController = new UsuarioController();
    
    public static boolean autentificarUsuario(String usuario, String contrasenna)
    {
        if (obtener(usuario) !=null)
        {
            Usuario usuarioConsulta=obtener(usuario);
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
    //metodos estaticos para que no se necesite crear nuevos objetos para acceder a los metodos :) 
    public static void agregar(Usuario usuario)
    {
        usuarioController.agregarUsuario(usuario);
    }
    
    public static boolean actulizar(Usuario usuario)
    {
        return usuarioController.actualizarUsuarios(usuario);
    }
    
    public static boolean eliminar(String usuario)
    {
        return usuarioController.borrarUsuario(usuario);
    }
    
    public static Usuario obtener(String usuario)
    {
        return usuarioController.obtenerUsuario(usuario);
    }
    
}
