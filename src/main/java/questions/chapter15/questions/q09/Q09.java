package questions.chapter15.questions.q09;

public class Q09 {

    /*

    9. Suppose that the table enrichment has three rows with the animals bat, rat, and snake. How
many lines does this code print?
var sql = "SELECT toy FROM enrichment WHERE animal = ?";
try (var ps = conn.prepareStatement(sql)) {
try (var rs = ps.executeQuery()) {
while (rs.next())
System.out.println(rs.getString(1));
}
}
A. 0
B. 1
C. 3
D. The code does not compile.
++E. A SQLException is thrown.
F. A different exception is thrown.


     */

/**sql stament içinde bind variable kullanılmıs fakat bunu set işlemi executeQuery den once yapılmamıs
 * calısma zamanında sqlException fırlatacaktır
 * */
}
