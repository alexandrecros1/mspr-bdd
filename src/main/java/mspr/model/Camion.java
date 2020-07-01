package mspr.model;

import java.util.Date;

public class Camion {

    private String noImmatric;
    private Date dateAchat;
    private String modele;
    private String marque;

    public String getNoImmatric() {
        return noImmatric;
    }

    public void setNoImmatric(String noImmatric) {
        this.noImmatric = noImmatric;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Camion{" + "noImmatric=" + noImmatric + ", dateAchat=" + dateAchat + ", modele=" + modele + ", marque=" + marque + '}';
    } 
}
