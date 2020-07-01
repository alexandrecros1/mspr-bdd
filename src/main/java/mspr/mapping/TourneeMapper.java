package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import mspr.model.Camion;
import mspr.model.Employe;
import mspr.model.Tournee;

public class TourneeMapper {

    public Tournee process(ResultSet rs) throws SQLException {

        Tournee tournee = new Tournee();

        int noTournee = rs.getInt(1);
        tournee.setNoTournee(noTournee);

        Date dateTournee = rs.getDate(2);
        tournee.setDateTournee(dateTournee);

        String noImmatric = rs.getString(3);
        Camion camion = new Camion();
        camion.setNoImmatric(noImmatric);
        tournee.setNoImmatric(camion);

        int noEmploye = rs.getInt(4);
        Employe employe = new Employe();
        employe.setNoEmploye(noEmploye);
        tournee.setNoEmploye(employe);

        return tournee;
    }
}
