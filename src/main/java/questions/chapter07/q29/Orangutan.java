package questions.chapter07.q29;
/*
How many lines of the following program contain a compilation error?
1: class Primate {
2: protected int age = 2;
3: { age = 1; }
4: public Primate() {
5: this().age = 3;
6: }
7: }
8: public class Orangutan {
9: protected int age = 4;
10: { age = 5; }
11: public Orangutan() {
12: this().age = 6;
13: }
14: public static void main(String[] bananas) {
15: final Primate x = (Primate)new Orangutan();
16: System.out.println(x.age);
17: }
18: }
A. None, and the program

A. None, and the program prints 1 at runtime.
B. None, and the program prints 3 at runtime.
C. None, but it causes a ClassCastException at runtime.
D. 1
E. 2
++F. 3
G. 4

*/


class Primate{

    protected int age=2;
    {age=1;}
    public Primate(){
        //this().age; //this.age olmalı
    }
}
public class Orangutan {

    protected int age=4;
    {age=5;}

    public Orangutan(){
     //   this().age=6; //this.age olmalı
    }

    public static void main(String[] bananas) {
        //final Primate x=(Primate)new Orangutan();//aralarında hiyerarşik bir yapı olmadıgı için hata verir
       // System.out.println(x.age);

    }
}
