/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Modelo.Categorias;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordie
 */
public class ModuloCategorias extends javax.swing.JDialog {

    Categorias cat = new Categorias();
    ControladorCategoria concat = new ControladorCategoria();
    
    public ModuloCategorias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        concat.Listar_Categorias(tablaCategoria);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE CATEGORIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, 393, 33));

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCategoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 20));

        txtIdCategoria.setEditable(false);
        jPanel1.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CODIGO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 50, 20));

        txtCodigoCategoria.setEditable(false);
        jPanel1.add(txtCodigoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 20));
        jPanel1.add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 130, 40));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/guardar.png"))); // NOI18N
        btnGuardar.setText("GRABAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 130, 40));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 130, 40));

        jTabbedPane1.addTab("REGISTRAR CATEGORIAS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtNombreCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese algun valor");
        }else{
            cat.setNom_cat(txtNombreCategoria.getText());
            concat.Insertar_Categoria();
            concat.Listar_Categorias(tablaCategoria);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriaMouseClicked
        
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        int fila = tablaCategoria.rowAtPoint(evt.getPoint());
        txtIdCategoria.setText(tablaCategoria.getValueAt(fila, 0).toString());
        txtCodigoCategoria.setText(tablaCategoria.getValueAt(fila, 1).toString());
        txtNombreCategoria.setText(tablaCategoria.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tablaCategoriaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtIdCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }else{
            
            cat.setId_cat(Integer.parseInt(txtIdCategoria.getText()));
            cat.setNom_cat(txtNombreCategoria.getText());
            concat.Modificar_Categoria();
            concat.Listar_Categorias(tablaCategoria);
            limpiar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtIdCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }else{
            
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el registro?");
            if (pregunta == 0) {
                cat.setId_cat(Integer.parseInt(txtIdCategoria.getText()));

                concat.Eliminar_Categoria();
                concat.Listar_Categorias(tablaCategoria);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModuloCategorias dialog = new ModuloCategorias(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTextField txtCodigoCategoria;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
    private void limpiar(){
        txtIdCategoria.setText("");
        txtCodigoCategoria.setText("");
        txtNombreCategoria.setText("");
    }

}
