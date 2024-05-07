package questions.chapter10.q08;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Q08 {
    /*

    8. Which of the following are true given this declaration? (Choose all that apply.)
var is = IntStream.empty();
A. is.average() returns the type int. //tüm averagelar double doner
B. is.average() returns the type OptionalInt. //tüm averageler double döner
C. is.findAny() returns the type int. /Yanlıs
++D. is.findAny() returns the type OptionalInt. /Dogru
++E. is.sum() returns the type int.       //Dogru
F. is.sum() returns the type OptionalInt. //yanlıs

     */

    public static void main(String[] args) {
        intStreamAverage();
        intStreamFindAny();
        intStreamSum();
    }

    private static void intStreamAverage(){

        var is= IntStream.empty();
        OptionalDouble average=is.average();
        System.out.println(average);

    }

    private static void intStreamFindAny(){
        var is =IntStream.empty();
        OptionalInt findAny=is.findAny();
        System.out.println(findAny);

    }

    private static void intStreamSum(){

        var is =IntStream.empty();
        int sum= is.sum();
        System.out.println(sum);

    }

}
