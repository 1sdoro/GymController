/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gymcontroller.pantallas;

import com.mycompany.gymcontroller.controllers.EjercicioController;
import com.mycompany.gymcontroller.modelo.Ejercicio;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PanelRutina extends javax.swing.JPanel {

    private EjercicioController ec = new EjercicioController();
    private List<JCheckBox> listaCheckBoxes = new ArrayList<>();

    /**
     * Creates new form PanelRutina
     */
    public PanelRutina() {
        initComponents();
        cargarDatos("");
     
    }
    
    public void cargarDatos(String categoria) {
    // Obtener la lista de ejercicios desde el controlador
    List<Ejercicio> array = ec.obtenerEjercicios();

    // Filtrar si se pasa una categoría
    if (!categoria.isEmpty()) {
        Optional<Ejercicio> o = array.stream()
                                     .filter(e -> e.getCategoria().equals(categoria))
                                     .findAny();
        array = o.map(List::of).map(ArrayList::new).orElseGet(ArrayList::new);
    }

    // Debugging para verificar ejercicios cargados
    System.out.println("Ejercicios cargados: " + array.size());

    // Limpiar el panel dinámico y la lista de checkboxes
    panelCheckBoxes.removeAll();
    listaCheckBoxes.clear();

    // Crear un JPanel para contener los elementos de cada ejercicio
    JPanel containerPanel = new JPanel();
    containerPanel.setLayout(new GridLayout(0, 3, 10, 10)); // 3 columnas: checkbox, etiqueta, campo de texto

    // Crear un JCheckBox y un JTextField por cada ejercicio
    for (Ejercicio e : array) {
        JCheckBox checkBox = new JCheckBox(e.getNombre());
        checkBox.setName(String.valueOf(e.getId())); // Usar el ID como nombre único
        listaCheckBoxes.add(checkBox);

        JLabel lblReps = new JLabel("Repeticiones:"); // Etiqueta para el campo de texto
        JTextField txtReps = new JTextField(); // Campo para las repeticiones
        txtReps.setName("txtReps_" + e.getId()); // Identificador único

        // Añadir los componentes al contenedor
        containerPanel.add(checkBox);
        containerPanel.add(lblReps);
        containerPanel.add(txtReps);
    }

    // Agregar el contenedor al panel de checkboxes
    panelCheckBoxes.setLayout(new BorderLayout());
    panelCheckBoxes.add(containerPanel, BorderLayout.CENTER);

    // Refrescar el panel para mostrar los nuevos componentes
    panelCheckBoxes.revalidate();
    panelCheckBoxes.repaint();
}
   
    private List<Ejercicio> ejerciciosSeleccionados = new ArrayList<>();

private void procesarSeleccion() {
    String usuario = txtUsuario.getText().trim();

    if (usuario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario.");
        return;
    }

    List<Ejercicio> seleccionados = new ArrayList<>();
    for (Component c : panelCheckBoxes.getComponents()) {
        if (c instanceof JPanel) { // Verificar el contenedor
            JPanel containerPanel = (JPanel) c;
            for (Component child : containerPanel.getComponents()) {
                if (child instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) child;
                    if (checkBox.isSelected()) {
                        // Buscar el JTextField correspondiente
                        String id = checkBox.getName();
                        JTextField txtReps = (JTextField) containerPanel.getComponent(
                            containerPanel.getComponentZOrder(checkBox) + 2
                        );

                        String repsStr = txtReps.getText().trim();
                        if (repsStr.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Por favor, ingrese las repeticiones para: " + checkBox.getText());
                            return;
                        }

                        try {
                            int reps = Integer.parseInt(repsStr);
                            Ejercicio e = ec.obtenerEjercicioPorNombre(checkBox.getText());
                            if (e != null) {
                                e.setUsuario(usuario); // Asigna el usuario al ejercicio
                                e.setRepeticiones(reps); // Asigna las repeticiones
                                seleccionados.add(e);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "Ingrese un número válido para las repeticiones de: " + checkBox.getText());
                            return;
                        }
                    }
                }
            }
        }
    }

    if (seleccionados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se seleccionaron ejercicios.");
        return;
    }

    // Actualizar la lista de ejercicios seleccionados en el controlador
    ec.actualizarEjerciciosSeleccionados(seleccionados);

    // Mensaje de éxito con detalles
    JOptionPane.showMessageDialog(this, 
        "Usuario: " + usuario + "\nEjercicios asignados: " + seleccionados.size());

    // Opcional: limpiar las selecciones después de procesar
    limpiarFormulario();
}

/**
 * Método para limpiar el formulario después de procesar.
 */
private void limpiarFormulario() {
    txtUsuario.setText("");
    for (Component c : panelCheckBoxes.getComponents()) {
        if (c instanceof JPanel) {
            JPanel containerPanel = (JPanel) c;
            for (Component child : containerPanel.getComponents()) {
                if (child instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) child;
                    checkBox.setSelected(false);
                } else if (child instanceof JTextField) {
                    JTextField textField = (JTextField) child;
                    textField.setText("");
                }
            }
        }
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelRutina = new javax.swing.JPanel();
        btnProcesarSeleccionados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panelCheckBoxes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        PanelRutina.setBackground(new java.awt.Color(0, 0, 0));

        btnProcesarSeleccionados.setText("Asignar Seleccionados");
        btnProcesarSeleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarSeleccionadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asignar Ejercicios al Usuario");

        panelCheckBoxes.setLayout(new javax.swing.BoxLayout(panelCheckBoxes, javax.swing.BoxLayout.Y_AXIS));
        scrollPane.setViewportView(panelCheckBoxes);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de usuario :");

        javax.swing.GroupLayout PanelRutinaLayout = new javax.swing.GroupLayout(PanelRutina);
        PanelRutina.setLayout(PanelRutinaLayout);
        PanelRutinaLayout.setHorizontalGroup(
            PanelRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRutinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
            .addGroup(PanelRutinaLayout.createSequentialGroup()
                .addGroup(PanelRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRutinaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnProcesarSeleccionados))
                    .addGroup(PanelRutinaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRutinaLayout.createSequentialGroup()
                .addComponent(scrollPane)
                .addContainerGap())
        );
        PanelRutinaLayout.setVerticalGroup(
            PanelRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutinaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcesarSeleccionados)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarSeleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarSeleccionadosActionPerformed

      System.out.println("Asignado con exito"); // Verifica si se dispara el evento
    procesarSeleccion();
    

    }//GEN-LAST:event_btnProcesarSeleccionadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRutina;
    private javax.swing.JButton btnProcesarSeleccionados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelCheckBoxes;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

