package questions.chapter10.q02;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q02 {

    /*
2. What could be the output of the following?
Predicate<String> predicate = s ->s.startsWith("g");
var stream1 = Stream.generate(() ->"growl!");
var stream2 = Stream.generate(() ->"growl!");
var b1 = stream1.anyMatch(predicate);
var b2 = stream2.allMatch(predicate);
System.out.println(b1 + " " + b2);
A. true false
B. true true
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.
E. An exception is thrown.
F. The code hangs.

     */

    public static void main(String[] args) {


        Predicate<String> predicate= s ->s.startsWith("g");
        var stream1= Stream.generate(() ->"growl!");
        var stream2=Stream.generate(() ->"growl!");

        var b1=stream1.anyMatch(predicate);
        var b2=stream2.allMatch(predicate); //hangs olur cunku true da takılı kalıyor dongu kırılmıyor

        System.out.println(b1 + " " + b2);

    }
}
