package Modelo;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedoresDAO {

    Proveedores prov = new Proveedores();
    int r;
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public void EstructuraTabla(JTable tablita) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("RUC");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Certificacion");
        modeloTabla.addColumn("Fecha Registro");
        tablita.setModel(modeloTabla);
    }

    public void ListarProveedores(JTable tabla) {
        String sql = "{call ListarProveedores()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("RUC");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Certificacion");
            modelo.addColumn("Fecha Registro");
            tabla.setModel(modelo);

            while (rs.next()) {
                Object vector[] = new Object[9];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                vector[8] = rs.getObject(9);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void InsertarProveedores(){
        String sql = "{CALL RegistrarProveedor(?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, prov.getRuc_prov());
            pst.setString(2, prov.getNom_prov());
            pst.setString(3, prov.getDir_prov());
            pst.setString(4, prov.getTelefono());
            pst.setString(5, prov.getCorreo());
            pst.setString(6, prov.getCertificacion());
            pst.setString(7,prov.getFecha_registro());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proveedor Registrado con exito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ModificarProveedores(){
        String sql = "{CALL ModificarProveedor(?,?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, prov.getId_prov());
            pst.setString(2, prov.getRuc_prov());
            pst.setString(3, prov.getNom_prov());
            pst.setString(4, prov.getDir_prov());
            pst.setString(5, prov.getTelefono());
            pst.setString(6, prov.getCorreo());
            pst.setString(7, prov.getCertificacion());
            pst.setString(8, prov.getFecha_registro());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de Proveedor Actualizados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void EliminarProveedores(){
        String sql = "{CALL EliminarProveedor(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, prov.getId_prov());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BuscarProveedores(JTable tabla){
        String sql = "{CALL BuscarProveedor(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, prov.getNom_prov());
            rs = pst.executeQuery();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("RUC");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Cetificacion");
            modelo.addColumn("Fecha Registro");
            tabla.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[9];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                vector[8] = rs.getObject(9);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Proveedores BuscarNombreProveedor(String ruc){
        String sql = "{CALL BuscarNombreProveedor(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setString(1, ruc);
            rs = pst.executeQuery();
            if(rs.next()){
                prov.setNom_prov(rs.getString("nom_prov"));
                prov.setId_prov(rs.getInt("id_prov"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return prov;
    }

}
