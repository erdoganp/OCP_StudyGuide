package questions.chapter15.calling_a_callablestatement;

import java.sql.*;

public class CallingProcedureWithoutParameters {

    public static void main(String[] args) throws SQLException {
            test();
    }

    static void  test() throws SQLException {

        Connection conn= DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        String sql = "{call read_e_names()}";

        try (CallableStatement cs=conn.prepareCall(sql)) {
            ResultSet rs=cs.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }

        }

    }
}
