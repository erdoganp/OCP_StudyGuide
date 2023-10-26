package questions.chapter03.q05;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    /*
    5. What is the output of the following code snippet?
List<Integer> myFavoriteNumbers = new ArrayList<>();
myFavoriteNumbers.add(10);
myFavoriteNumbers.add(14);
for (var a : myFavoriteNumbers) {
System.out.print(a + ", ");
break;
}
for (int b : myFavoriteNumbers) {
continue;
System.out.print(b + ", ");
}
for (Object c : myFavoriteNumbers)
System.out.print(c + ", ");
A. It compiles and runs without issue but does not produce any output.
B. 10, 14,
C. 10, 10, 14,
D. 10, 10, 14, 10, 14,
++E. Exactly one line of code does not compile.
F. Exactly two lines of code do not compile.
G. Three or more lines of code do not compile.
H. The code contains an infinite loop and does not terminate
     */

    public static void main(String[] args) {
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }
        for (int b : myFavoriteNumbers) {
            continue;
           // System.out.print(b + ", "); continue dan sonra ifade yazılmaz unreachable oldugu için derleme hatası verir
        }
        for (Object c : myFavoriteNumbers)
            System.out.print(c + ", ");
    }

}
