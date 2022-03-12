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

/**
 *
 * @author Jordie
 */
public class VentasDAO {
    Ventas ven = new Ventas();
    DetalleVenta dven = new DetalleVenta();
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public void InsertarVentas(){
        String sql = "{CALL RegistrarVenta(?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, ven.getId_usu());
            pst.setInt(2, ven.getId_cli());
            pst.setString(3, ven.getNum_serie());
            pst.setString(4, ven.getFecha_venta());
            pst.setDouble(5, ven.getIgv());
            pst.setDouble(6, ven.getTotal());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro venta con éxito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String NroSerieVenta(){
        String serie = "";
        String sql = "select max(num_serie) from Ventas";
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
    
    public void InsertarDetalleVenta(){
        String sql = "{CALL RegistrarDetalleVenta(?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, dven.getId_pro());
            pst.setInt(2, dven.getCantidad());
            pst.setDouble(3, dven.getPrecio());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se registro Detalle de Venta con éxito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
