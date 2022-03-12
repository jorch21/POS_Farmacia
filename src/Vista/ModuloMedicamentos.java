/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorMedicamento;
import Modelo.ConexionBD;
import Modelo.Medicamentos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordie
 */
public class ModuloMedicamentos extends javax.swing.JDialog {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Medicamentos med = new Medicamentos();
    ControladorMedicamento conmed = new ControladorMedicamento();
    
    public ModuloMedicamentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jbtnEliminar.setEnabled(false);
        jbtnModificar.setEnabled(false);
        conmed.Listar_Medicamentos(tablaMedicamentdo);
        anchosTabla();
        conmed.Listar_Combo_Medicamentos(cboCategoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnMedicamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicamentdo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVenta = new javax.swing.JTextField();
        fechaVence = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMedicamento.setBackground(new java.awt.Color(51, 153, 255));
        pnMedicamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha Vence");
        pnMedicamento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/guardar.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        pnMedicamento.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 40));

        txtId.setEnabled(false);
        pnMedicamento.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 40, -1));

        tablaMedicamentdo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMedicamentdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentdoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMedicamentdo);

        pnMedicamento.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 900, 370));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/buscar.png"))); // NOI18N
        jLabel2.setText("Buscar Medicamento");
        pnMedicamento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 40));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO MEDICAMENTOS");
        pnMedicamento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo");
        pnMedicamento.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id");
        pnMedicamento.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtCodigo.setEnabled(false);
        pnMedicamento.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnMedicamento.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 350, 30));

        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/eliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        pnMedicamento.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 40));

        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/editar.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });
        pnMedicamento.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 40));

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/nuevo.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        pnMedicamento.add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria");
        pnMedicamento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre");
        pnMedicamento.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        pnMedicamento.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        pnMedicamento.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Compra");
        pnMedicamento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        pnMedicamento.add(txtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Venta");
        pnMedicamento.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        pnMedicamento.add(txtVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, -1));
        pnMedicamento.add(fechaVence, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, -1));

        jTabbedPane1.addTab("REGISTRAR MEDICAMENTOS", pnMedicamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        if(cboCategoria.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Ingrese algun valor");
        }else{
            String f = "dd/MM/yyyy";
            java.util.Date fechita = fechaVence.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(f);
            
            med.setId_cat(cboCategoria.getSelectedIndex());
            med.setNom_pro(txtNombre.getText());
            med.setPre_venta(Double.parseDouble(txtVenta.getText()));
            med.setPre_compra(Double.parseDouble(txtCompra.getText()));
            med.setFecha_venc(sdf.format(fechita));
            
            conmed.Registrar_Medicamento();
            conmed.Listar_Medicamentos(tablaMedicamentdo);
            anchosTabla();
            limpiarFormulario();
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void tablaMedicamentdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentdoMouseClicked
        
        jbtnNuevo.setEnabled(false);
        jbtnEliminar.setEnabled(true);
        jbtnModificar.setEnabled(true);
        
        int fila = tablaMedicamentdo.rowAtPoint(evt.getPoint());
        txtId.setText(tablaMedicamentdo.getValueAt(fila, 0).toString());
        txtCodigo.setText(tablaMedicamentdo.getValueAt(fila, 1).toString());
        cboCategoria.getModel().setSelectedItem(String.valueOf(tablaMedicamentdo.getModel().getValueAt(fila, 2).toString()));
        txtNombre.setText(tablaMedicamentdo.getValueAt(fila, 3).toString());
        txtVenta.setText(tablaMedicamentdo.getValueAt(fila, 4).toString());
        txtCompra.setText(tablaMedicamentdo.getValueAt(fila, 5).toString());
        fechaVence.setDate(Date.valueOf(tablaMedicamentdo.getValueAt(fila, 6).toString()));
    }//GEN-LAST:event_tablaMedicamentdoMouseClicked

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        limpiarFormulario();
        jbtnNuevo.setEnabled(true);
        jbtnEliminar.setEnabled(false);
        jbtnModificar.setEnabled(false);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla"); 
        }else{
            String f = "dd/MM/yyyy";
            java.util.Date fechita = fechaVence.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(f);
            
            med.setId_pro(Integer.parseInt(txtId.getText()));
            med.setId_cat(cboCategoria.getSelectedIndex());
            med.setNom_pro(txtNombre.getText());
            med.setPre_venta(Double.parseDouble(txtVenta.getText()));
            med.setPre_compra(Double.parseDouble(txtCompra.getText()));
            med.setFecha_venc(sdf.format(fechita));
            
            conmed.Modificar_Medicamento();
            conmed.Listar_Medicamentos(tablaMedicamentdo);
            anchosTabla();
            limpiarFormulario();
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }else{
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el registro?");
            if (pregunta == 0) {
                med.setId_pro(Integer.parseInt(txtId.getText()));

                conmed.Eliminar_Medicamento();
                conmed.Listar_Medicamentos(tablaMedicamentdo);
                anchosTabla();
                limpiarFormulario();
            }
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        med.setNom_pro(txtBuscar.getText()+'%');
        conmed.Buscar_Nombre_Medicamento(tablaMedicamentdo);
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(ModuloMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModuloMedicamentos dialog = new ModuloMedicamentos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoria;
    private com.toedter.calendar.JDateChooser fechaVence;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JPanel pnMedicamento;
    private javax.swing.JTable tablaMedicamentdo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
private void limpiarFormulario() {
        txtCodigo.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtCompra.setText("");
        txtVenta.setText("");
        cboCategoria.setSelectedIndex(0);
        fechaVence.setCalendar(null);
    }

private void anchosTabla(){
        int[] anchos = {25,60,80,150,80,80,100,30};
        
        for (int i = 0; i < tablaMedicamentdo.getColumnCount(); i++) {
            tablaMedicamentdo.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]); 
        }
    }

}
