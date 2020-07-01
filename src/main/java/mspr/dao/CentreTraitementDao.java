package mspr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.mapping.CentreTraitementMapper;
import mspr.model.CentreTraitement;

public class CentreTraitementDao extends GenericDao {

    private final CentreTraitementMapper mapper;

    public CentreTraitementDao(Connection connection) {
        super(connection);
        mapper = new CentreTraitementMapper();
    }

    private CentreTraitement mapCentreTraitement(ResultSet rs) throws SQLException {
        CentreTraitement centreTraitement = mapper.process(rs);
        return centreTraitement;
    }
}
