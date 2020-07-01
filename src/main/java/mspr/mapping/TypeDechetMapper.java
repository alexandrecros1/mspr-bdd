package mspr.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import mspr.model.TypeDechet;

public class TypeDechetMapper {

    public TypeDechet process(ResultSet rs) throws SQLException {

        TypeDechet typeDechet = new TypeDechet();

        int noTypeDechet = rs.getInt(1);
        typeDechet.setNoTypeDechet(noTypeDechet);

        String nomTypeDechet = rs.getString(2);
        typeDechet.setNomTypeDechet(nomTypeDechet);

        int nivDanger = rs.getInt(3);
        typeDechet.setNivDanger(nivDanger);

        return typeDechet;
    }
}
