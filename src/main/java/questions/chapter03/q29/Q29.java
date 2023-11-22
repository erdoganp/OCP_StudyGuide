package questions.chapter03.q29;

import com.sun.jdi.IntegerValue;

public class Q29 {
    /*
    29. What is the result of the following code?
1: public class PrintIntegers {
2: public static void main(String[] args) {
3: int y = -2;
4: do System.out.print(++y + " ");
5: while(y <= 5);
6: } }
A. -2-10 1 2 3 4 5
B. -2-1 0 1 2 3 4
C. -1 0 1 2 3 4 5 6
D. -1 0 1 2 3 4 5
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.
     */
    public static void main(String[] args) {
        int y=-2;
        do System.out.println(++y + " ");
        while (y<=5);

        Integer k =5;
        Integer l=5;

        boolean flag=(k==l);

        System.out.println(flag);

        Integer a=5;

        a.toString();

    }
}
