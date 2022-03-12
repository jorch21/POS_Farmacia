
package Modelo;



public class Proveedores {
    private static int id_prov;
    private static String cod_prov;
    private static String ruc_prov;
    private static String nom_prov;
    private static String dir_prov;
    private static String telefono;
    private static String correo;
    private static String certificacion;
    private static String fecha_registro;

    public Proveedores() {
    }

    public Proveedores(int id_prov,  String cod_prov, String ruc_prov, String nom_prov, String dir_prov, String telefono, String correo, String certificacion, String fecha_registro) {
        this.id_prov = id_prov;        
        this.cod_prov = cod_prov;
        this.ruc_prov = ruc_prov;
        this.nom_prov = nom_prov;
        this.dir_prov = dir_prov;
        this.telefono = telefono;
        this.correo = correo;
        this.certificacion = certificacion;
        this.fecha_registro = fecha_registro;
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getRuc_prov() {
        return ruc_prov;
    }

    public void setRuc_prov(String ruc_prov) {
        this.ruc_prov = ruc_prov;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getDir_prov() {
        return dir_prov;
    }

    public void setDir_prov(String dir_prov) {
        this.dir_prov = dir_prov;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public static String getFecha_registro() {
        return fecha_registro;
    }

    public static void setFecha_registro(String fecha_registro) {
        Proveedores.fecha_registro = fecha_registro;
    }
    
        
    
}
