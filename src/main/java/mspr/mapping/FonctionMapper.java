package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.Fonction;

public class FonctionMapper {

    public Fonction process(ResultSet rs) throws SQLException {

        Fonction fonction = new Fonction();

        int noFonction = rs.getInt(1);
        fonction.setNoFonction(noFonction);

        String nomFonction = rs.getString(2);
        fonction.setNomFonction(nomFonction);

        return fonction;
    }
}
