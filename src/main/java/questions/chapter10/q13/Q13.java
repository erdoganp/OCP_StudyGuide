package questions.chapter10.q13;

import java.util.List;
import java.util.stream.Stream;

public class Q13 {

    /*
13. Which of the following is true?
List<Integer> x1 = List.of(1, 2, 3);
List<Integer> x2 = List.of(4, 5, 6);
List<Integer> x3 = List.of();
Stream.of(x1, x2, x3).map(x ->x + 1)
.flatMap(x ->x.stream())
.forEach(System.out::print);
A. The code compiles and prints 123456.
B. The code compiles and prints 234567.
C. The code compiles but does not print anything.
D. The code compiles but prints stream references.
E. The code runs infinitely.
++F. The code does not compile.
G. The code throws an exception.
     */

    public static void main(String[] args) {

        List<Integer> x1=List.of(1,2,3);
        List<Integer> x2=List.of(4,5,6);
        List<Integer> x3=List.of();

        /**burada eleman olarak liste aldıgı için Stream.of methodu ,map den once flatmap kullanmamız gerekiyor*/
//        Stream.of(x1,x2,x3).map(x->x+1)
//                .flatMap(x ->x.stream())
//                .forEach(System.out::println);

                Stream.of(x1,x2,x3).flatMap(x->x.stream())
                        .map(x->x+1)
                        .forEach(System.out::println);
    }

}
