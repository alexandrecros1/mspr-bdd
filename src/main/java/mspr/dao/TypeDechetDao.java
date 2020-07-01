package mspr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    /**
     * @param noDemande
     * @return The matching pokemon, otherwise null.
     * @throws SQLException
     */
    public List<TypeDechet> findByDemandeNo(int noDemande) throws SQLException {
        List<TypeDechet> typeDechets = new ArrayList<>();

        String sql = "SELECT nodemande FROM c##rparis.detaildemande dd JOIN c##rparis.typedechet t ON dd.notypedechet = t.notypedechet WHERE dd.notypedechet = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, noDemande);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            TypeDechet typeDechet = mapper.process(rs);
            typeDechets.add(typeDechet);
        }

        return typeDechets;
    }
}
