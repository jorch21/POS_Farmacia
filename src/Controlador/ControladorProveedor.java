
package Controlador;

import Modelo.Proveedores;
import Modelo.ProveedoresDAO;
import javax.swing.JTable;

public class ControladorProveedor {
    ProveedoresDAO provdao = new ProveedoresDAO();
    
    public void Estructura_Tabla(JTable tablita){
        provdao.EstructuraTabla(tablita);
    }
    
    public void Listar_Proveedores(JTable tabla){
        provdao.ListarProveedores(tabla);
    }
    
    public void Insertar_Proveedores(){
        provdao.InsertarProveedores();
    }
    
    public void Modificar_Proveedor(){
        provdao.ModificarProveedores();
    }
    
    public void Eliminar_Proveedor(){
        provdao.EliminarProveedores();
    }
    
    public void Buscar_Proveedor(JTable tabla){
        provdao.BuscarProveedores(tabla);
    }
    
    public Proveedores Buscar_Nombre_Proveedor(String ruc){
        return provdao.BuscarNombreProveedor(ruc);
    }
}
