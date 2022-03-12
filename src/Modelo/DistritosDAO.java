/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jordie
 */
public class DistritosDAO {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    
    public Distritos buscarDistrito(int cod_dis){
        Distritos dis = new Distritos();
        String sql = "SELECT * FROM Distritos WHERE cod_dis = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod_dis);
            rs = ps.executeQuery();
            if(rs.next()){
                dis.setNom_dis(rs.getString("nom_dis"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return dis;
    }
    
    public Distritos buscarNomDistrito(String nom_dis){
        Distritos dis = new Distritos();
        String sql = "SELECT * FROM Distritos WHERE nom_dis=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nom_dis);
            rs = ps.executeQuery();
            if(rs.next()){
                dis.setCod_dis(rs.getInt("cod_dis"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return dis;
    }
}
