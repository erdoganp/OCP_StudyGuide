package questions.chapter15.questions.q08;

public class Q08 {
    /*

    8. Suppose learn() is a stored procedure that takes one IN parameter. What is wrong with
the following code? (Choose all that apply.)
18: var sql = "call learn()";
19: try (var cs = conn.prepareCall(sql)) {
20: cs.setString(1, "java");
21: try (var rs = cs.executeQuery()) {
22: while (rs.next())
23: System.out.println(rs.getString(3));
24: }
25: }
++A. Line 18 is missing braces.//storeprocedure de {} kullanılması zorunlu
++B. Line 18 is missing a ?. //In paramater oldugu için parametre verilmesi gerekiyor
C. Line 19 is not allowed to use var.
D. Line 20 does not compile.
E. Line 22 does not compile.
F. Something else is wrong with the code.
G. None of the above. This code is correct.

     */


}
