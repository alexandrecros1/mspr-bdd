package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.CentreTraitement;

public class CentreTraitementMapper {

    public CentreTraitement process(ResultSet rs) throws SQLException {

        CentreTraitement employe = new CentreTraitement();

        int noCentre = rs.getInt(1);
        employe.setNoCentre(noCentre);

        String nomCentre = rs.getString(2);
        employe.setNomCentre(nomCentre);

        int noRueCentre = rs.getInt(3);
        employe.setNoRueCentre(noRueCentre);

        String rueCentre = rs.getString(4);
        employe.setRueCentre(rueCentre);

        int cPostalCentre = rs.getInt(5);
        employe.setcPostalCentre(cPostalCentre);

        String villeCentre = rs.getString(6);
        employe.setVilleCentre(villeCentre);

        return employe;
    }
}
