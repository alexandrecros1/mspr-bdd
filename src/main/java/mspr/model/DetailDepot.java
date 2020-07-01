package mspr.model;

public class DetailDepot {

    private int quantiteDeposee;
    private Tournee noTournee;
    private TypeDechet noTypeDechet;
    private CentreTraitement noCentre;

    public int getQuantiteDeposee() {
        return quantiteDeposee;
    }

    public void setQuantiteDeposee(int quantiteDeposee) {
        this.quantiteDeposee = quantiteDeposee;
    }

    public Tournee getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(Tournee noTournee) {
        this.noTournee = noTournee;
    }

    public TypeDechet getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(TypeDechet noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }

    public CentreTraitement getNoCentre() {
        return noCentre;
    }

    public void setNoCentre(CentreTraitement noCentre) {
        this.noCentre = noCentre;
    }

    @Override
    public String toString() {
        return "DetailDepot{" + "quantiteDeposee=" + quantiteDeposee + ", noTournee=" + noTournee + ", noTypeDechet=" + noTypeDechet + ", noCentre=" + noCentre + '}';
    }
}
