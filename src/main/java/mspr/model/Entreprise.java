package mspr.model;

public class Entreprise {

    private long siret;
    private String raisonSociale;
    private int noRueEntr;
    private String rueEntr;
    private int cPostalEntr;
    private String villeEntr;
    private int noTel;
    private String contact;

    public long getSiret() {
        return siret;
    }

    public void setSiret(long siret) {
        this.siret = siret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public int getNoRueEntr() {
        return noRueEntr;
    }

    public void setNoRueEntr(int noRueEntr) {
        this.noRueEntr = noRueEntr;
    }

    public String getRueEntr() {
        return rueEntr;
    }

    public void setRueEntr(String rueEntr) {
        this.rueEntr = rueEntr;
    }

    public int getcPostalEntr() {
        return cPostalEntr;
    }

    public void setcPostalEntr(int cPostalEntr) {
        this.cPostalEntr = cPostalEntr;
    }

    public String getVilleEntr() {
        return villeEntr;
    }

    public void setVilleEntr(String villeEntr) {
        this.villeEntr = villeEntr;
    }

    public int getNoTel() {
        return noTel;
    }

    public void setNoTel(int noTel) {
        this.noTel = noTel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Entreprise{" + "siret=" + siret + ", raisonSociale=" + raisonSociale + ", noRueEntr=" + noRueEntr + ", rueEntr=" + rueEntr + ", cPostalEntr=" + cPostalEntr + ", villeEntr=" + villeEntr + ", noTel=" + noTel + ", contact=" + contact + '}';
    }
}
