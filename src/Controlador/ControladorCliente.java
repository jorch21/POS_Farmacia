/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Client;
import Modelo.ClientDAO;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ControladorCliente {
    Client cli = new Client();
    ClientDAO clidao = new ClientDAO();
    
    public void Estructura_Tabla(JTable tablita){
        clidao.EstructuraTabla(tablita);
    }
    public void Listar_Clientes(JTable tabla){
        clidao.ListarClientes(tabla);
    }
    
    public void Listar_Combo_Distritos(JComboBox combito){
        clidao.ListarComboDistrito(combito);
    }
    
    public void Insertar_Clientes(){
        clidao.InsertarClientes();
    }
    
    public void Modificar_Cliente(){
        clidao.ModificarCliente();
    }
    
    public void Eliminar_Cliente(){
        clidao.EliminarCliente();
    }
    
    public void Buscar_Cliente(JTable tabla){
        clidao.BuscarCliente(tabla);
    }
    
    public void Buscar_Dni_Cliente(JTable tablon){
        clidao.BuscarDniCliente(tablon); 
    }
    
    public Client Buscar_Nombre_Cliente(String dni_ruc){
        return clidao.BuscarNombreCliente(dni_ruc);
    }
    
    
}
