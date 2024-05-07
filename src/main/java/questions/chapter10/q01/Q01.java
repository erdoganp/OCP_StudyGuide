package questions.chapter10.q01;

import java.util.stream.Stream;

public class Q01 {

    /*
    The answers to the chapter review questions can be found in the Appendix.
1. What could be the output of the following?
var stream = Stream.iterate("", (s) ->
s + "1");
System.out.println(stream.limit(2).map(x ->x + "2"));
A. 12112
B. 212
C. 212112
++D. java.util.stream.ReferencePipeline$3@4517d9a3
E. The code does not compile.
F. An exception is thrown.
G. The code hangs.
    */


    public static void main(String[] args) {
        var stream = Stream.iterate("", (s) -> s+ "1");
       /**burada terminal operation kullanılmadıgı için elemanlarını yaztıramıyoruz*/
       // System.out.println(stream.limit(2).map(x->x + "2")); //java.util.stream.ReferencePipeline$3@b4c966a

       // stream.limit(4).forEach(System.out::print);
        /**eger foreach(Consumer c) ile kullanılsaydı asagıdaki sekilde olacaktı*/

        /**calısma sekli olarak
         * 1)once stream de 2 elaman olucak sekilde ayarlıyoruz [,1]
         * 2)streamdeki elemanları mapliyoruz [2,12] ilk elaman bos oldugu için drek 2 geliyor,ikinci elamanın yanına 2 geliyor
         *
         * */
        stream.limit(2).map(x->x + "2").forEach(System.out::print);



    }

}
