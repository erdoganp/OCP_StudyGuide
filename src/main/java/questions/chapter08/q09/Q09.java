package questions.chapter08.q09;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q09 {

    /*

    Which statements are true? (Choose all that apply.)
++A. The Consumer interface is good for printing out an existing value.
B. The Supplier interface is good for printing out an existing value.
C. The IntegerSupplier interface returns an int. //IntSupplier --geriye integer deger dondurur
D. The Predicate interface returns an int. //Predicate geriye boolean deger dondurur
E. The Function interface has a method named test(). //Function interface apply methoduna sahiptir
++F. The Predicate interface has a method named test(). //

    * */

    public static void main(String[] args) {
        Supplier<String> s=() ->"hello"; //supplier parametrik değil bundan dolayı methoda gecilmiyor deger
        System.out.println(s.get());

        Consumer<String> consumer = System.out::println;
        consumer.accept("hello consumer!"); //mevcut degeri consumerda veriyoruz cunku parametrik

        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test("test"));

    }
}
