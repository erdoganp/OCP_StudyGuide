package questions.chapter13.questions.q21;

import java.util.List;

public class Q21 {
    /*

    21. Given the following code snippet and blank lines on p1 and p2, which values guarantee that
1 is printed at runtime? (Choose all that apply.)
var data = List.of(List.of(1,2),
List.of(3,4),
List.of(5,6));
data._________ // p1
.flatMap(s ->
s.stream())
.____________________ // p2
.ifPresent(System.out::print);
++A. stream() on line p1, findFirst() on line p2
B. stream() on line p1, findAny() on line p2
C. parallelStream() on line p1, findAny() on line p2
++D. parallelStream() on line p1, findFirst() on line p2
E. The code does not compile regardless of what is inserted into the blanks.
F. None of the above

     */

    public static void main(String[] args) {

        /**findFirst methodu parallel stream ve stream deilk elamanı doner*/
        var data= List.of(List.of(1, 2) , List.of(3 , 4), List.of(5, 6));

        data.stream().flatMap(s->s.stream()).findFirst().ifPresent(System.out::println);
        data.parallelStream().flatMap(s->s.stream()).findFirst().ifPresent(System.out::println);
    }
}
