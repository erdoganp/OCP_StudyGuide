package questions.chapter09.q13;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*

What is the result of the following code? (Choose all that apply.)
Comparator<Integer> c1 = (o1, o2) ->
o2 -o1;
Comparator<Integer> c2 = Comparator.naturalOrder();
Comparator<Integer> c3 = Comparator.reverseOrder();
var list = Arrays.asList(5, 4, 7, 2);
Collections.sort(list, );
Collections.reverse(list);
Collections.reverse(list);
System.out.println(Collections.binarySearch(list, 2));
++A. One or more of the comparators can fill in the blank so that the code prints 0.
B. One or more of the comparators can fill in the blank so that the code prints 1.
C. One or more of the comparators can fill in the blank so that the code prints 2.
D. The result is undefined regardless of which comparator is used.
E. A runtime exception is thrown regardless of which comparator is used.
F. The code does not compile.
 */
public class Q13 {
    public static void main(String[] args) {


        Comparator<Integer> c1=((o1, o2) -> o2-o1);
        Comparator<Integer> c2=Comparator.naturalOrder();
        Comparator<Integer> c3=Comparator.reverseOrder();

        var list= Arrays.asList(5,4,7,2);

        Collections.sort(list,c2); //binary search kullanmamız için natural order olarak tutmamız lazım listeyi
        Collections.reverse(list);//terse cevirir
        Collections.reverse(list);//tekrar terse cevirir ilk bastaki duruma geri doner
        System.out.println(Collections.binarySearch(list,2)); //2 i aradıgımız için sıralama yapıldıgında en basta bulunur ve bastaki index no su 0 dır.
    }

}
