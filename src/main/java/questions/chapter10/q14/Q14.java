package questions.chapter10.q14;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q14 {

    /*

    14. Which of the following are true? (Choose all that apply.)
4: Stream<Integer> s = Stream.of(1);
5: IntStream is = s.boxed();
6: DoubleStream ds = s.mapToDouble(x ->x);
7: Stream<Integer> s2 = ds.mapToInt(x ->x);
8: s2.forEach(System.out::print);
A. Line 4 causes a compiler error.
++B. Line 5 causes a compiler error.
C. Line 6 causes a compiler error.
++D. Line 7 causes a compiler error.
E. Line 8 causes a compiler error.
F. The code compiles but throws an exception at runtime.
G. The code compiles and prints 1.

     */

    public static void main(String[] args) {

        Stream<Integer> s= Stream.of(1); //burada problem yok

    //    IntStream is=s.boxed(); //boxed methodu primitive den Stream e cevirmede kullanılır burada Stream den intStream e cevirmeye calısmıs

        DoubleStream ds=s.mapToDouble(x->x);//burada problem yok
//        Stream<Integer> s2=ds.mapToInt(x-> x); //cast yapılması gerekiyor ve Cast den sonrada bunun bir IntStream e assign edilmesi gerekiyor


    }
}
