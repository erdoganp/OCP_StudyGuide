package questions.chapter15.getting_data_from_resultset.reading_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ReadingAResultSetExample2 {

    public static void main(String[] args) throws SQLException {
        execureQueryMethod();
    }

    static  void  execureQueryMethod() throws SQLException {

        Connection conn= DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        String sql = "SELECT id, name FROM exhibits";

        var idToNameMap=new HashMap<Integer, String>();

        try(var ps =conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()){

            while (rs.next()){

                /**Burada indeks kullandık*/
                int id=rs.getInt(1);
                String name=rs.getString(2);

                idToNameMap.put(id, name);
            }

            System.out.println(idToNameMap);
            System.out.println(idToNameMap.keySet());
            System.out.println(idToNameMap.values());
        }


    }
}
