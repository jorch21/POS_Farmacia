
package Modelo;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadosDAO {
    
    Empleados emp = new Empleados();
    int r;
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public void EstructuraTabla(JTable tablita) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Rol");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Distrito");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Fecha Ingreso");
        modeloTabla.addColumn("Sueldo");
        modeloTabla.addColumn("Correo");
        tablita.setModel(modeloTabla);
    }
    
    public void ListarEmpleados(JTable tabla) {
        String sql = "{call ListarEmpleados()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Rol");
            modelo.addColumn("DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Direccion");
            modelo.addColumn("Distrito");
            modelo.addColumn("Edad");
            modelo.addColumn("Telefono");
            modelo.addColumn("Fecha Ingreso");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Correo");
            tabla.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[13];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                vector[8] = rs.getObject(9);
                vector[9] = rs.getObject(10);
                vector[10] = rs.getObject(11);
                vector[11] = rs.getObject(12);
                vector[12] = rs.getObject(13);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ListarComboRoles(JComboBox combito){
        String sql = "SELECT nom_rol FROM Roles";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            combito.removeAllItems();
            combito.addItem("Seleccionar");
            while(rs.next()){
                combito.addItem(rs.getObject("nom_rol"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ListarComboDistrito(JComboBox combin){
        String sql = "SELECT nom_dis FROM Distritos";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            combin.removeAllItems();
            combin.addItem("Seleccionar");
            while(rs.next()){
                combin.addItem(rs.getObject("nom_dis"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void InsertarEmpleados(){
        String sql = "{CALL RegistrarEmpleado(?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, emp.getCod_rol());
            pst.setString(2, emp.getDni_usu());
            pst.setString(3, emp.getNom_usu());
            pst.setString(4, emp.getApe_usu());
            pst.setString(5, emp.getDir_usu());
            pst.setInt(6, emp.getCod_dis());
            pst.setString(7, emp.getEdad());
            pst.setString(8, emp.getTelefono());
            pst.setString(9, emp.getFecha_ingreso());
            pst.setDouble(10, emp.getSueldo());
            pst.setString(11, emp.getCorreo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Registrado con exito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ModificarEmpleados(){
        String sql = "{CALL ModificarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, emp.getId_usu());
            pst.setInt(2, emp.getCod_rol());
            pst.setString(3, emp.getDni_usu());
            pst.setString(4, emp.getNom_usu());
            pst.setString(5, emp.getApe_usu());
            pst.setString(6, emp.getDir_usu());
            pst.setInt(7, emp.getCod_dis());
            pst.setString(8, emp.getEdad());
            pst.setString(9, emp.getTelefono());
            pst.setString(10, emp.getFecha_ingreso());
            pst.setDouble(11, emp.getSueldo());
            pst.setString(12, emp.getCorreo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de Usuario Actualizados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void EliminarEmpleados(){
        String sql = "{CALL EliminarEmpleado(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, emp.getId_usu());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BuscarEmpleados(JTable tabla){
        String sql = "{CALL BuscarEmpleados(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, emp.getNom_usu());
            rs = pst.executeQuery();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Rol");
            modelo.addColumn("DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Direccion");
            modelo.addColumn("Distrito");
            modelo.addColumn("Edad");
            modelo.addColumn("Telefono");
            modelo.addColumn("Fecha Ingreso");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Correo");
            tabla.setModel(modelo);
            
            while(rs.next()){
                Object vector[] = new Object[13];
                vector[0] = rs.getObject(1);
                vector[1] = rs.getObject(2);
                vector[2] = rs.getObject(3);
                vector[3] = rs.getObject(4);
                vector[4] = rs.getObject(5);
                vector[5] = rs.getObject(6);
                vector[6] = rs.getObject(7);
                vector[7] = rs.getObject(8);
                vector[8] = rs.getObject(9);
                vector[9] = rs.getObject(10);
                vector[10] = rs.getObject(11);
                vector[11] = rs.getObject(12);
                vector[12] = rs.getObject(13);
                modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Empleados BuscarNombreEmpleado(String dni_usu){
        String sql = "{CALL BuscarNombreEmpleado(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setString(1, dni_usu);
            rs = pst.executeQuery();
            if(rs.next()){
                emp.setNom_usu(rs.getString("nom_usu"));
                emp.setId_usu(rs.getInt("id_usu"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return emp;
    }
    
}
