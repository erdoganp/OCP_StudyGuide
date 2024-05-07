package questions.chapter10.q03;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q03 {


    /*

What could be the output of the following?
Predicate<String> predicate = s ->
s.length()> 3;
var stream = Stream.iterate("-",s ->! s.isEmpty(), (s) ->s + s);
var b1 = stream.noneMatch(predicate);
var b2 = stream.anyMatch(predicate);
System.out.println(b1 + " " + b2);
A. false false
B. false true
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.
++E. An exception is thrown.
F. The code hangs.

     */

    public static void main(String[] args) {
        Predicate<String > predicate = s->s.length() > 3;
        var stream = Stream.iterate("-", s->!s.isEmpty(),(s)->s+ s);

        /**none match ve anymatch methodları terminal operation oldugu için aynı stream uzerinde aynı anda cagrılmaz*/
        var b1=stream.noneMatch(predicate);
        var b2=stream.anyMatch(predicate); // yukarıda terminal yapıldıgı için tekrar cagrılmaz
        System.out.println(b1 + " " +b2);
     }
}
