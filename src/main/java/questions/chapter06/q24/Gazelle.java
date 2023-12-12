package questions.chapter06.q24;
/*
What is printed by the following program?
1: class Antelope {
2: public Antelope(int p) {
3: System.out.print("4");
4: }
5: { System.out.print("2"); }
6: static { System.out.print("1"); }
7: }
8: public class Gazelle extends Antelope {
9: public Gazelle(int p) {
10: super(6);
11: System.out.print("3");
12: }
13: public static void main(String hopping[]) {
14: new Gazelle(0);
15: }
16: static { System.out.print("8"); }
17: { System.out.print("9"); }
18: }

A. 182640
B. 182943
++C. 182493
D. 421389
E. The code does not compile.
F. The output cannot be determined until runtime

 */
class Antelope{
    public Antelope(int p){
        System.out.print("4");
    }
    {
        System.out.print("2");
    }
    static {
        System.out.print("1");
    }
}
public class Gazelle  extends Antelope{
    public Gazelle(int p){
        super(6);
        System.out.print("3");

    }

    public static void main(String[] args) {
        new Gazelle(0);
    }
    static {
        System.out.print("8");
    }
    {
        System.out.print("9");
    }
}
