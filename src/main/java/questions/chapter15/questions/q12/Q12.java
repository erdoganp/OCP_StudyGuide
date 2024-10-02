package questions.chapter15.questions.q12;

public class Q12 {

    /*

    12. Suppose that the table counts has five rows with the numbers 1 to 5. How many lines does
this code print?
var sql = "SELECT num FROM counts WHERE num> ?";
try (var ps = conn.prepareStatement(sql,
ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
ps.setInt(1, 3);
try (var rs = ps.executeQuery()) {
while (rs.next())
System.out.println(rs.getObject(1));
}
ps.setInt(1, 100);
try (var rs = ps.executeQuery()) {
while (rs.next())
System.out.println(rs.getObject(1));
}
}
A. 0
B. 1
++C. 2
D. 4
E. The code does not compile.
F. The code throws an exception.

     */

    /**
     * num da ilk de yapılan set isleminde 4 ve 5 için sart saglanıyor cunku 3 den buyukler
     * num a ikinci set isleminde resultset d ebirsey donmez cunku 100 den buyuk kayıt yoktur
     * sadece iki line yazılmıs olur
     * */
}
