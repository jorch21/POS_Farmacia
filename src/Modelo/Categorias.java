
package Modelo;


public class Categorias {
    private static int id_cat;
    private static String cod_cat;
    private static String nom_cat;

    public Categorias() {
    }

    public Categorias(int id_cat, String cod_cat, String nom_cat) {
        this.id_cat = id_cat;
        this.cod_cat = cod_cat;
        this.nom_cat = nom_cat;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(String cod_cat) {
        this.cod_cat = cod_cat;
    }

    public String getNom_cat() {
        return nom_cat;
    }

    public void setNom_cat(String nom_cat) {
        this.nom_cat = nom_cat;
    }
    
    
}
