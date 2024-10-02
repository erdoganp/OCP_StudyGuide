package questions.chapter15.questions.q10;

public class Q10 {

    /*

    10. Suppose that the table food has five rows, and this SQL statement updates all of them. What
is the result of this code?
public static void main(String[] args) {
var sql = "UPDATE food SET amount = amount + 1";
try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
var ps = conn.prepareStatement(sql)) {
var result = ps.executeUpdate();
System.out.println(result);
}
}
A. 0
B. 1
C. 5
++D. The code does not compile. //main method içinde getConnection kullanıldıgı için bu bir checkedException fırlatır
E. A SQLException is thrown.
F. A different exception is thrown.

     */


/**
 * main method içinde getConnection kullanıldıgı için bu bir checkedException fırlatır
 * bundan dolayı ya main methodu içinde SQLException ı handle edeceğiz yada method imzasında SQLExceptionı declare edeceğiz
 * ikiside yapılmadıgı için Code compile olmaz
 *
 * */
}
