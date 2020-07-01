package mspr.model;

public class CentreTraitement {
    
    private int noCentre;
    private String nomCentre;
    private int noRueCentre;
    private String rueCentre;
    private int cPostalCentre;
    private String villeCentre;

    public int getNoCentre() {
        return noCentre;
    }

    public void setNoCentre(int noCentre) {
        this.noCentre = noCentre;
    }

    public String getNomCentre() {
        return nomCentre;
    }

    public void setNomCentre(String nomCentre) {
        this.nomCentre = nomCentre;
    }

    public int getNoRueCentre() {
        return noRueCentre;
    }

    public void setNoRueCentre(int noRueCentre) {
        this.noRueCentre = noRueCentre;
    }

    public String getRueCentre() {
        return rueCentre;
    }

    public void setRueCentre(String rueCentre) {
        this.rueCentre = rueCentre;
    }

    public int getcPostalCentre() {
        return cPostalCentre;
    }

    public void setcPostalCentre(int cPostalCentre) {
        this.cPostalCentre = cPostalCentre;
    }

    public String getVilleCentre() {
        return villeCentre;
    }

    public void setVilleCentre(String villeCentre) {
        this.villeCentre = villeCentre;
    }

    @Override
    public String toString() {
        return "CentreTraitement{" + "noCentre=" + noCentre + ", nomCentre=" + nomCentre + ", noRueCentre=" + noRueCentre + ", rueCentre=" + rueCentre + ", cPostalCentre=" + cPostalCentre + ", villeCentre=" + villeCentre + '}';
    }
}
