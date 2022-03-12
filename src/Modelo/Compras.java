
package Modelo;

public class Compras {
    private static int id_ord;
    private static String cod_ord;
    private static int id_prov;
    private static int id_usu;
    private static String numSerie;
    private static String fecha_ord;
    private static double igv;
    private static double total;

    public Compras() {
    }

    public Compras(int id_ord, String cod_ord, int id_prov, int id_usu,String numSerie, String fecha_ord, double igv, double total) {
        this.id_ord = id_ord;
        this.cod_ord = cod_ord;
        this.id_prov = id_prov;
        this.id_usu = id_usu;
        this.numSerie = numSerie;
        this.fecha_ord = fecha_ord;
        this.igv = igv;
        this.total = total;
    }

    public int getId_ord() {
        return id_ord;
    }

    public void setId_ord(int id_ord) {
        this.id_ord = id_ord;
    }

    public String getCod_ord() {
        return cod_ord;
    }

    public void setCod_ord(String cod_ord) {
        this.cod_ord = cod_ord;
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public static String getNumSerie() {
        return numSerie;
    }

    public static void setNumSerie(String numSerie) {
        Compras.numSerie = numSerie;
    }
    
    

    public String getFecha_ord() {
        return fecha_ord;
    }

    public void setFecha_ord(String fecha_ord) {
        this.fecha_ord = fecha_ord;
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
