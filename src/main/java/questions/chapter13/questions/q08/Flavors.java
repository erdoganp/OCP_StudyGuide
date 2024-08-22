package questions.chapter13.questions.q08;

import java.util.stream.LongStream;

public class Flavors {

    /*

    8. Assuming this class is accessed by only a single thread at a time, what is the result of calling
the countIceCreamFlavors() method?
import java.util.stream.LongStream;
public class Flavors {
private static int counter;
public static void countIceCreamFlavors() {
counter = 0;
Runnable task = () ->counter++;
LongStream.range(0, 500)
.forEach(m ->new Thread(task).run());
System.out.println(counter);
} }
    A. The method consistently prints a number less than 500.
++B. The method consistently prints 500.
C. The method compiles and prints a value, but that value cannot be determined ahead of
time.
D. The method does not compile.
E. The method compiles but throws an exception at runtime.
F. None of the above

     */

    public static void main(String[] args) {
        countIceCreamFlavors();
    }

    private static int counter;
    public static void countIceCreamFlavors() {

        /**burada thread.run methodu kullanıldıgı için single thread olarak calısır ve syncronized dir
         * bundan dolayı herseferinde 500 u yazar.
         * eger start methddu kullanılsaydı foreach de her task cagrıldında yeni thread acardı ve sonuc surakli değişirdi
         * */
        counter = 0;
        Runnable task = () ->counter++;
        LongStream.range(0, 500)
                .forEach(m ->new Thread(task).run());
                //.forEach(m ->new Thread(task).start());
        System.out.println(counter);
}
}
