package questions.chapter09.q08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*

What is the result of the following program?
3: public class MyComparator implements Comparator<String> {
4: public int compare(String a, String b) {
5: return b.toLowerCase().compareTo(a.toLowerCase());
6: }
7: public static void main(String[] args) {
8: String[] values = { "123", "Abb", "aab" };
9: Arrays.sort(values, new MyComparator());
10: for (var s: values)
11: System.out.print(s + " ");
12: }
13: }
++A. Abb aab 123
B. aab Abb 123
C. 123 Abb aab
D. 123 aab Abb
E. The code does not compile.
F. A runtime exception is thrown.

 */

public class MyComparator implements Comparator<String> {

    /**
     * Kuralllar
     * 1.Eger Comparator interface i implemente edildiyse compare(T t, T t) methodu implemente edilmesi gerekiyor
     * 2.sıralamada rakamlar en once gelir yani enkucuktur.
     * 3.buyuk harfler rakamlardan sonra gelir
     * 4.kucuk harfler en sona gelir.
     * kucukten buyuge sıralama bu sekilde
     * alttaki sıralamada tersi yapılmıs
     * */

    public int compare(String a, String b){ //kullanım dogru
        return b.toLowerCase().compareTo(a.toLowerCase()); //once b yi aldıgı için buyukten kucuge sıralama yapılıyor
    }

    public static void main(String[] args) {
        String[] values ={"123","Abb","aab"};
        Arrays.sort(values,new MyComparator());
        for(var s:values){
            System.out.println(s + " ");
        }

    }

    }

