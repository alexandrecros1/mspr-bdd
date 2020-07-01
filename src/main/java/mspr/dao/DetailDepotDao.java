package mspr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.mapping.DetailDepotMapper;
import mspr.model.DetailDepot;

public class DetailDepotDao extends GenericDao {

    private final DetailDepotMapper mapper;

    public DetailDepotDao(Connection connection) {
        super(connection);
        mapper = new DetailDepotMapper();
    }

    private DetailDepot mapDetailDepot(ResultSet rs) throws SQLException {
        DetailDepot detailDepot = mapper.process(rs);
        return detailDepot;
    }
}
