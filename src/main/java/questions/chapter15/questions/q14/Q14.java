package questions.chapter15.questions.q14;

public class Q14 {

    /*

    14. Suppose learn() is a stored procedure that takes one IN parameter and one OUT parameter.
What is wrong with the following code? (Choose all that apply.)
18: var sql = "{?= call learn(?)}";
19: try (var cs = conn.prepareCall(sql)) {
20: cs.setInt(1, 8);
21: cs.execute();
22: System.out.println(cs.getInt(1));
23: }
A. Line 18 does not call the stored procedure properly.
B. The parameter value is not set for input.
++C. The parameter is not registered for output.
D. The code does not compile.
E. Something else is wrong with the code.
F. None of the above. This code is correct.

     */

    /**InOut da registerOutParameter cagrılmak zorunda*/
}
