package mspr.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import mspr.dao.DemandeDao;
import mspr.dao.DetailDemandeDao;
import mspr.dao.EntrepriseDao;
import mspr.dao.TourneeDao;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String username = "sys as sysdba";
        String password = "root";

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", username, password)) {
            /*EntrepriseDao entrepriseDao = new EntrepriseDao(connection);
            System.out.println("Entreprises de Paris");
            entrepriseDao.findAllParis().forEach(p -> System.out.println(p));
            System.out.println("Entreprises de Lille");
            entrepriseDao.findAllLille().forEach(p -> System.out.println(p));
            
            TourneeDao tourneeDao = new TourneeDao(connection);
            System.out.println("Tournees de Paris");
            tourneeDao.findAllParis().forEach(p -> System.out.println(p));
            
            DetailDemandeDao detailDemandeDao = new DetailDemandeDao(connection);
            System.out.println("Détail des demandes de Paris");
            detailDemandeDao.findAllParis().forEach(p -> System.out.println(p));
            */
            DemandeDao demandeDao = new DemandeDao(connection);
            /*System.out.println("Demandes de Paris");
            demandeDao.findAllParis().forEach(p -> System.out.println(p));*/
            System.out.println("Demande 1 de Paris");
            System.out.println(demandeDao.findByIdParis(1));
        }
    }
}
