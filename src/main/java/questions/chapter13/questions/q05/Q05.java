package questions.chapter13.questions.q05;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Q05 {
    /*

    5. What statement about the following code is true?
var value1 = new AtomicLong(0);
final long[] value2 = {0};
IntStream.iterate(1, i ->1).limit(100).parallel()
.forEach(i ->value1.incrementAndGet());
IntStream.iterate(1, i ->1).limit(100).parallel()
.forEach(i ->
++value2[0]);
System.out.println(value1+" "+value2[0]);
A. It outputs 100 100.
B. It outputs 100 99.
++C. The output cannot be determined ahead of time.
D. The code does not compile.
E. It compiles but throws an exception at runtime.

     */

    public static void main(String[] args) {

        /** value1 atomic bir değerdir ve sonuc değişmez ama value2 atomic deger olmadıgı için herseferinde sonuc degisir
         * bundan dolayı value2 nin sonucunu net olarak bilemeyiz*/
        var value1= new AtomicLong(0);

        final  long[]  value2={0};

        IntStream.iterate(1, i->1) .limit(100).parallel()
                .forEach(i-> System.out.println(Thread.currentThread().getName()+" "+" value1 : " + value1.incrementAndGet()));

        IntStream.iterate(1, i->1) .limit(100).parallel()
                .forEach(i->++value2[0]);

        System.out.println("son value1 :" + value1 +" son value2: "+value2[0]);

        System.out.println("----");

        IntStream.iterate(1, i -> 1)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("************");

    }
}
