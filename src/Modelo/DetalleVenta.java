/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jordie
 */
public class DetalleVenta {
    private static int id_detalle;
    private static String cod_detalle;
    private static int id_pro;
    private static int id_ven;
    private static int cantidad;
    private static double precio;

    public DetalleVenta() {
        
    }

    public DetalleVenta(int id_detalle, String cod_detalle, int id_pro, int id_ven, int cantidad, double precio) {
        this.id_detalle = id_detalle;
        this.cod_detalle = cod_detalle;
        this.id_pro = id_pro;
        this.id_ven = id_ven;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(String cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getId_ven() {
        return id_ven;
    }

    public void setId_ven(int id_ven) {
        this.id_ven = id_ven;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

      
    
    
}
