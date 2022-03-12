
package Controlador;

import Modelo.Medicamentos;
import Modelo.MedicamentosDAO;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ControladorMedicamento {
    
    Medicamentos med = new Medicamentos();
    MedicamentosDAO meddao = new MedicamentosDAO();
    
    public void Estructura_Tabla(JTable tablita){
        meddao.EstructuraTabla(tablita);
    }
    
    public void Listar_Medicamentos(JTable tabla){
        meddao.ListarMedicamentos(tabla);
    }
    
    public void Listar_Combo_Medicamentos(JComboBox combito){
        meddao.ListarComboCategoria(combito); 
    }
    
    public Medicamentos Buscar_Medicamento(String codigo){
        return meddao.BuscarMedicamento(codigo);
    }
    
    public void Registrar_Medicamento(){
        meddao.InsertarMedicamentos();
    }
    
    public void Modificar_Medicamento(){
        meddao.ModificarMedicamentos();
    }
    
    public void Eliminar_Medicamento(){
        meddao.EliminarMedicamento();
    }
    
    public void Buscar_Nombre_Medicamento(JTable tabla){
        meddao.BuscarNombreMedicamento(tabla);
    }
    
    public void Listar_Medicamentos_Stock(JTable tabla){
        meddao.ListarMedicamentosStock(tabla);
    }
    
    public void tabla_2(JTable tablin){
        meddao.Tabla(tablin);
    }
    
    public void listar_consulta(JTable tablon){
        meddao.ListarConsulta(tablon);
    }
}
