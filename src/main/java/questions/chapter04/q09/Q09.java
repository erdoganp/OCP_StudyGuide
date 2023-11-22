package questions.chapter04.q09;

import java.lang.reflect.Array;

public class Q09 {
    /*
    Which of the following are true about arrays? (Choose all that apply.)
++A. The first element is index 0.
B. The first element is index 1.
++C. Arrays are fixed size.
D. Arrays are immutable. //arraylerin içerikleri değiştirilebildiği için immutable degildir
E. Calling equals() on two different arrays containing the same primitive values always
returns true.
++F. Calling equals() on two different arrays containing the same primitive values always
returns false.
G. Calling equals() on two different arrays containing the same primitive values can return
true or false.
     */

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3};
        int[] b=new int[]{1,2,3};

       String text= a.equals(b) ? "dogru" :  "yanlıs";
        System.out.println(text);
    }

}
