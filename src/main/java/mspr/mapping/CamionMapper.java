package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import mspr.model.Camion;

public class CamionMapper {

    public Camion process(ResultSet rs) throws SQLException {

        Camion camion = new Camion();

        String noImmatric = rs.getString(1);
        camion.setNoImmatric(noImmatric);

        Date dateAchat = rs.getDate(2);
        camion.setDateAchat(dateAchat);

        String modele = rs.getString(3);
        camion.setNoImmatric(modele);

        String marque = rs.getString(4);
        camion.setMarque(marque);

        return camion;
    }
}
