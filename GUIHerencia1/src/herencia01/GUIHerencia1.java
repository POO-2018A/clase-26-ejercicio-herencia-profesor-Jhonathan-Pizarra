package herencia01;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIHerencia1 extends javax.swing.JFrame {
    
    ImageIcon imagenFondoMaterias, fondoMaterias;
    ImageIcon imagenFondoProfesores, fondoProfesores;
    ImageIcon imagenFondoEstudiantes, fondoEstudiantes;
    ImageIcon imagenFondoMatriculas, fondoMatriculas;
    
    
    ArrayList<Materias> listaMaterias = new ArrayList();
    DefaultTableModel modeloTablaMaterias;
    String materias[][];
    DefaultComboBoxModel modeloComboBoxMaterias = new DefaultComboBoxModel();
    
    
    ArrayList<Profesor> listaProfesores = new ArrayList();
    
    
    ArrayList<Estudiante> listaEstudiates = new ArrayList();
    DefaultTableModel modeloTablaEstudiantes;
    String estudiantes[][];
    DefaultComboBoxModel modeloComboBoxCarreras = new DefaultComboBoxModel();
    
    
    String matriculas[][];
    DefaultTableModel modeloTablaMatricula;
    DefaultComboBoxModel modeloComboBoxEstudiantes = new DefaultComboBoxModel();
    /**
     * Creates new form GUIHerencia1
     */
    public GUIHerencia1() {
        
        //Gracias por ver :) 
        
        initComponents();
        
        
        imagenFondoMaterias = new ImageIcon(getClass().getResource("/imagenes/Nagato2.jpg"));
        fondoMaterias = new ImageIcon(imagenFondoMaterias.getImage().getScaledInstance(labelFondoMateria.getWidth(), labelFondoMateria.getHeight(), Image.SCALE_DEFAULT));
        labelFondoMateria.setIcon(fondoMaterias);
        
        imagenFondoProfesores = new ImageIcon(getClass().getResource("/imagenes/CodeGueass.jpg"));
        fondoProfesores = new ImageIcon(imagenFondoProfesores.getImage().getScaledInstance(labelFondoProfesor.getWidth(), labelFondoProfesor.getHeight(), Image.SCALE_DEFAULT));
        labelFondoProfesor.setIcon(fondoProfesores);
        
        imagenFondoEstudiantes = new ImageIcon(getClass().getResource("/imagenes/ComeGalletas.gif"));
        fondoEstudiantes = new ImageIcon(imagenFondoEstudiantes.getImage().getScaledInstance(labelFondoEstudiante.getWidth(), labelFondoEstudiante.getHeight(), Image.SCALE_DEFAULT));
        labelFondoEstudiante.setIcon(fondoEstudiantes);
        
        imagenFondoMatriculas = new ImageIcon(getClass().getResource("/imagenes/Inuyasha.jpg"));
        fondoMatriculas = new ImageIcon(imagenFondoMatriculas.getImage().getScaledInstance(labelFondoMatricula.getWidth(), labelFondoMatricula.getHeight(), Image.SCALE_DEFAULT));
        labelFondoMatricula.setIcon(fondoMatriculas);
        
        
        
        
        String[] titulosTablaMaterias = new String[]{"Materias"};
        modeloTablaMaterias = new DefaultTableModel(materias,titulosTablaMaterias);
        tableMaterias.setModel(modeloTablaMaterias);
        comboBoxMaterias.setModel(modeloComboBoxMaterias);
        
        String[] titulosTablaEstudiantes = new String[]{"Apelldio","Nombre","Carrera"};
        modeloTablaEstudiantes = new DefaultTableModel(estudiantes, titulosTablaEstudiantes);
        tableEstudiantes.setModel(modeloTablaEstudiantes);
       
        String[] carreras = new String[]{"ASI","ASA","ET"};
        for(int i=0; i<carreras.length; i++){
            modeloComboBoxCarreras.addElement(carreras[i]);
        }
        comboBoxCarreras.setModel(modeloComboBoxCarreras);
        
        comboBoxAsignaturas.setModel(modeloComboBoxMaterias);
        
        comboBoxEstudiantes.setModel(modeloComboBoxEstudiantes);
        
        
        String[] titulosTablaMatricula = new String[]{"Estudiante","Materia","Profesor"};
        modeloTablaMatricula = new DefaultTableModel(matriculas,titulosTablaMatricula);
        tableMatriculas.setModel(modeloTablaMatricula);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pestañas = new javax.swing.JTabbedPane();
        panelMateria = new javax.swing.JPanel();
        labelNombreMateria = new javax.swing.JLabel();
        textMateria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        buttonRegistrarMateria = new javax.swing.JButton();
        labelFondoMateria = new javax.swing.JLabel();
        panelProfesor = new javax.swing.JPanel();
        labelNombreProfesor = new javax.swing.JLabel();
        labelApellidoProfesor = new javax.swing.JLabel();
        labelFacultadProfesor = new javax.swing.JLabel();
        labelMateriasProfesor = new javax.swing.JLabel();
        comboBoxMaterias = new javax.swing.JComboBox();
        textNombreProfesor = new javax.swing.JTextField();
        textApellidoProfesor = new javax.swing.JTextField();
        textFacultadProfesor = new javax.swing.JTextField();
        buttonRegistrarProfesor = new javax.swing.JButton();
        labelFondoProfesor = new javax.swing.JLabel();
        panelEstudiante = new javax.swing.JPanel();
        labelNombreEstudiante = new javax.swing.JLabel();
        labelApellidoEstudiante = new javax.swing.JLabel();
        textNombreEstudiante = new javax.swing.JTextField();
        labelCarreraEstudiante = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEstudiantes = new javax.swing.JTable();
        textApellidoEstudiante = new javax.swing.JTextField();
        comboBoxCarreras = new javax.swing.JComboBox();
        buttonRegistrarEstudiante = new javax.swing.JButton();
        labelFondoEstudiante = new javax.swing.JLabel();
        panelMatricula = new javax.swing.JPanel();
        labelEstudiante = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMatriculas = new javax.swing.JTable();
        comboBoxEstudiantes = new javax.swing.JComboBox();
        comboBoxAsignaturas = new javax.swing.JComboBox();
        buttonRegistrarMatricula = new javax.swing.JButton();
        labelFondoMatricula = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMateria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombreMateria.setForeground(new java.awt.Color(51, 204, 255));
        labelNombreMateria.setText("Ingrese una nueva materia:");
        panelMateria.add(labelNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        panelMateria.add(textMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 37, 100, -1));

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMaterias);

        panelMateria.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 135, 173, 187));

        buttonRegistrarMateria.setText("Registrar");
        buttonRegistrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMateriaActionPerformed(evt);
            }
        });
        panelMateria.add(buttonRegistrarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 82, -1, -1));
        panelMateria.add(labelFondoMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pestañas.addTab("Materia", panelMateria);

        panelProfesor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombreProfesor.setText("Nombre:");
        panelProfesor.add(labelNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 32, -1, -1));

        labelApellidoProfesor.setText("Apellido:");
        panelProfesor.add(labelApellidoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        labelFacultadProfesor.setText("Facultad:");
        panelProfesor.add(labelFacultadProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 127, -1, -1));

        labelMateriasProfesor.setText("Materia:");
        panelProfesor.add(labelMateriasProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 174, -1, -1));

        panelProfesor.add(comboBoxMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 171, 100, -1));
        panelProfesor.add(textNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 29, 100, -1));
        panelProfesor.add(textApellidoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 74, 100, -1));
        panelProfesor.add(textFacultadProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 124, 100, -1));

        buttonRegistrarProfesor.setText("Registar");
        buttonRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarProfesorActionPerformed(evt);
            }
        });
        panelProfesor.add(buttonRegistrarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 244, -1, -1));
        panelProfesor.add(labelFondoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pestañas.addTab("Profesor", panelProfesor);

        panelEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombreEstudiante.setText("Nombre:");
        panelEstudiante.add(labelNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, -1, -1));

        labelApellidoEstudiante.setText("Apellido:");
        panelEstudiante.add(labelApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 84, -1, -1));
        panelEstudiante.add(textNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 35, 100, -1));

        labelCarreraEstudiante.setText("Carrera:");
        panelEstudiante.add(labelCarreraEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 127, -1, -1));

        tableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEstudiantes);

        panelEstudiante.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 194, 239, 136));
        panelEstudiante.add(textApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 81, 100, -1));

        panelEstudiante.add(comboBoxCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 124, 100, -1));

        buttonRegistrarEstudiante.setText("Registrar");
        buttonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEstudianteActionPerformed(evt);
            }
        });
        panelEstudiante.add(buttonRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 153, -1, -1));
        panelEstudiante.add(labelFondoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pestañas.addTab("Estudiante", panelEstudiante);

        panelMatricula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEstudiante.setText("Estudiante:");
        panelMatricula.add(labelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 34, -1, -1));

        labelMateria.setText("Materia:");
        panelMatricula.add(labelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 84, -1, -1));

        tableMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableMatriculas);

        panelMatricula.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 160, 255, 170));

        panelMatricula.add(comboBoxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 34, 100, -1));

        panelMatricula.add(comboBoxAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 81, 100, -1));

        buttonRegistrarMatricula.setText("Registrar");
        buttonRegistrarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMatriculaActionPerformed(evt);
            }
        });
        panelMatricula.add(buttonRegistrarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 119, -1, -1));
        panelMatricula.add(labelFondoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pestañas.addTab("Matricula", panelMatricula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMatriculaActionPerformed
        // TODO add your handling code here:

        String estudianteSeleccionado = comboBoxEstudiantes.getSelectedItem().toString();
        String materiaSeleccionada = comboBoxAsignaturas.getSelectedItem().toString();

        for(Profesor item: listaProfesores){

            if(item.getMateria().equals(materiaSeleccionada)){

                String[] matriculas = new String[]{estudianteSeleccionado,materiaSeleccionada, item.getNombre() };
                modeloTablaMatricula.addRow(matriculas);
            }
        }

        /*
        for(Profesor item: listaProfesores){
            if(materiaSeleccionada.equals(item.getMateria())){

                modeloTablaMatricula.addRow(new String[]{estudianteSeleccionado, materiaSeleccionada, item.getNombre()});
            }
        }
        */

    }//GEN-LAST:event_buttonRegistrarMatriculaActionPerformed

    private void buttonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEstudianteActionPerformed
        // TODO add your handling code here:

        String nombre = textNombreEstudiante.getText();
        String apellido = textApellidoEstudiante.getText();
        String carrera = comboBoxCarreras.getSelectedItem().toString();

        Estudiante alumno = new Estudiante(nombre, apellido, carrera);
        listaEstudiates.add(alumno);

        String [] estudiantesRegistrados = new String[]{apellido, nombre, carrera};
        modeloTablaEstudiantes.addRow(estudiantesRegistrados);

        modeloComboBoxEstudiantes.addElement(alumno);

    }//GEN-LAST:event_buttonRegistrarEstudianteActionPerformed

    private void buttonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarProfesorActionPerformed
        // TODO add your handling code here:
        String nombre = textNombreProfesor.getText();
        String apellido = textApellidoProfesor.getText();
        String facultad = textFacultadProfesor.getText();

        String materiaSeleccionada = comboBoxMaterias.getSelectedItem().toString();
        boolean existe = false;

        Profesor maestro = new Profesor(nombre, apellido, facultad, materiaSeleccionada);
        for(Profesor item: listaProfesores){

            if(item.getNombre().equals(maestro.getNombre())){
                if(item.getApellido().equals(maestro.getApellido())){
                    if(item.getFacultad().equals(maestro.getFacultad())){

                        int iconoAviso = JOptionPane.WARNING_MESSAGE;
                        JOptionPane.showMessageDialog(rootPane, "Este profesor ya existe!", "AVISO", iconoAviso);
                        existe = true;
                        break;

                    }
                }
            }

            if(item.getMateria().equals(maestro.getMateria())){

                int iconoAviso = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(rootPane, "Esta materia ya tiene un profesor!", "AVISO", iconoAviso);
                existe = true;
                break;

            }

        }

        if(existe == false){
            System.out.println("Materia: "+materiaSeleccionada+", asignada correctamente!");
            listaProfesores.add(maestro);

        }

    }//GEN-LAST:event_buttonRegistrarProfesorActionPerformed

    private void buttonRegistrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMateriaActionPerformed
        // TODO add your handling code here:
        String materia = textMateria.getText();
        boolean existe = false;

        String[] materiaIngresada = new String[]{materia};
        Materias materiasRegistradas = new Materias(materia);

        for(Materias item: listaMaterias){

            if(item.getNombre().equals(materiasRegistradas.getNombre())){
                int iconoAviso = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(rootPane, "Esta materia ya fue registrada!", "AVISO", iconoAviso);
                existe = true;
                break;
            }

        }

        if(existe == false){
            listaMaterias.add(materiasRegistradas);
            modeloTablaMaterias.addRow(materiaIngresada);
            modeloComboBoxMaterias.addElement(materiasRegistradas);

        }

    }//GEN-LAST:event_buttonRegistrarMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIHerencia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHerencia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHerencia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHerencia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHerencia1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrarEstudiante;
    private javax.swing.JButton buttonRegistrarMateria;
    private javax.swing.JButton buttonRegistrarMatricula;
    private javax.swing.JButton buttonRegistrarProfesor;
    private javax.swing.JComboBox comboBoxAsignaturas;
    private javax.swing.JComboBox comboBoxCarreras;
    private javax.swing.JComboBox comboBoxEstudiantes;
    private javax.swing.JComboBox comboBoxMaterias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelApellidoEstudiante;
    private javax.swing.JLabel labelApellidoProfesor;
    private javax.swing.JLabel labelCarreraEstudiante;
    private javax.swing.JLabel labelEstudiante;
    private javax.swing.JLabel labelFacultadProfesor;
    private javax.swing.JLabel labelFondoEstudiante;
    private javax.swing.JLabel labelFondoMateria;
    private javax.swing.JLabel labelFondoMatricula;
    private javax.swing.JLabel labelFondoProfesor;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelMateriasProfesor;
    private javax.swing.JLabel labelNombreEstudiante;
    private javax.swing.JLabel labelNombreMateria;
    private javax.swing.JLabel labelNombreProfesor;
    private javax.swing.JPanel panelEstudiante;
    private javax.swing.JPanel panelMateria;
    private javax.swing.JPanel panelMatricula;
    private javax.swing.JPanel panelProfesor;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTable tableEstudiantes;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTable tableMatriculas;
    private javax.swing.JTextField textApellidoEstudiante;
    private javax.swing.JTextField textApellidoProfesor;
    private javax.swing.JTextField textFacultadProfesor;
    private javax.swing.JTextField textMateria;
    private javax.swing.JTextField textNombreEstudiante;
    private javax.swing.JTextField textNombreProfesor;
    // End of variables declaration//GEN-END:variables
}
