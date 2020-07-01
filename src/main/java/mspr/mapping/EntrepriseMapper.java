package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.Entreprise;

public class EntrepriseMapper {
    
    public Entreprise process(ResultSet rs) throws SQLException {
        
        Entreprise entreprise = new Entreprise();
		
            long siret = rs.getLong(1);
            entreprise.setSiret(siret);

            String raisonSociale = rs.getString(2);
            entreprise.setRaisonSociale(raisonSociale);
            
            int noRueEntr = rs.getInt(3);
            entreprise.setNoRueEntr(noRueEntr);
            
            String rueEntr = rs.getString(4);
            entreprise.setRueEntr(rueEntr);
            
            int cPostalEntr = rs.getInt(5);
            entreprise.setcPostalEntr(cPostalEntr);
            
            String villeEntr = rs.getString(6);
            entreprise.setVilleEntr(villeEntr);
            
            int noTel = rs.getInt(7);
            entreprise.setNoTel(noTel);
            
            String contact = rs.getString(8);
            entreprise.setContact(contact);

        return entreprise;
    }
}
