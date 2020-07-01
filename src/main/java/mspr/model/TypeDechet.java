package mspr.model;

public class TypeDechet {

    private int noTypeDechet;
    private String nomTypeDechet;
    private int nivDanger;

    public int getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(int noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }

    public String getNomTypeDechet() {
        return nomTypeDechet;
    }

    public void setNomTypeDechet(String nomTypeDechet) {
        this.nomTypeDechet = nomTypeDechet;
    }

    public int getNivDanger() {
        return nivDanger;
    }

    public void setNivDanger(int nivDanger) {
        this.nivDanger = nivDanger;
    }

    @Override
    public String toString() {
        return "TypeDechet{" + "noTypeDechet=" + noTypeDechet + ", nomTypeDechet=" + nomTypeDechet + ", nivDanger=" + nivDanger + '}';
    }
}
