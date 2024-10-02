package questions.chapter15.controlling_data_with_transaction.commiting_and_rollingback;

import java.sql.*;
import java.time.LocalDateTime;

public class NoTransactionExample {

    public static void main(String[] args) throws SQLException {
        try(Connection conn= DriverManager.getConnection("jdbc:postgresql://192.168.1.106:5432/ocp-book", "postgres" ,"postgres");
            Statement statement=conn.createStatement();
            PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT)){

          //  statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);


            psInsert.setString(1, "Employee-1-name");
            psInsert.setInt(2, 100);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(1, "Employee-2-name");
            psInsert.setInt(2, 200);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(2, "Employee-3-name-exception");
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();




        }catch (Exception e){
            e.printStackTrace();
        }


    }


    private static final String SQL_INSERT = "insert into EMPLOYEE (name, salary, created_date) values(?,?,?)";

    private static final String SQL_TABLE_CREATE ="CREATE TABLE EMPLOYEE"
            + "("
            + "ID_Serial,"
            + "NAME varchar(100) NOT NULL,"
            + "SALARY numeric(15, 2) NOT NULL,"
            + "CREATED_DATE timestamp_with_time_zone NOT NULL DEFAULT CURRENT_TIMESTAMP,"
            + "PRIMARY KEY (ID)"
            + ")";


}
