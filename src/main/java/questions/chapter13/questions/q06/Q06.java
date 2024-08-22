package questions.chapter13.questions.q06;

import java.util.List;

public class Q06 {

    /*


    6. Which statements about the following code are correct? (Choose all that apply.)
var data = List.of(2,5,1,9,8);
data.stream().parallel()
.mapToInt(s ->
s)
.peek(System.out::print)
.forEachOrdered(System.out::print);
A. The peek() method will print the entries in the sorted order: 12589.
B. The peek() method will print the entries in the original order: 25198.
++C. The peek() method will print the entries in an order that cannot be determined ahead
of time.
D. The forEachOrdered() method will print the entries in the sorted order: 12589.
++E. The forEachOrdered() method will print the entries in the original order: 25198.
F. The forEachOrdered() method will print the entries in an order that cannot be
determined ahead of time.
G. The code does not compile.



     */



    public static void main(String[] args) {

        var data= List.of(2, 5, 1, 9, 8);

        /**
         * peek() methodunda concurrency kullanıldıgnda listeden rastgele degerler cekilir
         * forEachOrdered methodunda listedeki orginal sıra kullanılır
         * */
        data.stream().parallel()
                .mapToInt(s->s)
                .peek(e -> System.out.println("peek : " + e))
                .forEachOrdered(e -> System.out.println("forEachOrdered : " + e));


    }
}
