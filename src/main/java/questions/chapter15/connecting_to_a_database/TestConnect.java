package questions.chapter15.connecting_to_a_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {

    public static void main(String[] args) throws SQLException ,ClassNotFoundException {
        try(Connection conn= DriverManager.getConnection("jdbc:hsqldb:file:zoo")){
            System.out.println(conn);
        }

    }
}
