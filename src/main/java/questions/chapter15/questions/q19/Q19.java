package questions.chapter15.questions.q19;

public class Q19 {

    /*

    19. Which of the options can fill in the blank to make the code compile and run without error?
(Choose all that apply.)
var sql = "UPDATE habitat WHERE environment = ?";
try (var ps = conn.prepareCall(sql)) {
ps.executeUpdate();
}
A. ps.setString(0, "snow");
B. ps.setString(1, "snow");
C. ps.setString("environment", "snow");
D. The code does not compile.
++E. The code throws an exception at runtime.

     */

    /**burada prepareCall methodu cagrılmıs ama içerisine sql statement verilmis
     * calısma zamanında bu kod hata verir
     * */
}
