package questions.chapter15.questions.q21;

public class Q21 {


    /*

    21. Suppose conn is a valid connection object and the exhibits table is empty. Which are true?
(Choose two.)
try (conn) {
conn.setAutoCommit(false);
String sql = "INSERT INTO exhibits VALUES(3, 'Test', 2)";
try (PreparedStatement ps = conn.prepareStatement(sql)) {
ps.executeUpdate();
}
conn.setAutoCommit(true); // line W
}
A. As written, the table will remain empty after this code.
++B. As written, the table will contain one row after this code.
C. As written, the code will throw an exception.
++D. When line W is commented out, the table will remain empty after this code.
E. When line W is commented out, the table will contain one row after this code.
F. When line W is commented out, the code will throw an exception.

     */
}
