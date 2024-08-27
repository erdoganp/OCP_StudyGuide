package questions.chapter13.questions.q13;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Q13 {

    /*
    13. What statements about the following code are true? (Choose all that apply.)
System.out.print(List.of("duck","flamingo","pelican")
.parallelStream().parallel() // q1
.reduce(0,
(c1, c2) ->c1.length() + c2.length(), // q2
(s1, s2) ->s1 + s2)); // q3
A. It compiles and runs without issue, outputting the total length of all strings in the stream.
B. The code will not compile because of line q1.
++C. The code will not compile because of line q2.
D. The code will not compile because of line q3.
E. It compiles but throws an exception at runtime.
F. None of the above

     */

    /**q2 de hata verir cunku c1 bir integer degerdir bundan dolayı length yoktur*/
    public static void main(String[] args) {
     /*
        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel()//q1
                .reduce(0,
                        (c1,c2) ->c1.length+ c2.length(), //q2
                        (s1, s2) ->s1 + s2));//q3
*/
    }

    void method1(){

        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel()//q1
                .reduce(0,
                        (c1,c2) ->c1+ c2.length(), //q2
                        (s1, s2) ->s1 + s2));//q3
    }

    void method2(){

        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel()
                .reduce(0,
                        (c1, c2)->c1 + c2.length(), //q2,
                        Integer::sum));//q3
    }
}
