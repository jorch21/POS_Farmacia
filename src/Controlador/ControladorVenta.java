/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.VentasDAO;

/**
 *
 * @author Jordie
 */
public class ControladorVenta {
    VentasDAO vendao = new VentasDAO();
    
        
    public void Insertar_Venta(){
        vendao.InsertarVentas();
    }
    
    public String Nro_Serie_Venta(){
        return vendao.NroSerieVenta();
    }
    
    public void Insertar_Detalle_Venta(){
        vendao.InsertarDetalleVenta();
    }
}
