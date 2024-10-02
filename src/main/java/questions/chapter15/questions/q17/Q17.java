package questions.chapter15.questions.q17;

public class Q17 {
    /*

    17. Suppose that the table counts has five rows with the numbers 1 to 5. How many lines does
this code print?
var sql = "SELECT num FROM counts WHERE num> ?";
try (var ps = conn.prepareStatement(sql)) {
ps.setInt(1, 3);
try (var rs = ps.executeQuery()) {
while (rs.next())
System.out.println(rs.getObject(1));
}
try (var rs = ps.executeQuery()) {
while (rs.next())
System.out.println(rs.getObject(1));
}
}
A. 0
B. 1
C. 2
++D. 4
E. The code does not compile.
F. The code throws an exception.


     */
    /**burada once yapılan set işlemi iki execute query de de kullanılır
     * bundan dolayı ikiser tane yazar toplamda 4 olur
     *
     *
     *
     * */

}
