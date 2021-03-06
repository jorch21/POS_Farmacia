/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCompra;
import Controlador.ControladorEmpleado;
import Controlador.ControladorMedicamento;
import Controlador.ControladorProveedor;
import Modelo.Compras;
import Modelo.DetalleCompras;
import Modelo.Empleados;
import Modelo.Medicamentos;
import Modelo.Proveedores;
import java.awt.event.KeyEvent;
//import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jordie
 */
public class ModuloCompras extends javax.swing.JDialog {

    Medicamentos med = new Medicamentos();
    ControladorMedicamento conmed = new ControladorMedicamento();
    Proveedores prov = new Proveedores();
    ControladorProveedor conprov = new ControladorProveedor();
    Empleados emp = new Empleados();
    ControladorEmpleado conemp = new ControladorEmpleado();
    Compras comp = new Compras();
    ControladorCompra concom = new ControladorCompra();
    DetalleCompras dcomp = new DetalleCompras();
    DefaultTableModel modelo = new DefaultTableModel();
    int item;
    double totalPagar = 0.00;

    public ModuloCompras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        generarSerie();
        conmed.Listar_Medicamentos_Stock(tablaMedicamentos);
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
        tablaDetalleCompra = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtIdMedicamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDniEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnRegistrarCompra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fechaCompra = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE COMPRAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 470, 40));

        tablaDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "CANTIDAD", "P. COMPRA", "SUBTOTAL", "IGV", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalleCompra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 880, 150));

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaMedicamentos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 880, 120));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtIdMedicamento.setEditable(false);
        jPanel1.add(txtIdMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txtDescripcion.setEditable(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 340, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Compra");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 100, -1));

        txtPrecio.setEditable(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 60, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RUC Proveedor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 100, -1));

        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRUCKeyPressed(evt);
            }
        });
        jPanel1.add(txtRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Razon Social");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, -1));

        txtNombreProveedor.setEditable(false);
        jPanel1.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 170, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        txtIdProveedor.setEditable(false);
        jPanel1.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 40, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Adm");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        txtIdEmpleado.setEditable(false);
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 40, -1));

        txtNombreEmpleado.setEditable(false);
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 170, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre Admin");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DNI Admin");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 90, -1));

        txtDniEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniEmpleadoKeyPressed(evt);
            }
        });
        jPanel1.add(txtDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Compra");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sub Total");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 100, 20));

        txtSubtotal.setEditable(false);
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 100, -1));

        txtIGV.setEditable(false);
        txtIGV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IGV");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 100, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total a Pagar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 100, 20));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 100, -1));

        btnRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/venta.png"))); // NOI18N
        btnRegistrarCompra.setText("Registrar Compra");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 530, 170, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUCTOS CON STOCK CERO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, -1));

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 210, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nro Serie");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));
        jPanel1.add(fechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 150, -1));

        jTabbedPane1.addTab("REGITRAR COMPRAS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRUCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtRUC.getText())) {
                int r;
                String ruc = txtRUC.getText();
                prov = conprov.Buscar_Nombre_Proveedor(ruc);
                if (prov.getNom_prov() != null) {
                    txtNombreProveedor.setText("" + prov.getNom_prov());
                    txtIdProveedor.setText("" + prov.getId_prov());
                } else {
                    r = JOptionPane.showConfirmDialog(null, "Proveedor no registrado, Desea Registrar?");
                    if (r == 0) {
                        ModuloProveedores mp = new ModuloProveedores(new JFrame(), true);
                        mp.setVisible(true);
                    }
                    txtNombreProveedor.setText("");
                    txtIdProveedor.setText("");
                    txtRUC.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese RUC de proveedor");
                txtRUC.requestFocus();
            }
        }
    }//GEN-LAST:event_txtRUCKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo.getText())) {
                int r;
                String codigo = txtCodigo.getText();
                med = conmed.Buscar_Medicamento(codigo);
                if (med.getNom_pro() != null) {
                    txtIdMedicamento.setText("" + med.getId_pro());
                    txtDescripcion.setText("" + med.getNom_pro());
                    txtPrecio.setText("" + med.getPre_compra());
                    txtCantidad.requestFocus();
                } else {
                    r = JOptionPane.showConfirmDialog(null, "Medicamento no registrado, Desea Registrar?");
                    if (r == 0) {
                        ModuloMedicamentos mm = new ModuloMedicamentos(new JFrame(), true);
                        mm.setVisible(true);
                    } else {
                        txtIdMedicamento.setText("");
                        txtCodigo.setText("");
                        txtDescripcion.setText("");
                        txtPrecio.setText("");
                        txtCodigo.requestFocus();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese Codigo de Medicamento");
                txtCodigo.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtDniEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniEmpleadoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtDniEmpleado.getText())) {
                int r;
                String dni = txtDniEmpleado.getText();
                emp = conemp.Buscar_Nombre_Empleado(dni);
                if (emp.getNom_usu() != null) {
                    txtNombreEmpleado.setText("" + emp.getNom_usu());
                    txtIdEmpleado.setText("" + emp.getId_usu());
                } else {
                    r = JOptionPane.showConfirmDialog(null, "Usted no esta registrado, Desea Hacerlo?");
                    if (r == 0) {
                        ModuloEmpleados me = new ModuloEmpleados(new JFrame(), true);
                        me.setVisible(true);
                    }
                    txtNombreEmpleado.setText("");
                    txtIdEmpleado.setText("");
                    txtDniEmpleado.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese su DNI");
                txtDniEmpleado.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDniEmpleadoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidad.getText())) {
                int id = Integer.parseInt(txtIdMedicamento.getText());
                String cod = txtCodigo.getText();
                String desc = txtDescripcion.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                int cant = Integer.parseInt(txtCantidad.getText());
                double subtotal = cant * precio;
                double igv = subtotal * 0.18;
                double redondeo = Math.round(igv * 100.0) / 100.0;
                double total = subtotal + igv;
                item = item + 1;
                modelo = (DefaultTableModel) tablaDetalleCompra.getModel();
                for (int i = 0; i < tablaDetalleCompra.getRowCount(); i++) {
                    if (tablaDetalleCompra.getValueAt(i, 2).equals(txtDescripcion.getText())) {
                        JOptionPane.showMessageDialog(null, "El producto ya se agrego a la lista");
                        limpiarValores();
                        txtCodigo.requestFocus();
                        return;
                    }
                }
                ArrayList lista = new ArrayList();
                lista.add(item);
                lista.add(id);
                lista.add(cod);
                lista.add(desc);
                lista.add(cant);
                lista.add(precio);
                lista.add(subtotal);
                lista.add(redondeo);
                lista.add(total);
                Object[] o = new Object[8];
                o[0] = lista.get(1);
                o[1] = lista.get(2);
                o[2] = lista.get(3);
                o[3] = lista.get(4);
                o[4] = lista.get(5);
                o[5] = lista.get(6);
                o[6] = lista.get(7);
                o[7] = lista.get(8);
                modelo.addRow(o);
                tablaDetalleCompra.setModel(modelo);
                anchosTabla();
                limpiarValores();
                txtCodigo.requestFocus();
                txtSubtotal.setText("" + subtotal);
                txtIGV.setText("" + redondeo);
                TotalPagar();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (tablaDetalleCompra.getSelectedRow() == 0) {
            modelo = (DefaultTableModel) tablaDetalleCompra.getModel();
            modelo.removeRow(tablaDetalleCompra.getSelectedRow());
            txtSubtotal.setText("0.00");
            txtIGV.setText("0.00");
            TotalPagar();
            txtCodigo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        RegistrarCompra();
        RegistrarDetalleCompra();
        LimpiarTablaCompra();
        limpiar();
        generarSerie();
        conmed.Listar_Medicamentos_Stock(tablaMedicamentos);
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModuloCompras dialog = new ModuloCompras(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarCompra;
    private com.toedter.calendar.JDateChooser fechaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaDetalleCompra;
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdMedicamento;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public void RegistrarCompra(){
        String f = "dd/MM/yyyy";
        java.util.Date fechita = fechaCompra.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(f);
        
        comp.setId_prov(Integer.parseInt(txtIdProveedor.getText()));
        comp.setId_usu(Integer.parseInt(txtIdEmpleado.getText()));
        comp.setNumSerie(txtSerie.getText());
        comp.setFecha_ord(sdf.format(fechita));
        comp.setIgv(Double.parseDouble(txtIGV.getText()));
        comp.setTotal(Double.parseDouble(txtTotal.getText()));
        concom.Insertar_Compra();
    }
    
    public void RegistrarDetalleCompra(){ 
        
        for(int i=0; i<tablaDetalleCompra.getRowCount();i++){
            int idpro = Integer.parseInt(tablaDetalleCompra.getValueAt(i, 0).toString());
            int canti = Integer.parseInt(tablaDetalleCompra.getValueAt(i, 3).toString());
            double prec = Double.parseDouble(tablaDetalleCompra.getValueAt(i, 4).toString());
            dcomp.setId_pro(idpro);
            dcomp.setCantidad(canti);
            dcomp.setPrecio(prec);
            
            concom.Insertar_Detalle_Compra();
        }
    }
    
    public void LimpiarTablaCompra(){
        modelo = (DefaultTableModel) tablaDetalleCompra.getModel();
        int fila = tablaDetalleCompra.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
    }
    
    private void limpiar(){
        txtIdProveedor.setText("");
        txtRUC.setText("");
        txtNombreProveedor.setText("");
        txtIdEmpleado.setText("");
        txtDniEmpleado.setText("");
        txtNombreEmpleado.setText("");
        fechaCompra.setCalendar(null);
    }
    
    private void TotalPagar() {
        totalPagar = 0.00;
        int numFila = tablaDetalleCompra.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tablaDetalleCompra.getModel().getValueAt(i, 7)));
            totalPagar = totalPagar + cal;
        }
        txtTotal.setText(String.format("%.2f", totalPagar));
    }
    
    private void limpiarValores() { 
        txtIdMedicamento.setText("");
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }
    
    void generarSerie(){
        String serie=concom.Nro_Serie_Compra();
        if(serie==null ){
            txtSerie.setText("0000001");
        }else{
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtSerie.setText("000000"+increment); 
        }
    }
    
    private void anchosTabla(){
        int[] anchos = {25,60,200,50,50,50,50,70};
        
        for (int i = 0; i < tablaDetalleCompra.getColumnCount(); i++) {
            tablaDetalleCompra.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]); 
        }
    }
}
