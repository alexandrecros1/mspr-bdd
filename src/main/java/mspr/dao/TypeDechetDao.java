package mspr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.mapping.TypeDechetMapper;
import mspr.model.TypeDechet;

public class TypeDechetDao extends GenericDao {

    private final TypeDechetMapper mapper;

    public TypeDechetDao(Connection connection) {
        super(connection);
        mapper = new TypeDechetMapper();
    }

    private TypeDechet mapTypeDechet(ResultSet rs) throws SQLException {
        TypeDechet typeDechet = mapper.process(rs);
        return typeDechet;
    }
}
