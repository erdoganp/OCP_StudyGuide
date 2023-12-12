package questions.chapter06.q16;

/*
What is the result of the following?
1: class Arachnid {
2: static StringBuilder sb = new StringBuilder();
3: { sb.append("c"); }
4: static
5: { sb.append("u"); }
6: { sb.append("r"); }
7: }
8: public class Scorpion extends Arachnid {
9: static
10: { sb.append("q"); }
11: { sb.append("m"); }
12: public static void main(String[] args) {
13: System.out.print(Scorpion.sb + " ");
14: System.out.print(Scorpion.sb + " ");
15: new Arachnid();
16: new Scorpion();
17: System.out.print(Scorpion.sb);
18: } }
A. qu qu qumrcrc
B. u u ucrcrm
C. uq uq uqmcrcr
++D. uq uq uqcrcrm
E. qu qu qumcrcr
F. qu qu qucrcrm
G. The code does not compile.

 */
class Arachnid{
    static StringBuilder sb=new StringBuilder();
    {sb.append("c");}
    static
    {sb.append("u");}
    {sb.append("r");}
}
public class Scorpion extends Arachnid{
   int a;
    static {
        sb.append("q");
    }
    {
        sb.append("m");
    }

    void method(){
    }
    public static void main(String[] args) {
        System.out.print(Scorpion.sb + " ");
        System.out.print(Scorpion.sb + " ");
        new Arachnid();
        new Scorpion();
        System.out.print(Scorpion.sb);
    }
}
