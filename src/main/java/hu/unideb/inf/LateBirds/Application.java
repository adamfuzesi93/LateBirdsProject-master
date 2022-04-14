package org.example;

import org.h2.tools.Server;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();



        //Customer customer = new Customer();
       // customer.setFirstName("Dennys");
       // customer.setLastName("Fredericci");

        //entityManager.getTransaction().begin();
        //entityManager.persist(customer);
        //entityManager.getTransaction().commit();

        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("JDBC URL: jdbc:h2:mem:my_database");
        System.out.println("User Name: sa");
        System.out.println("Password: ");

        stopDatabase();

    }
    private static final Server s = new Server();

    private static void startDatabase() throws SQLException {
       s.runTool("-tcp", "-web", "-ifNotExists");
    }

    public static void stopDatabase(){
        s.shutdown();
    }
}
