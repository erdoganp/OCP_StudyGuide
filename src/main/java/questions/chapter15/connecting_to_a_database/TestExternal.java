package questions.chapter15.connecting_to_a_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestExternal {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.106:5432/ocp-book",
                "postgres", "postgres")) {
            System.out.println(conn);
        }
    }
}