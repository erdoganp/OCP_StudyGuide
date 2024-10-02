package questions.chapter15.working_with_preparedstatement.execute_preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModifiyingDataWithExecuteUpdateExample {

    public static void main(String[] args) throws SQLException {
          test1();
    }

    static void test1() throws SQLException {

        var insertSql= "INSERT INTO exhibits VALUES(10, 'Dear', 3)";
        var updateSql="UPDATE exhibits SET name = '' " +  "WHERE name ='None'";
        var deleteSql="DELETE FROM exhibits WHERE id = 10";

        Connection conn= DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        try(var ps = conn.prepareStatement(insertSql)){
            int result= ps.executeUpdate();
            System.out.println(result);
        }

        try(var ps =conn.prepareStatement(updateSql)){
            int result=ps.executeUpdate();
            System.out.println(result);
        }

        try(var ps = conn.prepareStatement(deleteSql)){
            int result =ps.executeUpdate();
            System.out.println(result);
        }

    }
}
