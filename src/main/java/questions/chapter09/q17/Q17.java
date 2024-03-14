package questions.chapter09.q17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/*

What is the result of the following code? (Choose all that apply.)
48: var map = Map.of(1,2, 3, 6);
49: var list = List.copyOf(map.entrySet());
50:
51: List<Integer> one = List.of(8, 16, 2);
52: var copy = List.copyOf(one);
53: var copyOfCopy = List.copyOf(copy);
54: var thirdCopy = new ArrayList<>(copyOfCopy);
55:
56: list.replaceAll(x ->x * 2);
57: one.replaceAll(x ->x * 2);
58: thirdCopy.replaceAll(x ->x * 2);
59:
60: System.out.println(thirdCopy);
A. One line fails to compile.
B. Two lines fail to compile.
C. Three lines fail to compile.
D. The code compiles but throws an exception at runtime.
++E. If any lines with compiler errors are removed, the code throws an exception at runtime.
F. If any lines with compiler errors are removed, the code prints [16, 32, 4].
G. The code compiles and prints [16, 32, 4] without any changes.

 */

public class Q17 {
    public static void main(String[] args) {

        var map = Map.of(1,2,3,6);
        var list= List.copyOf(map.entrySet());

        List<Integer> one=List.of(8,16,2);
        var copy=List.copyOf(one);
        var copyOfCopy=List.copyOf(copy);
        var thirdCopy=new ArrayList<>(copyOfCopy);

        //list.replaceAll(x ->x*2); key value pair olarak 2 parametre verilmesi  lazım
        one.replaceAll(x->x*2); //runtime da hata verir cunku immutable liste üzerinde değişiklık yapılmaz
        thirdCopy.replaceAll(x->x*2); //

        System.out.println(thirdCopy);
    }
}
