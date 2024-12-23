/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gymcontroller.pantallas;

import com.mycompany.gymcontroller.controllers.EjercicioController;
import com.mycompany.gymcontroller.controllers.UsuarioController;
import com.mycompany.gymcontroller.modelo.Ejercicio;
import com.mycompany.gymcontroller.modelo.Rutina;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JCheckBox;

/**
 *
 * @author Dorothea Ramirez
 */
public class Principal extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    
    private List<JCheckBox> listaCheckBoxes; // Para almacenar los checkboxes creados
    private EjercicioController ec;          // Controlador para manejar los ejercicios
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);

    // Inicializar listaCheckBoxes y EjercicioController
    listaCheckBoxes = new ArrayList<>(); // Crear una lista vacía
    ec = new EjercicioController();     // Crear una instancia del controlador
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPrincipal = new javax.swing.JMenu();
        jmEjercicios = new javax.swing.JMenuItem();
        jmListaEjercicio = new javax.swing.JMenuItem();
        jmUsuariosC = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mPrincipal.setText("Mantenimiento");

        jmEjercicios.setText("Ejercicios");
        jmEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEjerciciosActionPerformed(evt);
            }
        });
        mPrincipal.add(jmEjercicios);

        jmListaEjercicio.setText("Lista Ejercicio");
        mPrincipal.add(jmListaEjercicio);

        jmUsuariosC.setText("Usuarios");
        jmUsuariosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosCActionPerformed(evt);
            }
        });
        mPrincipal.add(jmUsuariosC);

        jMenuBar1.add(mPrincipal);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmUsuariosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosCActionPerformed
        // TODO add your handling code here:
        ListaUsuarios  pUsuarios = new ListaUsuarios();
        this.setContentPane(pUsuarios);
        pUsuarios.setVisible(true);
    }//GEN-LAST:event_jmUsuariosCActionPerformed

    private void jmAgregarRutinaActionPerformed(java.awt.event.ActionEvent evt) {                                                
         // Verificar si `listaCheckBoxes` y `ec` están inicializados
    if (listaCheckBoxes == null || ec == null) {
        System.err.println("Error: listaCheckBoxes o ec no están inicializados.");
        return; // Salir del método si no están inicializados
    }

    // Obtener la lista de ejercicios seleccionados
    List<Ejercicio> ejerciciosSeleccionados = new ArrayList<>();
    for (JCheckBox checkBox : listaCheckBoxes) {
        if (checkBox.isSelected()) {
            Ejercicio ejercicio = ec.obtenerEjercicioPorNombre(checkBox.getText());
            if (ejercicio != null) {
                ejerciciosSeleccionados.add(ejercicio);
            }
        }
    }

    // Asegurarse de que `ec` es un EjercicioController
    EjercicioController ejercicioController = ec;

    
    SeleccionarRutinas seleccionarRutinasPanel = new SeleccionarRutinas(ejercicioController);


    // Establecer el panel como el contenido de la ventana
    this.setContentPane(seleccionarRutinasPanel);
    seleccionarRutinasPanel.setVisible(true);

    }                                               

    private void jmMostrarEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:

        PanelRutina jmMostrarEjercicios = new PanelRutina();
        this.setContentPane(jmMostrarEjercicios);
        jmMostrarEjercicios.setVisible(true);
    }                                                   

    private void jmEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEjerciciosActionPerformed
        // TODO add your handling code here:
        Ejercicios jmEjercicios = new Ejercicios();
        this.setContentPane(jmEjercicios);
        jmEjercicios.setVisible(true);
    }//GEN-LAST:event_jmEjerciciosActionPerformed

    private void jmCrearMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCrearMantenimientoActionPerformed
        // TODO add your handling code here:
        ListaEjercicios crearMantenimiento = new ListaEjercicios();
        this.setContentPane(crearMantenimiento);
        crearMantenimiento.setVisible(true);
    }//GEN-LAST:event_jmCrearMantenimientoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmEjercicios;
    private javax.swing.JMenuItem jmListaEjercicio;
    private javax.swing.JMenuItem jmUsuariosC;
    private javax.swing.JMenu mPrincipal;
    // End of variables declaration//GEN-END:variables

    private void setContentPaEjerciciosne(Ejercicios jmEjercicios) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Ejercicio> obtenerEjerciciosSeleccionados() {
    // Verificar que listaCheckBoxes no sea null
    if (listaCheckBoxes == null) {
        System.err.println("Error: listaCheckBoxes no está inicializada.");
        return Collections.emptyList(); // Retorna una lista vacía si no está inicializada
    }

    // Crear una lista para almacenar los ejercicios seleccionados
    List<Ejercicio> seleccionados = new ArrayList<>();

    // Iterar sobre los checkboxes para encontrar los seleccionados
    for (JCheckBox checkBox : listaCheckBoxes) {
        if (checkBox.isSelected()) {
            Ejercicio e = ec.obtenerEjercicioPorNombre(checkBox.getText());
            if (e != null) {
                seleccionados.add(e);
            }
        }
    }

    return seleccionados;
}

    private Ejercicio obtenerEjercicioDeCheckBox(JCheckBox checkBox) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
