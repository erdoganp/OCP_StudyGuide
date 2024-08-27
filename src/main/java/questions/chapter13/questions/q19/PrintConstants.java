package questions.chapter13.questions.q19;

import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class PrintConstants {

    /*

    19. What is the result of executing the following application? (Choose all that apply.)
import java.util.concurrent.*;
import java.util.stream.*;
public class PrintConstants {
public static void main(String[] args) {
var s = Executors.newScheduledThreadPool(10);
DoubleStream.of(3.14159,2.71828) // b1
.forEach(c ->
s.submit( // b2
() ->
System.out.println(10*c))); // b3
s.execute(() ->
System.out.println("Printed"));
} }
A. It compiles and outputs the two numbers followed by Printed.
B. The code will not compile because of line b1.
C. The code will not compile because of line b2.
D. The code will not compile because of line b3.
++E. It compiles, but the output cannot be determined ahead of time. //hangisinin once yazılacagı belli değildir
F. It compiles but throws an exception at runtime.
++G. It compiles but waits forever at runtime. //shutdown yapılmadıgı için program calısmaya devam eder

     */

    public static void main(String[] args) {
        var s= Executors.newScheduledThreadPool(10);

        DoubleStream.of(3.14159, 2.71828)
                .forEach(c ->s.submit(
                        () ->System.out.println(10 * c)));

        s.execute(() -> System.out.println("Printed"));

    }
}
