package mspr.model;

public class Fonction {

    private int noFonction;
    private String nomFonction;

    public int getNoFonction() {
        return noFonction;
    }

    public void setNoFonction(int noFonction) {
        this.noFonction = noFonction;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public void setNomFonction(String nomFonction) {
        this.nomFonction = nomFonction;
    }

    @Override
    public String toString() {
        return "Fonction{" + "noFonction=" + noFonction + ", nomFonction=" + nomFonction + '}';
    }
}
