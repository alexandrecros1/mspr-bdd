package mspr.model;

import java.util.Date;
import java.util.List;

public class Demande {

    private int noDemande;
    private Date dateDemande;
    private Date dateEnlevement;
    private String web_O_N;
    private Entreprise siret;
    private Tournee noTournee;
    private List<TypeDechet> typeDechets;

    public int getNoDemande() {
        return noDemande;
    }

    public void setNoDemande(int noDemande) {
        this.noDemande = noDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getDateEnlevement() {
        return dateEnlevement;
    }

    public void setDateEnlevement(Date dateEnlevement) {
        this.dateEnlevement = dateEnlevement;
    }

    public String getWeb_O_N() {
        return web_O_N;
    }

    public void setWeb_O_N(String web_O_N) {
        this.web_O_N = web_O_N;
    }

    public Entreprise getSiret() {
        return siret;
    }

    public void setSiret(Entreprise siret) {
        this.siret = siret;
    }

    public Tournee getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(Tournee noTournee) {
        this.noTournee = noTournee;
    }

    public List<TypeDechet> getTypeDechets() {
        return typeDechets;
    }

    public void setTypeDechets(List<TypeDechet> typeDechets) {
        this.typeDechets = typeDechets;
    }

    @Override
    public String toString() {
        return "Demande{" + "noDemande=" + noDemande + ", dateDemande=" + dateDemande + ", dateEnlevement=" + dateEnlevement + ", web_O_N=" + web_O_N + ", siret=" + siret + ", noTournee=" + noTournee + ", typeDechets=" + typeDechets + '}';
    }
    
    public String toStringDechets(){
        
        String str = "Demande : " + "Numéro de la demande=" + noDemande + ", Raison sociale=" + siret.getRaisonSociale() + ", Numéro de tournee=" + noTournee.getNoTournee() + "\n";
        str += "Quantité pour chaque déchet : \n";
        //str += this.typeDechets.stream().map((typeDechet) -> typeDechet.toString() + "\n").reduce(str, String::concat);
        return str;
    }
}
