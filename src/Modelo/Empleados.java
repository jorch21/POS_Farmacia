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
public class Empleados {
    public static int id_usu;
    public static int cod_rol;
    public static int cod_dis;
    public static String cod_usu;
    public static String nom_rol;
    public static String dni_usu;
    public static String nom_usu;
    public static String ape_usu;
    public static String dir_usu;
    public static String nom_dis;
    public static String edad;
    public static String telefono;
    public static String fecha_ingreso;
    public static double sueldo;
    public static String correo;

    public Empleados() {
    }
    
    public Empleados(int id_usu, String cod_usu,int cod_rol, String dni_usu, String nom_usu, String ape_usu, String dir_usu, int cod_dis, String edad, String telefono, String fecha_ingreso, double sueldo, String correo) {
        this.id_usu = id_usu;
        this.cod_usu = cod_usu;
        this.cod_rol = cod_rol;
        this.dni_usu = dni_usu;
        this.nom_usu = nom_usu;
        this.ape_usu = ape_usu;
        this.dir_usu = dir_usu;
        this.cod_dis = cod_dis;
        this.edad = edad;
        this.telefono = telefono;
        this.fecha_ingreso = fecha_ingreso;
        this.sueldo = sueldo;
        this.correo = correo;
    }

    public static int getId_usu() {
        return id_usu;
    }

    public static void setId_usu(int id_usu) {
        Empleados.id_usu = id_usu;
    }

    public static int getCod_rol() {
        return cod_rol;
    }

    public static void setCod_rol(int cod_rol) {
        Empleados.cod_rol = cod_rol;
    }

    public static int getCod_dis() {
        return cod_dis;
    }

    public static void setCod_dis(int cod_dis) {
        Empleados.cod_dis = cod_dis;
    }

    public static String getCod_usu() {
        return cod_usu;
    }

    public static void setCod_usu(String cod_usu) {
        Empleados.cod_usu = cod_usu;
    }

    public static String getNom_rol() {
        return nom_rol;
    }

    public static void setNom_rol(String nom_rol) {
        Empleados.nom_rol = nom_rol;
    }

    public static String getNom_usu() {
        return nom_usu;
    }

    public static void setNom_usu(String nom_usu) {
        Empleados.nom_usu = nom_usu;
    }

    public static String getApe_usu() {
        return ape_usu;
    }

    public static void setApe_usu(String ape_usu) {
        Empleados.ape_usu = ape_usu;
    }

    public static String getDir_usu() {
        return dir_usu;
    }

    public static void setDir_usu(String dir_usu) {
        Empleados.dir_usu = dir_usu;
    }

    public static String getNom_dis() {
        return nom_dis;
    }

    public static void setNom_dis(String nom_dis) {
        Empleados.nom_dis = nom_dis;
    }

    public static String getEdad() {
        return edad;
    }

    public static void setEdad(String edad) {
        Empleados.edad = edad;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Empleados.telefono = telefono;
    }

    public static String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public static void setFecha_ingreso(String fecha_ingreso) {
        Empleados.fecha_ingreso = fecha_ingreso;
    }

    public static double getSueldo() {
        return sueldo;
    }

    public static void setSueldo(double sueldo) {
        Empleados.sueldo = sueldo;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Empleados.correo = correo;
    }

    public static String getDni_usu() {
        return dni_usu;
    }

    public static void setDni_usu(String dni_usu) {
        Empleados.dni_usu = dni_usu;
    }
    
    
}
