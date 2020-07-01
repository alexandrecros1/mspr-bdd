package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.Demande;
import mspr.model.DetailDemande;
import mspr.model.TypeDechet;

public class DetailDemandeMapper {

    public DetailDemande process(ResultSet rs) throws SQLException {

        DetailDemande detailDemande = new DetailDemande();

        int quantiteEnlevee = rs.getInt(1);
        detailDemande.setQuantiteEnlevee(quantiteEnlevee);

        String remarque = rs.getString(2);
        detailDemande.setRemarque(remarque);

        int noDemande = rs.getInt(3);
        Demande demande = new Demande();
        demande.setNoDemande(noDemande);
        detailDemande.setNoDemande(demande);

        int noTypeDechet = rs.getInt(4);
        TypeDechet typeDechet = new TypeDechet();
        typeDechet.setNoTypeDechet(noTypeDechet);
        detailDemande.setNoTypeDechet(typeDechet);

        return detailDemande;
    }
}
