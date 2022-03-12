
package Controlador;


import Modelo.Empleados;
import Modelo.EmpleadosDAO;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ControladorEmpleado {
    
    EmpleadosDAO empdao = new EmpleadosDAO();
    
    public void Estructura_Tabla(JTable tablita){
        empdao.EstructuraTabla(tablita);
    }
    
    public void Listar_Empleados(JTable tabla){
        empdao.ListarEmpleados(tabla);
    }
    
    public void Listar_Combo_Roles(JComboBox combito){
        empdao.ListarComboRoles(combito);
    }
    
    public void Listar_Combo_Distritos(JComboBox combin){
        empdao.ListarComboDistrito(combin);
    }
    
    public void Insertar_Empleados(){
        empdao.InsertarEmpleados();
    }
    
    public void Modificar_Empleados(){
        empdao.ModificarEmpleados();
    }
    
    public void Eliminar_Empleado(){
        empdao.EliminarEmpleados();
    }
    
    public void Buscar_Empleado(JTable tabla){
        empdao.BuscarEmpleados(tabla);
    }
    
    public Empleados Buscar_Nombre_Empleado(String dni_usu){
        return empdao.BuscarNombreEmpleado(dni_usu);
    }
}
