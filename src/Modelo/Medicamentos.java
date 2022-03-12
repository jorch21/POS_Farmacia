
package Modelo;



public class Medicamentos {
    private static int id_pro;
    private static int id_cat;
    private static String cod_pro;
    private static String nom_cat;
    private static String nom_pro;
    private static double pre_venta;
    private static double pre_compra;
    private static String fecha_venc;
    private static int stock;

    public Medicamentos() {
    }
    
    public Medicamentos(int id_pro,String cod_pro, int id_cat, String nom_pro, double pre_venta, double pre_compra, String fecha_venc, int stock) {
        this.id_pro = id_pro;
        this.cod_pro = cod_pro;
        this.id_cat = id_cat;
        this.nom_pro = nom_pro;
        this.pre_venta = pre_venta;
        this.pre_compra = pre_compra;
        this.fecha_venc = fecha_venc;
        this.stock = stock;
    }

    public static int getId_pro() {
        return id_pro;
    }

    public static void setId_pro(int id_pro) {
        Medicamentos.id_pro = id_pro;
    }

    public static int getId_cat() {
        return id_cat;
    }

    public static void setId_cat(int id_cat) {
        Medicamentos.id_cat = id_cat;
    }

    public static String getCod_pro() {
        return cod_pro;
    }

    public static void setCod_pro(String cod_pro) {
        Medicamentos.cod_pro = cod_pro;
    }

    public static String getNom_cat() {
        return nom_cat;
    }

    public static void setNom_cat(String nom_cat) {
        Medicamentos.nom_cat = nom_cat;
    }

    public static String getNom_pro() {
        return nom_pro;
    }

    public static void setNom_pro(String nom_pro) {
        Medicamentos.nom_pro = nom_pro;
    }

    public static double getPre_venta() {
        return pre_venta;
    }

    public static void setPre_venta(double pre_venta) {
        Medicamentos.pre_venta = pre_venta;
    }

    public static double getPre_compra() {
        return pre_compra;
    }

    public static void setPre_compra(double pre_compra) {
        Medicamentos.pre_compra = pre_compra;
    }

    public static String getFecha_venc() {
        return fecha_venc;
    }

    public static void setFecha_venc(String fecha_venc) {
        Medicamentos.fecha_venc = fecha_venc;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Medicamentos.stock = stock;
    }
    
    
}
