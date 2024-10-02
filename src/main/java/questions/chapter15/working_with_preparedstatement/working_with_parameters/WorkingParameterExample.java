package questions.chapter15.working_with_preparedstatement.working_with_parameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WorkingParameterExample {
    public static void main(String[] args) throws SQLException {

        Connection conn= DriverManager.getConnection("jdbc:hsqldb:file:zoo");
        register(conn);
        register(conn, 100, 1, "erdogan");
    }


    public static void register (Connection conn) throws SQLException {

        var sql= "INSERT INTO names VALUES (6,1, 'Edith')";
        try(var ps =conn.prepareStatement(sql)){
            ps.executeUpdate();

        }

    }
    public static void register(Connection conn, int key, int type, String name) throws SQLException {

        /**Burada ? işareti olarak bind variable kullandık bu sekilde parametrik olarak method ile deger ataması yapabiliyoruz*/
        String sql = "INSERT INTO names VALUES (? , ?, ?)";
        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
/**1)paremater indeks ler 1 den baslar sıfırdan değil
 * 2)sıralama onemli değil indeks olarak belirtildiği sürece sorun olmaz
 * burada name parametresi 3. ındeks de ve type dan once assign edilmis ve sorun olmaz
 *
 * */
        }


    }



}
