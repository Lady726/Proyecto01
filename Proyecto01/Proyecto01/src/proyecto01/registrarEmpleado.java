/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

import controlador.AccesoAleatorio;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author sala1
 */
public class registrarEmpleado extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form registrarEmpleado
     */
    public registrarEmpleado() {
        initComponents();
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cargo");
        modelo.addColumn("Contrato");
        modelo.addColumn("Sexo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Salario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxSexo2 = new javax.swing.JComboBox();
        jTextFieldSalario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSalario1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        Cargar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        campoEliminar = new javax.swing.JTextField();
        buscar = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jComboBoxSexo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Masculino", "Femenino", "Otro" }));
        jComboBoxSexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexo2ActionPerformed(evt);
            }
        });

        jTextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioActionPerformed(evt);
            }
        });
        jTextFieldSalario.getAccessibleContext().setAccessibleParent(jTextFieldSalario);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Empleado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));
        jPanel1.setLayout(new java.awt.GridLayout(9, 0));

        jLabel1.setText("Id");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1);

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldId);

        jLabel2.setText("Nombres");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);

        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombres);

        jLabel3.setText("Apellidos");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldApellidos);

        jLabel4.setText("Cargo");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel4);

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Gerente General", "Produccion", "Distribucion", "Ventas", "Publicidad", "Contabilidad ", "Gestion Humana", " " }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCargo);

        jLabel5.setText("Contrato");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5);

        jTextFieldContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContratoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldContrato);

        jLabel6.setText("Sexo");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Masculino", "Femenino", "Otro" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSexo);

        jLabel7.setText("Direccion");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7);
        jPanel1.add(jTextFieldDireccion);

        jLabel9.setText("Salario");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setMaximumSize(new java.awt.Dimension(32, 18));
        jLabel9.setMinimumSize(new java.awt.Dimension(32, 18));
        jPanel1.add(jLabel9);
        jPanel1.add(jTextFieldSalario1);

        jLabel8.setText("Telefono");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel8);

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTelefono);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar Empleado");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(campoEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 417, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 379, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Object []object = new Object[9];
        int aux=0;
        int Id, Salario, Telefono, Nombres, Apellidos,Direccion,Contrato;
        try{
            Id=Integer.parseInt(jTextFieldId.getText());
            Salario=Integer.parseInt(jTextFieldSalario1.getText());
            Telefono=Integer.parseInt(jTextFieldTelefono.getText());
            object[0] = Id;
            object[8] = Salario;
            object[7] = Telefono;
            aux=1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error");
        }
        try{
            Nombres=Integer.parseInt(jTextFieldNombres.getText());
            Apellidos=Integer.parseInt(jTextFieldApellidos.getText());
            Direccion=Integer.parseInt(jTextFieldDireccion.getText());
            Contrato=Integer.parseInt(jTextFieldContrato.getText());
            JOptionPane.showMessageDialog(this,"Error");
        }catch(Exception e){
            object[1] = jTextFieldNombres.getText();
            object[2] = jTextFieldApellidos.getText();
            object[4] = jTextFieldContrato.getText();
            object[6] = jTextFieldDireccion.getText();
            //aux=1;
        }
        object[5]=jComboBoxSexo.getSelectedItem();
        object[3]=jComboBoxCargo.getSelectedItem();
        String nombres=this.jTextFieldNombres.getText();
        if(aux==1){
          modelo.addRow(object);  
        }
        String nombre = this.jTextFieldNombres.getText().trim();
        if(nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }    
        String apellidos = this.jTextFieldApellidos.getText().trim();
        if(apellidos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el apellido!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String direccion = this.jTextFieldDireccion.getText().trim();
        if(direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso la direccion!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String id = this.jTextFieldId.getText().trim();
        if(id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el Id!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String salario = this.jTextFieldSalario1.getText().trim();
        if(salario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el salario!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String telefono = this.jTextFieldTelefono.getText().trim();
        if(telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el telefono!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int ID, Sala, Tele;
        try {
            ID = Integer.parseInt(id);
            Sala = Integer.parseInt(salario);
            Tele = Integer.parseInt(telefono);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un números enteros en el Id, salario y telefono.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            AccesoAleatorio.crearFileAlumno( new File("personas.dat") );
            AccesoAleatorio.añadirPersona( new Persona(nombre, apellidos, direccion, ID, Sala, Tele,true) );
            AccesoAleatorio.cerrar();
            JOptionPane.showMessageDialog(this, "El registro se realizó correctamente.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiar();
   
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila != -1){
            modelo.removeRow(fila);
            try {
            AccesoAleatorio.crearFileAlumno(new File("personas.dat"));
            if( AccesoAleatorio.eliminarPersona(campoEliminar.getText()) )
                JOptionPane.showMessageDialog(this, "El registro correspondiente fue eliminado correctamente.", "Eliminación correcta", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(this, "Error al intentar eliminar un registro inexistente.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        String name =this.jTextFieldNombres.getText();
        String apellidos=this.jTextFieldApellidos.getText();
        String id=this.jTextFieldId.getText();
        String cargo= jComboBoxCargo.getSelectedItem().toString();
        String salario=this.jTextFieldSalario1.getText();
        String contrato=this.jTextFieldDireccion.getText();
        hojasVida.jTextField6.setText(id);
        hojasVida.jTextField2.setText(name+" "+apellidos);
        hojasVida.jTextField3.setText(cargo);
        hojasVida.jTextField5.setText(salario);
        hojasVida.jTextField7.setText(contrato);
    }//GEN-LAST:event_CargarActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jTextFieldContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContratoActionPerformed

    }//GEN-LAST:event_jTextFieldContratoActionPerformed

    private void jComboBoxSexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexo2ActionPerformed

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCargoActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String nombre = this.buscar.getText().trim();
        if(nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        try {
            AccesoAleatorio.crearFileAlumno( new File("personas.dat") );
            int i = AccesoAleatorio.buscarRegistro( nombre );
            if(i==-1) {
                JOptionPane.showMessageDialog(this, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
                return;
            }
            JOptionPane.showMessageDialog(this, "La primera coincidencia indica: "+AccesoAleatorio.getPersona(i), "Notificación", JOptionPane.INFORMATION_MESSAGE);
            AccesoAleatorio.cerrar();
        } catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Error en la búsqueda de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed
    
    private void limpiar(){
        jTextFieldId.setText("");
        jTextFieldNombres.setText(""); 
        jTextFieldApellidos.setText(""); 
        jTextFieldContrato.setText(""); 
        jTextFieldDireccion.setText(""); 
        jComboBoxSexo.setSelectedIndex(0); 
        jTextFieldTelefono.setText(""); 
        jTextFieldSalario1.setText(""); 
        jTextFieldSalario.setText(""); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField campoEliminar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxCargo;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JComboBox jComboBoxSexo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldContrato;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSalario1;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}