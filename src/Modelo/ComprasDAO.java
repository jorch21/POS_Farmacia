/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComprasDAO {
    Compras comp = new Compras();
    DetalleCompras dcomp = new DetalleCompras();
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public void InsertarCompras(){
        String sql = "{CALL RegistrarCompra(?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, comp.getId_prov());
            pst.setInt(2, comp.getId_usu());
            pst.setString(3, comp.getNumSerie());
            pst.setString(4, comp.getFecha_ord());
            pst.setDouble(5, comp.getIgv());
            pst.setDouble(6, comp.getTotal());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro compra con éxito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String NroSerieCompra(){
        String serie = "";
        String sql = "select max(numSerie) from OrdenCompra";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                serie = rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return serie;
    }
    
    public void InsertarDetalleCompra(){
        String sql = "{CALL RegistarDetalleCompra(?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, dcomp.getId_pro());
            pst.setInt(2, dcomp.getCantidad());
            pst.setDouble(3, dcomp.getPrecio());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se registro Detalle de Venta con éxito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
