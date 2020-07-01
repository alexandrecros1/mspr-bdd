package mspr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mspr.mapping.DemandeMapper;
import mspr.model.Demande;
import mspr.model.Entreprise;

public class DemandeDao extends GenericDao {

    private final DemandeMapper mapper;

    public DemandeDao(Connection connection) {
        super(connection);
        mapper = new DemandeMapper();
    }

    private Demande mapDemande(ResultSet rs) throws SQLException {
        Demande demande = mapper.process(rs);
        return demande;
    }

    /**
     * @param noDemande
     * @return The matching entreprise, otherwise null.
     * @throws SQLException
     */
    public Demande findByIdParis(int noDemande) throws SQLException {

        Demande demande = null;
        String sql = "SELECT e.siret, t.notournee, dd.quantiteenlevee"
                + " FROM c##rparis.demande d"
                + " JOIN c##rparis.entreprise e ON e.siret = d.siret"
                + " JOIN c##rparis.tournee t ON t.notournee = d.notournee"
                + " JOIN c##rparis.detaildemande dd ON dd.nodemande = d.nodemande"
                + " WHERE d.nodemande = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, noDemande);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            demande = mapDemande(rs);
        }

        return demande;
    }

    /**
     * Finds all demandes.
     *
     * @return A list containing all the demandes from paris.
     * @throws SQLException
     */
    public List<Demande> findAllParis() throws SQLException {
        List<Demande> allDemande = new ArrayList<>();

        String sql = "SELECT * FROM c##rparis.demande ORDER BY nodemande";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Demande demande = mapDemande(rs);
            allDemande.add(demande);
        }

        return allDemande;
    }
}
