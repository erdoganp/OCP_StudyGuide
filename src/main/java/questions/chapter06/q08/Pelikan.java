package questions.chapter06.q08;
/*
What is the result of the following code?
1: abstract class Bird {
2: private final void fly() { System.out.println("Bird"); }
3: protected Bird() { System.out.print("Wow-");
}
4: }
5: public class Pelican extends Bird {
6: public Pelican() { System.out.print("Oh-");
}
7: protected void fly() { System.out.println("Pelican"); }
8: public static void main(String[] args) {
9: var chirp = new Pelican();
10: chirp.fly();
11: } }

A. Oh-Bird
B. Oh-Pelican
C. Wow-Oh-Bird
++D. Wow-Oh-Pelican
E. The code contains a compilation error.
F. None of the above
 */

abstract class Bird{
    private final void fly(){
        System.out.println("Bird");
    }
    protected Bird(){
        System.out.print("Wow-");
    }
}

public class Pelikan extends Bird{
    public Pelikan(){
        System.out.print("Oh-");

    }

    protected void fly(){
        System.out.print("Pelikan");
    }

    public static void main(String[] args) {
        var chirp=new Pelikan();
        chirp.fly();
    }
}
