package questions.chapter08.q18;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*

Which functional interfaces complete the following code? For line 7, assume m and n are
instances of functional interfaces that exist and have the same type as y. (Choose three.)
6: x = String::new;
7: y = m.andThen(n);
8: z = a ->
a + a;
A. BinaryConsumer<String, String>//bu sekilde imzası yok BiConsumer<T>
B. BiConsumer<String, String>
C. BinaryFunction<String, String> //Bu sekilde bir imzası yok BiFunction<T,U,R>
D. BiFunction<String, String> //Bu sekilde bir imzası yok BiFunction<T,U,R>
E. Predicate<String> //imza dogru ama boolean donen bir durum yok
F. Supplier<String>
G. UnaryOperator<String>
H. UnaryOperator<String, String>//BU Sekilde bir imzası yok UnaryOperator<T>

 */

public class Q18 {
    public static void main(String[] args) {

        BiConsumer<String,String> m=(k,c)-> System.out.println("selam");
        BiConsumer<String,String> n=(t,y)-> System.out.println("selam2");

        Supplier<String> x = String::new; //parametre almaz ve String tipinde deger dondurur
        BiConsumer<String, String> y = m.andThen(n); //bu sekilde kullanılır
        UnaryOperator<String> z = a ->a + a;//String tipinde parametre alır ve String doner
    }
}
