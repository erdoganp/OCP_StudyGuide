package questions.chapter10.q17;

import java.sql.SQLOutput;
import java.util.stream.DoubleStream;

public class Q17 {
    /*
17. What is the result of the following?
var s = DoubleStream.of(1.2, 2.4);
s.peek(System.out::println).filter(x ->x> 2).count();
A. 1
B. 2
C. 2.4
++D. 1.2 and 2.4
E. There is no output.
F. The code does not compile.
G. An exception is thrown

     */

    public static void main(String[] args) {

        var s= DoubleStream.of(1.2,2.4);
        s.peek(System.out::println).filter(x-> x>2).count();
    }
}
