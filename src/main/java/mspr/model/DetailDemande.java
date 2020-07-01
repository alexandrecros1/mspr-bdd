package mspr.model;

public class DetailDemande {

    private int quantiteEnlevee;
    private String remarque;
    private Demande noDemande;
    private TypeDechet noTypeDechet;

    public int getQuantiteEnlevee() {
        return quantiteEnlevee;
    }

    public void setQuantiteEnlevee(int quantiteEnlevee) {
        this.quantiteEnlevee = quantiteEnlevee;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public Demande getNoDemande() {
        return noDemande;
    }

    public void setNoDemande(Demande noDemande) {
        this.noDemande = noDemande;
    }

    public TypeDechet getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(TypeDechet noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }

    @Override
    public String toString() {
        return "DetailDemande{" + "quantiteEnlevee=" + quantiteEnlevee + ", remarque=" + remarque + ", noDemande=" + noDemande + ", noTypeDechet=" + noTypeDechet + '}';
    }
}
