package questions.chapter08.q13;

import java.util.function.Supplier;

/*

Which is true of the following code?
int length = 3;
for (int i = 0; i<3; i++) {
if (i%2 == 0) {
Supplier<Integer> supplier = () ->
length; // A
System.out.println(supplier.get()); // B
} else {
int j = i;
Supplier<Integer> supplier = () ->
j; // C
System.out.println(supplier.get()); // D
}
}
A. The first compiler error is on line A.
B. The first compiler error is on line B.
C. The first compiler error is on line C.
D. The first compiler error is on line D.
++E. The code compiles successfully.

*/


/**
 * for dongusundeki herbir değer scope dısında oldugu için tekrar atama olarak görülmez bunun için lambda içinde kullanılan değerlerin final olma durumu bozulmaz
 *
 * */
public class Q13 {
    public static void main(String[] args) {
        int length = 3;
        for (int i = 0; i<3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get()); // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j; // C
                System.out.println(supplier.get()); // D
            }
        }
    }

}
