package Modelo;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MedicamentosDAO {

    Medicamentos med = new Medicamentos();
    int r;
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public void EstructuraTabla(JTable tablita) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Categoria");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio Venta");
        modeloTabla.addColumn("Precio Compra");
        modeloTabla.addColumn("Vencimiento");
        modeloTabla.addColumn("Stock");
        tablita.setModel(modeloTabla);
    }

    public void ListarMedicamentos(JTable tabla) {
        String sql = "{call ListarMedicamentos()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Vencimiento");
            modelo.addColumn("Stock");
            tabla.setModel(modelo);

            while (rs.next()) {
                Object vector[] = new Object[8];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ListarComboCategoria(JComboBox combito){
        String sql = "SELECT * FROM Categorias where estado=1";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            combito.removeAllItems();
            combito.addItem("Seleccionar");
            while(rs.next()){
                combito.addItem(rs.getObject("nom_cat"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Medicamentos BuscarMedicamento(String cod){
        String sql = "{CALL BuscarMedicamento(?)}";
        try {
            con = cn.getConexion();
                pst = con.prepareCall(sql);
            pst.setString(1, cod);
            rs = pst.executeQuery();
            if(rs.next()){ 
                med.setId_pro(rs.getInt("id_pro"));
                med.setNom_pro(rs.getString("nom_pro"));
                med.setPre_venta(rs.getDouble("pre_venta"));
                med.setStock(rs.getInt("stock"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return med;
    }
    
    public void InsertarMedicamentos(){
        String sql = "{CALL RegistrarMedicamento(?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, med.getId_cat());
            pst.setString(2, med.getNom_pro());
            pst.setDouble(3, med.getPre_venta());
            pst.setDouble(4, med.getPre_compra());
            pst.setString(5, med.getFecha_venc());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medicamento Registrado con exito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ModificarMedicamentos(){
        String sql = "{CALL ModificarMedicamento(?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1,med.getId_pro());
            pst.setInt(2, med.getId_cat());
            pst.setString(3, med.getNom_pro());
            pst.setDouble(4, med.getPre_venta());
            pst.setDouble(5, med.getPre_compra());
            pst.setString(6, med.getFecha_venc());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medicamento Actualizado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void EliminarMedicamento(){
        String sql = "{CALL EliminarMeciamento(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, med.getId_pro());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void BuscarNombreMedicamento(JTable tabla){
         String sql = "{CALL BuscarNombreMedicamento(?)}";
         try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, med.getNom_pro());
            rs = pst.executeQuery();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("P. Venta");
            modelo.addColumn("P. Compra");
            modelo.addColumn("Fec. Venc");
            modelo.addColumn("Stock");
            tabla.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[8];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
     
     public void ListarMedicamentosStock(JTable tabla) {
        String sql = "{call ListarMedicamentosStock()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Vencimiento");
            modelo.addColumn("Stock");
            tabla.setModel(modelo);

            while (rs.next()) {
                Object vector[] = new Object[8];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void Tabla(JTable tablin) {
        modeloTabla.addColumn("PRODUCTOS");
        modeloTabla.addColumn("VENDIDOS");
        tablin.setModel(modeloTabla);
    }
    
    public void ListarConsulta(JTable tablon){
        String sql = "{call ListarTop()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("PRODUCTOS");
            modelo.addColumn("VENDIDOS");
            tablon.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[2];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
