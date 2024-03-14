package questions.chapter09.q12;

import java.util.Comparator;
import java.util.TreeSet;
/*

What is the result of the following program?
3: public record Sorted(int num, String text)
4: implements Comparable<Sorted>, Comparator<Sorted> {
5:
6: public String toString() { return "" + num; }
7: public int compareTo(Sorted s) {
8: return text.compareTo(s.text);
9: }
10: public int compare(Sorted s1, Sorted s2) {
11: return s1.num -s2.
num;
12: }
13: public static void main(String[] args) {
14: var s1 = new Sorted(88, "a");
15: var s2 = new Sorted(55, "b");
16: var t1 = new TreeSet<Sorted>();
17: t1.add(s1); t1.add(s2);
18: var t2 = new TreeSet<Sorted>(s1);
19: t2.add(s1); t2.add(s2);
20: System.out.println(t1 + " " + t2);
21: } }
A. [55, 88] [55, 88]
B. [55, 88] [88, 55]
++C. [88, 55] [55, 88]
D. [88, 55] [88, 55]
E. The code does not compile.
F. A runtime exception is thrown.

 */

public record Sorted(int num, String text) implements Comparable<Sorted>, Comparator<Sorted> {

    public String toString(){
        return "" + num;

    }

    public int compareTo(Sorted s){ //compareTo methodu Comparable interface inden gelir ve tek parametre alır
        return text.compareTo(s.text);
    }
    public int compare(Sorted s1,Sorted s2){ //compare methodu Comparator interfaceinden gelir ve 2 parametre alır
        return s1.num-s2.num;
    }

    public static void main(String[] args) {
        var s1=new Sorted(88,"a");
        var s2=new Sorted(55,"b");

        var t1=new TreeSet<Sorted>(); //burada comparable olarak kullanılır yani compareTo methoduna göre yani texte göre sıralar
        t1.add(s1);
        t1.add(s2);

        var t2=new TreeSet<Sorted>(s1); //burada comparator özelliğini kullanır compare methodunu yani ,int degere göre sıralar
        System.out.println(t2);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }
}
