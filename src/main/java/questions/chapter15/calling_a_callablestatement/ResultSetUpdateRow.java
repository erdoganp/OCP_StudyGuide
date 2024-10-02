package questions.chapter15.calling_a_callablestatement;

import java.sql.*;

public class ResultSetUpdateRow {

    public static void main(String[] args) throws SQLException {

        Connection conn= DriverManager.getConnection("jdbc:postgresql://192.168.1.106:5432/ocp-book", "postgres" ,"postgres");
        dropExisting(conn);
        createTables(conn);

        System.out.println("Connected to database");

      //  Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        //Results with concurrency CONCUR_READ_ONLY can not be updated


       //Statement stmt= conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        //Operation requires a scrollable ResultSet, but this resultset forward ONLY

        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        String query="SELECT * FROM Customers";

        ResultSet rs=stmt.executeQuery(query);


        while (rs.next()) {
            if(rs.getInt("ID")==5){

                rs.updateInt("Salary", 11000);
                rs.updateString("ADDRESS", "Narsipatam");
                rs.updateRow();
            }
        }

        rs.beforeFirst();
        System.out.println("Contents of the Customers table after the updates");


        while (rs.next()) {

            System.out.print("ID: "  +rs.getInt("ID") + ", ");
            System.out.print("Name " + rs.getString("name") + ", ") ;
            System.out.print("Age "  +  rs.getInt("age") + ", ") ;
            System.out.print("Salary " + rs.getInt("salary") + ", ") ;
            System.out.print("Address " + rs.getString("address") + ", ") ;
            System.out.println();
        }


    }


    private static void dropExisting(Connection conn) throws SQLException {
        run(conn, "DROP TABLE IF EXISTS CUSTOMERS");
    }

    private static void createTables(Connection conn) throws SQLException {

        run(conn, """
                CREATE TABLE customers(
                   ID INT,
                   Name VARCHAR(20),
                   AGE INT,
                   SALARY INT,
                   ADDRESS  VARCHAR(255),
                   PRIMARY KEY (ID)
                );
                """);


        run (conn, "INSERT INTO customers VALUES(1, 'Amit', 25, 3000, 'Hydereabat')");
        run (conn, "INSERT INTO customers VALUES(2, 'Kalyan', 27, 4000, 'Vishakhapatam')");
        run (conn, "INSERT INTO customers VALUES(3, 'Renuka', 25, 8000, 'Delhi')");
        run (conn, "INSERT INTO customers VALUES(4, 'Obiicim', 25, 56000, 'Mumbai')");
        run (conn, "INSERT INTO customers VALUES(5, 'Nebicim', 25, 2000, 'Kota')");
        run (conn, "INSERT INTO customers VALUES(6, 'Kaushik', 25, 3000, 'Bhopal')");
        run (conn, "INSERT INTO customers VALUES(7, 'Hardik', 25, 8000, 'Ahmedabad')");
        run (conn, "INSERT INTO customers VALUES(8, 'Truphi', 25, 67000, 'Vijayabada')");
        run (conn, "INSERT INTO customers VALUES(9, 'Mithili', 25, 7000, 'hydebarat')");
        run (conn, "INSERT INTO customers VALUES(10, 'Bajanessh', 25, 4000, 'Delhit')");
        run (conn, "INSERT INTO customers VALUES(11, 'Komal', 25, 6000, 'Ahmedabat')");
        run (conn, "INSERT INTO customers VALUES(12, 'Manyata', 25, 5000, 'Viyavabada')");


    }

    private static void run(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }
}
