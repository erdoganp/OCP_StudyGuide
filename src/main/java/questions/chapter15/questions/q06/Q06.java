package questions.chapter15.questions.q06;

public class Q06 {

    /*

    6. Suppose there are two rows in the table before this code is run, and executeUpdate() runs
without error. How many rows are in the table after the code completes?
conn.setAutoCommit(true);
String sql = "INSERT INTO games VALUES(3, Jenga);";
try (PreparedStatement ps = conn.prepareStatement(sql,
ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
ps.executeUpdate();
}
conn.rollback();
A. Two
++B. Three
C. The code does not compile.
D. The code throws an exception.

     */
/**
 * Burada setAutoCommmit true olarak kullanılmıs yani yapılan islemler database e direk yansıyacak
 * rollback denmesi birsey değistirmeyecektir
 * */
}
