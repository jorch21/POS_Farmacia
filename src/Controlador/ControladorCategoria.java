
package Controlador;

import Modelo.CategoriaDAO;
import javax.swing.JTable;


public class ControladorCategoria {
    CategoriaDAO catdao = new CategoriaDAO();
    
    public void Estructura_Tabla(JTable tablita){
        catdao.EstructuraTabla(tablita);
    }
    public void Listar_Categorias(JTable tabla){
        catdao.ListarCategorias(tabla);
    }
    
    public void Insertar_Categoria(){
        catdao.InsertarCategoria();
    }
    
    public void Modificar_Categoria(){
        catdao.ModificarCategoria();
    }
    
    public void Eliminar_Categoria(){
        catdao.EliminarCategoria();
    }
}
