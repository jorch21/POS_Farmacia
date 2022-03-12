
package Modelo;

import Vista.frmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login {
    Empleados emp = new Empleados();
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public int Login(String user, String pass){
        Integer resultado = 0;
        String sql = "Select u.id_usu,u.nom_usu,u.dni_usu,u.clave,r.nom_rol rol from Usuarios u inner join Roles r on u.cod_rol = r.cod_rol where dni_usu='"+user+"' and clave='"+pass+"' and estado=1";
        try {
            con = cn.getConexion();
            Statement ejecutor = con.createStatement();
            rs = ejecutor.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvendido "+rs.getString("nom_usu"));
                emp.setNom_usu(rs.getString("nom_usu")); 
                emp.setNom_rol(rs.getString("rol"));
                emp.setDni_usu(rs.getString("dni_usu"));
                emp.setId_usu(rs.getInt("id_usu"));
                resultado = 1;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrecto");
                resultado = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e.getMessage(),e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
}
