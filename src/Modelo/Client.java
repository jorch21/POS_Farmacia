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
public class Client {
    private static int id_cli;
    private static int cod_dis;
    private static String cod_cli;
    private static String dni_ruc;
    private static String nom_cli;
    private static String dir_cli;
    private static String nom_dis;
    private static String sexo;
    private static String telefono;
    private static String fecha_registro;

    public Client() {
    }
    
    public Client(int id_cli,String cod_cli,String dni_ruc,String nom_cli,String dir_cli,int cod_dis,String sexo,String telefono,String fecha_registro) {
        this.id_cli = id_cli;
        this.dni_ruc = dni_ruc;
        this.nom_cli = nom_cli;
        this.dir_cli = dir_cli;
        this.cod_dis = cod_dis;
        this.sexo = sexo;
        this.telefono = telefono;
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the id_cli
     */
    public static int getId_cli() {
        return id_cli;
    }

    /**
     * @param aId_cli the id_cli to set
     */
    public static void setId_cli(int aId_cli) {
        id_cli = aId_cli;
    }

    /**
     * @return the cod_dis
     */
    public static int getCod_dis() {
        return cod_dis;
    }

    /**
     * @param aCod_dis the cod_dis to set
     */
    public static void setCod_dis(int aCod_dis) {
        cod_dis = aCod_dis;
    }

    /**
     * @return the cod_cli
     */
    public static String getCod_cli() {
        return cod_cli;
    }

    /**
     * @param aCod_cli the cod_cli to set
     */
    public static void setCod_cli(String aCod_cli) {
        cod_cli = aCod_cli;
    }

    /**
     * @return the dni_ruc
     */
    public static String getDni_ruc() {
        return dni_ruc;
    }

    /**
     * @param aDni_ruc the dni_ruc to set
     */
    public static void setDni_ruc(String aDni_ruc) {
        dni_ruc = aDni_ruc;
    }

    /**
     * @return the nom_cli
     */
    public static String getNom_cli() {
        return nom_cli;
    }

    /**
     * @param aNom_cli the nom_cli to set
     */
    public static void setNom_cli(String aNom_cli) {
        nom_cli = aNom_cli;
    }

    /**
     * @return the dir_cli
     */
    public static String getDir_cli() {
        return dir_cli;
    }

    /**
     * @param aDir_cli the dir_cli to set
     */
    public static void setDir_cli(String aDir_cli) {
        dir_cli = aDir_cli;
    }

    /**
     * @return the nom_dis
     */
    public static String getNom_dis() {
        return nom_dis;
    }

    /**
     * @param aNom_dis the nom_dis to set
     */
    public static void setNom_dis(String aNom_dis) {
        nom_dis = aNom_dis;
    }

    /**
     * @return the sexo
     */
    public static String getSexo() {
        return sexo;
    }

    /**
     * @param aSexo the sexo to set
     */
    public static void setSexo(String aSexo) {
        sexo = aSexo;
    }

    /**
     * @return the telefono
     */
    public static String getTelefono() {
        return telefono;
    }

    /**
     * @param aTelefono the telefono to set
     */
    public static void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    /**
     * @return the fecha_registro
     */
    public static String getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param aFecha_registro the fecha_registro to set
     */
    public static void setFecha_registro(String aFecha_registro) {
        fecha_registro = aFecha_registro;
    }

    
    
    
}
