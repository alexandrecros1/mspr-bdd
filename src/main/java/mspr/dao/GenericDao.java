package mspr.dao;

import java.sql.Connection;

public class GenericDao {

    protected Connection connection;

    public GenericDao(Connection connection) {
        this.connection = connection;
    }
}
