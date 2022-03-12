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
public class Distritos {
    private int cod_dis;
    private String nom_dis;

    public Distritos() {
    }

    public Distritos(int cod_dis, String nom_dis) {
        this.cod_dis = cod_dis;
        this.nom_dis = nom_dis;
    }

    public int getCod_dis() {
        return cod_dis;
    }

    public void setCod_dis(int cod_dis) {
        this.cod_dis = cod_dis;
    }

    public String getNom_dis() {
        return nom_dis;
    }

    public void setNom_dis(String nom_dis) {
        this.nom_dis = nom_dis;
    }
    
    
}
