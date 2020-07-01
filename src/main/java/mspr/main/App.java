package mspr.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import mspr.dao.DemandeDao;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String username = "sys as sysdba";
        String password = "root";

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", username, password);
 
        DemandeDao demandeDao = new DemandeDao(connection);
        System.out.println("Demande 1 de Paris");
        System.out.println(demandeDao.findByIdParis(1).toStringDechets());

    }
}
