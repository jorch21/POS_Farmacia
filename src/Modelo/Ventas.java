
package Modelo;


public class Ventas {
    private static int id_ven;
    private static int id_usu;
    private static int id_cli;
    private static String cod_ven;
    private static String nom_usu;
    private static String nom_cli;
    private static String num_serie;
    private static String fecha_venta;
    private static double igv;
    private static double total;

    public Ventas() {
    }

    public Ventas(int id_ven, String cod_ven, int id_usu, int id_cli,String num_serie, String fecha_venta, double igv, double total) {
        this.id_ven = id_ven;
        this.id_usu = id_usu;
        this.id_cli = id_cli;
        this.num_serie = num_serie;
        this.fecha_venta = fecha_venta;
        this.igv = igv;
        this.total = total;
    }

    public int getId_ven() {
        return id_ven;
    }

    public void setId_ven(int id_ven) {
        this.id_ven = id_ven;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getCod_ven() {
        return cod_ven;
    }

    public void setCod_ven(String cod_ven) {
        this.cod_ven = cod_ven;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public static String getNum_serie() {
        return num_serie;
    }

    public static void setNum_serie(String num_serie) {
        Ventas.num_serie = num_serie;
    }
    
    

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
