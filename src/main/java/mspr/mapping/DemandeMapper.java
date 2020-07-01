package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import mspr.model.Demande;
import mspr.model.Entreprise;
import mspr.model.Tournee;

public class DemandeMapper {

    public Demande process(ResultSet rs) throws SQLException {

        Demande demande = new Demande();

        int noDemande = rs.getInt(1);
        demande.setNoDemande(noDemande);

        Date dateDemande = rs.getDate(2);
        demande.setDateDemande(dateDemande);

        Date dateEnlevement = rs.getDate(3);
        demande.setDateEnlevement(dateEnlevement);

        String web_O_N = rs.getString(4);
        demande.setWeb_O_N(web_O_N);

        long siret = rs.getLong(5);
        Entreprise entreprise = new Entreprise();
        entreprise.setSiret(siret);
        demande.setSiret(entreprise);

        int noTournee = rs.getInt(6);
        Tournee tournee = new Tournee();
        tournee.setNoTournee(noTournee);
        demande.setNoTournee(tournee);

        return demande;
    }
}
