package questions.chapter15.questions.q07;

public class Q07 {

    /*

    7. Suppose that the table names has five rows and the following SQL statement updates all of
them. What is the result of this code?
public static void main(String[] args) throws SQLException {
var sql = "UPDATE names SET name = 'Animal'";
try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
var ps = conn.prepareStatement(sql)) {
var result = ps.executeUpdate();
System.out.println(result);
}
}
A. 0
B. 1
++C. 5
D. The code does not compile.
E. A SQLException is thrown.
F. A different exception is thrown

     */

/**
 * Oncelikler sql de update islemi yapılıyor ve herhangi bir where sartı bulunmuyor bundan dolayı tum kayıtların ismi
 * Animal olacaktır
 * executeUpdate de etkilenen row sayısı dondugu için ve herhangi bir sart olmadıgı için mevcuttaki 5 row da etkilenecktir
 * bundan dolayı geriye 5 donecektir
 * */
}
