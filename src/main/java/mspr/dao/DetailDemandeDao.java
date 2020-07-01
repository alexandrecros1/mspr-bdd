package mspr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mspr.mapping.DetailDemandeMapper;
import mspr.model.DetailDemande;

public class DetailDemandeDao extends GenericDao {

    private final DetailDemandeMapper mapper;

    public DetailDemandeDao(Connection connection) {
        super(connection);
        mapper = new DetailDemandeMapper();
    }

    private DetailDemande mapDetailDemande(ResultSet rs) throws SQLException {
        DetailDemande detailDemande = mapper.process(rs);
        return detailDemande;
    }

    /**
     * Finds all detaildemandes.
     *
     * @return A list containing all the detaildemandes from paris.
     * @throws SQLException
     */
    public List<DetailDemande> findAllParis() throws SQLException {
        List<DetailDemande> allDetailDemande = new ArrayList<>();

        String sql = "SELECT * FROM c##rparis.detaildemande ORDER BY nodemande";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            DetailDemande detailDemande = mapDetailDemande(rs);
            allDetailDemande.add(detailDemande);
        }

        return allDetailDemande;
    }
}
