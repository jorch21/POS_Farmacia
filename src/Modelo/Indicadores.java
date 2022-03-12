
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Indicadores {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Client cli = new Client();
    
    public int ObtenerClientesActivos(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) as Activos FROM Clientes WHERE estado = 1");
            if(rs.next()){
                return rs.getInt("Activos");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int ObtenerClientesTotales(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) as Totales FROM Clientes");
            if(rs.next()){
                return rs.getInt("Totales");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int obtenerProveedoresCertificados(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) AS 'Proveedores Certificados' FROM Proveedores where certificacion = 'si' and estado = 1");
            if(rs.next()){
                return rs.getInt("Proveedores Certificados");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int ontenerTotalProveedores(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) AS 'Total Proveedores' FROM Proveedores");
            if(rs.next()){
                return rs.getInt("Total Proveedores");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int obtenerStockTotal(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT SUM(stock) AS 'Total Inventario' FROM Productos where estado = 1");
            if(rs.next()){
                return rs.getInt("Total Inventario");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int obtenerStockPendiente(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) AS 'STOCK CERO' FROM Productos where stock=0 and estado = 1");
            if(rs.next()){
                return rs.getInt("STOCK CERO");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int obtenerProductos(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT COUNT(*) AS 'Total Stock' FROM Productos where estado = 1");
            if(rs.next()){
                return rs.getInt("Total Stock");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int obtenerTotalProductosVendidos(String fecha){
        try {
            String sql ="{CALL ProductoVendidos(?)}";
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setString(1,fecha);
            rs = pst.executeQuery();
            if(rs.next()){
                return rs.getInt("Total Productos");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    public int ObtenerTotalVentas(String fecha){
        try {
            String sql ="{CALL VentasTotales(?)}";
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setString(1,fecha);
            rs = pst.executeQuery();
            if(rs.next()){
                return rs.getInt("Total Ventas");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    public int ObtenerTotalVentas(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT SUM(total) Ventas FROM Ventas where estado = 'ATENDIDO'");
            if(rs.next()){
                return rs.getInt("Ventas");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int ObtenerValorProductos(){
        try {
            con = cn.getConexion();
            Statement consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT SUM(stock*pre_venta) Productos FROM Productos where estado = 1 and stock>0");
            if(rs.next()){
                return rs.getInt("Productos");
            }else{
                System.out.println("Ningun resultado encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
