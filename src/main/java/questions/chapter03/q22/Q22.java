package questions.chapter03.q22;

import com.sun.tools.javac.Main;

public class Q22 {
    /*
    22. What is the output of the following code snippet? (Choose all that apply.)
2: var tailFeathers = 3;
3: final var one = 1;
4: switch (tailFeathers) {
5: case one: System.out.print(3 + " ");
6: default: case 3: System.out.print(5 + " ");
7: }
8: while (tailFeathers > 1) {
9: System.out.print(--tailFeathers+ " "); }
A. 3
B. 5 1
C. 5 2
D. 3 5 1
++E. 5 2 1
F. The code will not compile because of lines 3–5.
G. The code will not compile because of line 6.
     */
    public static void main(String[] args) {
        var tailFeathers = 3;
        final var one = 1;
         switch (tailFeathers) {
               case one: System.out.print(3 + " ");
               default: case 3: System.out.print(5 + " ");
                 }
         while (tailFeathers > 1) {
             System.out.print(--tailFeathers+ " "); }
    }
}
