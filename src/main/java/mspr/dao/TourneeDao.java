package mspr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mspr.mapping.TourneeMapper;
import mspr.model.Demande;
import mspr.model.Tournee;

public class TourneeDao extends GenericDao {

    private final TourneeMapper mapper;

    public TourneeDao(Connection connection) {
        super(connection);
        mapper = new TourneeMapper();
    }

    private Tournee mapTournee(ResultSet rs) throws SQLException {
        Tournee tournee = mapper.process(rs);
        return tournee;
    }

    /**
     * Finds all tournee.
     *
     * @return A list containing all the tournee from paris.
     * @throws SQLException
     */
    public List<Tournee> findAllParis() throws SQLException {
        List<Tournee> allTournee = new ArrayList<>();

        String sql = "SELECT * FROM c##rparis.tournee ORDER BY notournee";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Tournee tournee = mapTournee(rs);
            allTournee.add(tournee);
        }

        return allTournee;
    }
}
