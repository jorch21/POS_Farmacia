/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientDAO {

    Client cli = new Client();
    int r;
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public void EstructuraTabla(JTable tablita) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Documento");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Distrito");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Fecha Registro");
        tablita.setModel(modeloTabla);
    }

    public void ListarClientes(JTable tabla) {
        String sql = "{call ListarClientes()}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Documento");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Distrito");
            modelo.addColumn("Sexo");
            modelo.addColumn("Telefono");
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
    
    public void ListarComboDistrito(JComboBox combito){
        String sql = "SELECT nom_dis FROM Distritos";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            combito.removeAllItems();
            combito.addItem("Seleccionar");
            while(rs.next()){
                combito.addItem(rs.getObject("nom_dis"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void InsertarClientes(){
        String sql = "{CALL RegistrarCliente(?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, cli.getDni_ruc());
            pst.setString(2, cli.getNom_cli());
            pst.setString(3, cli.getDir_cli());
            pst.setInt(4, cli.getCod_dis());
            pst.setString(5, cli.getSexo());
            pst.setString(6, cli.getTelefono());
            pst.setString(7, cli.getFecha_registro());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Registrado con exito!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ModificarCliente(){
        String sql = "{CALL ModificarCliente(?,?,?,?,?,?,?,?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, cli.getId_cli());
            pst.setString(2, cli.getDni_ruc());
            pst.setString(3, cli.getNom_cli());
            pst.setString(4, cli.getDir_cli());
            pst.setInt(5, cli.getCod_dis());
            pst.setString(6, cli.getSexo());
            pst.setString(7, cli.getTelefono());
            pst.setString(8, cli.getFecha_registro());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de Cliente Actualizados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void EliminarCliente(){
        String sql = "{CALL EliminarCliente(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setInt(1, cli.getId_cli());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BuscarCliente(JTable tabla){
        String sql = "{CALL BuscarCliente(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, cli.getNom_cli());
            rs = pst.executeQuery();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Documento");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Distrito");
            modelo.addColumn("Sexo");
            modelo.addColumn("Telefono");
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
    
    public void BuscarDniCliente(JTable tabla){
        String sql = "{CALL BuscarDniCliente(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareCall(sql);
            pst.setString(1, cli.getDni_ruc());
            rs = pst.executeQuery();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Documento");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Distrito");
            modelo.addColumn("Sexo");
            modelo.addColumn("Telefono");
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
    
    public Client BuscarNombreCliente(String dni_ruc){
        String sql = "{CALL BuscarNombreCliente(?)}";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setString(1, dni_ruc);
            rs = pst.executeQuery();
            if(rs.next()){
                cli.setNom_cli(rs.getString("nom_cli"));
                cli.setId_cli(rs.getInt("id_cli"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cli;
    }
    
    
}
