package questions.chapter15.introducing_the_interface_of_jdbc;

import java.sql.*;

public class MyFirstDatabaseConnection {

    public static void main(String[] args) {
        String url="jdbc:hsqldb:file:zoo";

        try(Connection conn= DriverManager.getConnection(url);
            PreparedStatement ps=conn.prepareStatement("SELECT name FROM exhibits");
            ResultSet rs=ps.executeQuery()){

            while (rs.next())
                System.out.println(rs.getString(1));

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
