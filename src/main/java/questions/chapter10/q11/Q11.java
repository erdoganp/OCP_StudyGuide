package questions.chapter10.q11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q11 {

    /*

    11. What changes need to be made together for this code to print the string 12345? (Choose all
that apply.)
Stream.iterate(1, x ->x++)
.limit(5).map(x ->x)
.collect(Collectors.joining());
A. Change Collectors.joining() to Collectors.joining(",").
++B. Change map(x ->x) to map(x ->"" + x). //dogru cunku int ifadeyi string e ceviriyoruz
++C. Change x ->x++ to x ->++x. //dogru cunku eger bunu yapmazsak herseferinde 1 arttırmaz hep 1 yazar
D. Add .forEach(System.out::print) after the call to collect(). //collect terminal operator oldugu için ikinci bir terminal operator kullanılmaz
++E. Wrap the entire line in a System.out.print statement. //dogru
F. None of the above. The code already prints 12345.


     */

    public static void main(String[] args) {

        System.out.println(

                Stream.iterate(1, x->x++)
                        .limit(5).map(x->"" + x)
                        .collect(Collectors.joining()));


        System.out.println(

                Stream.iterate(1, x->x++)
                        .limit(5).map(x->"" + x)
                        .collect(Collectors.joining(",")));



        System.out.println(
                Stream.iterate(1, x->++x)
                        .limit(5).map(x->"" + x)
                        .collect(Collectors.joining()));

    }

}
