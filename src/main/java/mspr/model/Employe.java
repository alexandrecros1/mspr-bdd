package mspr.model;

import java.util.Date;

public class Employe {

    private int noEmploye;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    private Date dateEmbauche;
    private Float salaire;
    private Fonction noFonction;

    public int getNoEmploye() {
        return noEmploye;
    }

    public void setNoEmploye(int noEmploye) {
        this.noEmploye = noEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }

    public Fonction getNoFonction() {
        return noFonction;
    }

    public void setNoFonction(Fonction noFonction) {
        this.noFonction = noFonction;
    }

    @Override
    public String toString() {
        return "Employe{" + "noEmploye=" + noEmploye + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", dateEmbauche=" + dateEmbauche + ", salaire=" + salaire + ", noFonction=" + noFonction + '}';
    }
}
