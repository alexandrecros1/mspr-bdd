package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import mspr.model.Employe;
import mspr.model.Fonction;

public class EmployeMapper {

    public Employe process(ResultSet rs) throws SQLException {

        Employe employe = new Employe();

        int noEmploye = rs.getInt(1);
        employe.setNoEmploye(noEmploye);

        String nom = rs.getString(2);
        employe.setNom(nom);

        String prenom = rs.getString(3);
        employe.setPrenom(prenom);

        Date dateNaiss = rs.getDate(4);
        employe.setDateNaiss(dateNaiss);

        Date dateEmbauche = rs.getDate(5);
        employe.setDateEmbauche(dateEmbauche);

        Float salaire = rs.getFloat(6);
        employe.setSalaire(salaire);

        int noFonction = rs.getInt(7);
        Fonction fonction = new Fonction();
        fonction.setNoFonction(noFonction);
        employe.setNoFonction(fonction);

        return employe;
    }
}
