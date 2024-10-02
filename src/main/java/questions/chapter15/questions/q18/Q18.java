package questions.chapter15.questions.q18;

public class Q18 {

    /*

    18. There are currently 100 rows in the table species before inserting a new row. What is the
output of the following code?
String insert = "INSERT INTO species VALUES (3, 'Ant', .05)";
String select = "SELECT count(*) FROM species";
try (var ps = conn.prepareStatement(insert)) {
ps.executeUpdate();
}
try (var ps = conn.prepareStatement(select)) {
var rs = ps.executeQuery();
System.out.println(rs.getInt(1));
}
A. 100
B. 101
C. The code does not compile.
++D. A SQLException is thrown.
E. A different exception is thrown.

     */
    /**execurequery den donen result set üzerinde rs.next mehthodunu cagırmak zorundayız
     * burada cagrılmadıgı için hata verir*/

}
