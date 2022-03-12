
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CategoriaDAO {
    Categorias cat = new Categorias();
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public void EstructuraTabla(JTable tablita) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        tablita.setModel(modeloTabla);
    }
    
    public void ListarCategorias(JTable tabla) {
        String sql = "{call ListarCategoria()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            tabla.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[3];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void InsertarCategoria(){
        String sql = "{CALL RegistrarCategoria(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, cat.getNom_cat());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Categoria Registrada con exito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ModificarCategoria(){
        String sql = "{CALL ModificarCategoria(?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, cat.getId_cat());
            pst.setString(2, cat.getNom_cat());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de Categoria Actualizados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void EliminarCategoria(){
        String sql = "{CALL EliminarCategoria(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, cat.getId_cat());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
