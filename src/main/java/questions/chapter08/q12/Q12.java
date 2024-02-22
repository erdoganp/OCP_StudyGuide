package questions.chapter08.q12;

import java.util.function.Function;
/*

Function<Integer, Integer> s = a ->a + 4;
Function<Integer, Integer> t = a ->a * 3;
Function<Integer, Integer> c = s.compose(t);
System.out.print(c.apply(1));
++A. 7
B. 15
C. The code does not compile because of the data types in the lambda expressions.
D. The code does not compile because of the compose() call.
E. The code does not compile for another reason.

*/

public class Q12 {

    public static void main(String[] args) {
        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));
    }
}
