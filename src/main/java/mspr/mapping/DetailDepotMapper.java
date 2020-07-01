package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.CentreTraitement;
import mspr.model.DetailDepot;
import mspr.model.Tournee;
import mspr.model.TypeDechet;

public class DetailDepotMapper {

    public DetailDepot process(ResultSet rs) throws SQLException {

        DetailDepot detailDepot = new DetailDepot();

        int quantiteDeposee = rs.getInt(1);
        detailDepot.setQuantiteDeposee(quantiteDeposee);

        int noTournee = rs.getInt(2);
        Tournee tournee = new Tournee();
        tournee.setNoTournee(noTournee);
        detailDepot.setNoTournee(tournee);

        int noTypeDechet = rs.getInt(3);
        TypeDechet typeDechet = new TypeDechet();
        typeDechet.setNoTypeDechet(noTypeDechet);
        detailDepot.setNoTypeDechet(typeDechet);

        int noCentre = rs.getInt(4);
        CentreTraitement centreTraitement = new CentreTraitement();
        centreTraitement.setNoCentre(noCentre);
        detailDepot.setNoCentre(centreTraitement);

        return detailDepot;
    }
}
