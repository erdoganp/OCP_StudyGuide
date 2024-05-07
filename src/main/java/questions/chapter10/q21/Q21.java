package questions.chapter10.q21;

import java.util.stream.Stream;

public class Q21 {
    /*

    21. What is the output of the following?
var spliterator = Stream.generate(() ->"x")
.spliterator();
spliterator.tryAdvance(System.out::print);
var split = spliterator.trySplit();
split.tryAdvance(System.out::print);
A. x
++B. xx
C. A long list of x’s
D. There is no output.
E. The code does not compile.
F. The code compiles but does not terminate at runtime.

     */

    public static void main(String[] args) {
        var spliterator = Stream.generate(() ->"x")
                .spliterator();


        spliterator.tryAdvance(System.out::println);
        var split=spliterator.trySplit();
        split.tryAdvance(System.out::println);
    }
}
