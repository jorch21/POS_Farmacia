
package Modelo;

public class DetalleCompras {
    private static int id_det;
    private static int cod_det;
    private static int id_ord;
    private static int id_pro;
    private static int cantidad;
    private static double precio;

    public DetalleCompras() {
    }

    public DetalleCompras(int id_det, int cod_det, int id_ord, int id_pro, int cantidad, double precio) {
        this.id_det = id_det;
        this.cod_det = cod_det;
        this.id_ord = id_ord;
        this.id_pro = id_pro;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_det() {
        return id_det;
    }

    public void setId_det(int id_det) {
        this.id_det = id_det;
    }

    public int getCod_det() {
        return cod_det;
    }

    public void setCod_det(int cod_det) {
        this.cod_det = cod_det;
    }

    public int getId_ord() {
        return id_ord;
    }

    public void setId_ord(int id_ord) {
        this.id_ord = id_ord;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
