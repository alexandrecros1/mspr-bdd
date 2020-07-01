package mspr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mspr.mapping.EntrepriseMapper;
import mspr.model.Entreprise;

public class EntrepriseDao extends GenericDao {

    private final EntrepriseMapper mapper;

    public EntrepriseDao(Connection connection) {
        super(connection);
        mapper = new EntrepriseMapper();
    }

    /**
     * Inserts an entreprise.
     *
     * @param entreprise
     * @throws SQLException
     */
    public void insert(Entreprise entreprise) throws SQLException {
        String sql = ""; // Ecrire la requête ici
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
    }

    /**
     * Finds all entreprises.
     *
     * @return A list containing all the entreprises from paris.
     * @throws SQLException
     */
    public List<Entreprise> findAllParis() throws SQLException {
        List<Entreprise> allEntreprise = new ArrayList<>();

        String sql = "SELECT * FROM c##rparis.entreprise ORDER BY RaisonSociale";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Entreprise entreprise = mapEntreprise(rs);
            allEntreprise.add(entreprise);
        }

        return allEntreprise;
    }

    /**
     * Finds all entreprises.
     *
     * @return A list containing all the entreprises from lille.
     * @throws SQLException
     */
    public List<Entreprise> findAllLille() throws SQLException {
        List<Entreprise> allEntreprise = new ArrayList<>();

        String sql = "SELECT * FROM c##rlille.entreprise ORDER BY RaisonSociale";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Entreprise entreprise = mapEntreprise(rs);
            allEntreprise.add(entreprise);
        }

        return allEntreprise;
    }

    private Entreprise mapEntreprise(ResultSet rs) throws SQLException {
        Entreprise entreprise = mapper.process(rs);
        return entreprise;
    }

    /**
     * @param siret
     * @return The matching entreprise, otherwise null.
     * @throws SQLException
     */
    public Entreprise findBySiret(String siret) throws SQLException {
        Entreprise entreprise = null;

        String sql = "SELECT * FROM entreprise WHERE siret = " + siret;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, siret);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            entreprise = mapEntreprise(rs);
        }

        return entreprise;
    }
}
