package questions.chapter07.q25;
/*

What does the following program print?
1: public class Zebra {
2: private int x = 24;
3: public int hunt() {
4: String message = "x is ";
5: abstract class Stripes {
6: private int x = 0;
7: public void print() {
8: System.out.print(message + Zebra.this.x);
9: }
10: }
11: var s = new Stripes() {};
12: s.print();
13: return x;
14: }
15: public static void main(String[] args) {
16: new Zebra().hunt();
17: } }

A. x is 0
++B. x is 24
C. Line 6 generates a compiler error.
D. Line 8 generates a compiler error.
E. Line 11 generates a compiler error.
F. None of the above

 */

public class Zebra {

    private int x=24;
    public int hunt(){
        String message="x is ";

        abstract class Stripes{
            private int x=0;
            public void print(){
                System.out.println(message + Zebra.this.x);
            }
        }
/**
 * burada anonim sınıf {} ile kullanıldıgı için abstract sınıfda newlenebiliyor
 *
 * * */
        var s=new Stripes(){};//burada onemli olan abstract sınıf olan Stripes sınıfının anonim class ile newlenebilmesi
        s.print();
        return x;
    }

    public static void main(String[] args) {
        new Zebra().hunt();

    }
}
