
package Controlador;

import Modelo.ComprasDAO;


public class ControladorCompra {
    ComprasDAO comdao = new ComprasDAO();
    
    public void Insertar_Compra(){
        comdao.InsertarCompras();
    }
    
    public String Nro_Serie_Compra(){
        return comdao.NroSerieCompra();
    }
    
    public void Insertar_Detalle_Compra(){
        comdao.InsertarDetalleCompra();
    }
}
