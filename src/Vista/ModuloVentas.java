/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorEmpleado;
import Controlador.ControladorMedicamento;
import Controlador.ControladorVenta;
import Modelo.Client;
import Modelo.DetalleVenta;
import Modelo.Empleados;
import Modelo.Login;
import Modelo.Medicamentos;
import Modelo.Ventas;
import java.awt.event.KeyEvent;
//import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jordie
 */
public class ModuloVentas extends javax.swing.JDialog {

    Login lg = new Login();
    Client cli = new Client();
    ControladorCliente concli = new ControladorCliente();
    Medicamentos med = new Medicamentos();
    ControladorMedicamento conmed = new ControladorMedicamento();
    Empleados emp = new Empleados();
    ControladorEmpleado conemp = new ControladorEmpleado();
    Ventas ven = new Ventas();
    ControladorVenta conven = new ControladorVenta();
    DetalleVenta dven = new DetalleVenta();
    DefaultTableModel modelo = new DefaultTableModel();
    int item;
    double totalPagar = 0.00;

    public ModuloVentas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        obtenerEmpleado();
        generarSerie();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDniEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIdMedicamento = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnObtenerMedicamentos = new javax.swing.JButton();
        btnObtenerClientes = new javax.swing.JButton();
        fechaVenta = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Descripcion", "Cantidad", "Precio", "SubTotal", "IGV", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 880, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 370, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        txtCodigo.setEditable(false);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        txtDescripcion.setEditable(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        txtPrecio.setEditable(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Venta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 60, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI Cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        txtDocumento.setEditable(false);
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, -1));

        txtNombreCliente.setEditable(false);
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        txtDniEmpleado.setEditable(false);
        jPanel1.add(txtDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DNI Empleado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total a Pagar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 100, 20));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IGV");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 100, 20));

        txtIGV.setEditable(false);
        txtIGV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 100, -1));

        txtSubtotal.setEditable(false);
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sub Total");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 100, 20));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/venta.png"))); // NOI18N
        btnRegistrar.setText("Registrar Venta");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        txtIdCliente.setEditable(false);
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 40, -1));

        txtNombreEmpleado.setEditable(false);
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 170, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre Empleado");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 140, -1));

        txtIdEmpleado.setEditable(false);
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 40, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Emp");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        txtIdMedicamento.setEditable(false);
        jPanel1.add(txtIdMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 40, -1));

        txtSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nro Serie");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 20));

        btnObtenerMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/BuscarBD.png"))); // NOI18N
        btnObtenerMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerMedicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(btnObtenerMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, 30));

        btnObtenerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/BuscarBD.png"))); // NOI18N
        btnObtenerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnObtenerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 30, 30));
        jPanel1.add(fechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 140, 20));

        jTabbedPane1.addTab("REGISTRO VENTAS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                int stock = Integer.parseInt(txtStock.getText());
                if (stock >= cant) {
                    item = item + 1;
                    modelo = (DefaultTableModel) tablaDetalle.getModel();
                    for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
                        if (tablaDetalle.getValueAt(i, 2).equals(txtDescripcion.getText())) {
                            JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                            limpiarValores();
                            //txtCodigo.requestFocus();
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
                    tablaDetalle.setModel(modelo);
                    anchosTabla();
                    limpiarValores();
                    //txtCodigo.requestFocus();
                    txtSubtotal.setText("" + subtotal);
                    txtIGV.setText("" + redondeo);
                    TotalPagar();
                } else {
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                    txtCantidad.setText("");
                    txtCantidad.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (tablaDetalle.getSelectedRow() == 0) {
            modelo = (DefaultTableModel) tablaDetalle.getModel();
            modelo.removeRow(tablaDetalle.getSelectedRow());
            txtSubtotal.setText("0.00");
            txtIGV.setText("0.00");
            TotalPagar();
            txtCodigo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        RegistrarVenta();
        RegistrarDetalleVenta();
        LimpiarTablaVenta();
        limpiar();
        generarSerie();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnObtenerMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerMedicamentosActionPerformed
        BM.setVisible(true);
        int seleccion = BM.tabMedicina.getSelectedRow();
        txtIdMedicamento.setText(BM.tabMedicina.getValueAt(seleccion, 0).toString());
        txtCodigo.setText(BM.tabMedicina.getValueAt(seleccion, 1).toString());
        txtDescripcion.setText(BM.tabMedicina.getValueAt(seleccion, 3).toString());
        txtPrecio.setText(BM.tabMedicina.getValueAt(seleccion, 4).toString());
        txtStock.setText(BM.tabMedicina.getValueAt(seleccion, 7).toString());
        txtCantidad.requestFocus();
    }//GEN-LAST:event_btnObtenerMedicamentosActionPerformed

    private void btnObtenerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerClientesActionPerformed
        BC.setVisible(true);
        int filas = BC.tabCliente.getSelectedRow();
        txtDocumento.setText(BC.tabCliente.getValueAt(filas, 2).toString());
        txtNombreCliente.setText(BC.tabCliente.getValueAt(filas, 3).toString());
        txtIdCliente.setText(BC.tabCliente.getValueAt(filas, 0).toString());
    }//GEN-LAST:event_btnObtenerClientesActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModuloVentas dialog = new ModuloVentas(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnObtenerClientes;
    private javax.swing.JButton btnObtenerMedicamentos;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser fechaVenta;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaDetalle;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdEmpleado;
    public javax.swing.JTextField txtIdMedicamento;
    private javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreEmpleado;
    public javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    public javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void TotalPagar() {
        totalPagar = 0.00;
        int numFila = tablaDetalle.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tablaDetalle.getModel().getValueAt(i, 7)));
            totalPagar = totalPagar + cal;
        }
        txtTotal.setText(String.format("%.2f", totalPagar));
    }

    public void RegistrarVenta() {
        String f = "dd/MM/yyyy";
        java.util.Date fechita = fechaVenta.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(f);

        ven.setId_usu(Integer.parseInt(txtIdEmpleado.getText()));
        ven.setId_cli(Integer.parseInt(txtIdCliente.getText()));
        ven.setNum_serie(txtSerie.getText());
        ven.setFecha_venta(sdf.format(fechita));
        ven.setIgv(Double.parseDouble(txtIGV.getText()));
        ven.setTotal(Double.parseDouble(txtTotal.getText()));
        conven.Insertar_Venta();
    }

    public void RegistrarDetalleVenta() {

        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            int idpro = Integer.parseInt(tablaDetalle.getValueAt(i, 0).toString());
            int canti = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            double prec = Double.parseDouble(tablaDetalle.getValueAt(i, 7).toString());
            dven.setId_pro(idpro);
            dven.setCantidad(canti);
            dven.setPrecio(prec);

            conven.Insertar_Detalle_Venta();
        }
    }

    public void LimpiarTablaVenta() {
        modelo = (DefaultTableModel) tablaDetalle.getModel();
        int fila = tablaDetalle.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
    }

    private void limpiarValores() {
        txtIdMedicamento.setText("");
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtCantidad.setText("");
    }

    private void limpiar() {
        txtIdCliente.setText("");
        txtDocumento.setText("");
        txtNombreCliente.setText("");
        txtIdEmpleado.setText("");
        txtDniEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtSubtotal.setText("");
        txtIGV.setText("");
        txtTotal.setText("");
        fechaVenta.setCalendar(null);
    }

    void generarSerie() {
        String serie = conven.Nro_Serie_Venta();
        if (serie == null) {
            txtSerie.setText("0000001");
        } else {
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtSerie.setText("000000" + increment);
        }
    }
    
    public void obtenerEmpleado(){
        txtDniEmpleado.setText(emp.getDni_usu());
        txtNombreEmpleado.setText(emp.getNom_usu());
        txtIdEmpleado.setText(""+emp.getId_usu());
    }

    private void anchosTabla() {
        int[] anchos = {25, 60, 200, 50, 50, 50, 50, 70};

        for (int i = 0; i < tablaDetalle.getColumnCount(); i++) {
            tablaDetalle.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }
    
    public static BuscarMedicamento BM = new BuscarMedicamento(new JFrame(), true);
    public static BuscarCliente BC = new BuscarCliente(new JFrame(), true);
    public static ModuloVentas MV = new ModuloVentas(new JDialog(),true);
}
