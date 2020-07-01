package mspr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.mapping.EmployeMapper;
import mspr.model.Employe;

public class EmployeDao extends GenericDao {

    private final EmployeMapper mapper;

    public EmployeDao(Connection connection) {
        super(connection);
        mapper = new EmployeMapper();
    }

    private Employe mapEmploye(ResultSet rs) throws SQLException {
        Employe employe = mapper.process(rs);
        return employe;
    }
}
