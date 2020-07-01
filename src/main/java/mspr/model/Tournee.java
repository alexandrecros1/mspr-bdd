package mspr.model;

import java.util.Date;

public class Tournee {

    private int noTournee;
    private Date dateTournee;
    private Camion noImmatric;
    private Employe noEmploye;

    public int getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(int noTournee) {
        this.noTournee = noTournee;
    }

    public Date getDateTournee() {
        return dateTournee;
    }

    public void setDateTournee(Date dateTournee) {
        this.dateTournee = dateTournee;
    }

    public Camion getNoImmatric() {
        return noImmatric;
    }

    public void setNoImmatric(Camion noImmatric) {
        this.noImmatric = noImmatric;
    }

    public Employe getNoEmploye() {
        return noEmploye;
    }

    public void setNoEmploye(Employe noEmploye) {
        this.noEmploye = noEmploye;
    }

    @Override
    public String toString() {
        return "Tournee{" + "noTournee=" + noTournee + ", dateTournee=" + dateTournee + ", noImmatric=" + noImmatric + ", noEmploye=" + noEmploye + '}';
    }
}
