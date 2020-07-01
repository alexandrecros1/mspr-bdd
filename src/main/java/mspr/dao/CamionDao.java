package mspr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.mapping.CamionMapper;
import mspr.model.Camion;

public class CamionDao extends GenericDao {

    private final CamionMapper mapper;

    public CamionDao(Connection connection) {
        super(connection);
        mapper = new CamionMapper();
    }

    private Camion mapCamion(ResultSet rs) throws SQLException {
        Camion camion = mapper.process(rs);
        return camion;
    }
}
