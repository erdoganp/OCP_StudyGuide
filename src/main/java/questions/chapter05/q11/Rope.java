package questions.chapter05.q11;

public class Rope {
    /*

    A. The code compiles as is.
++B. There is exactly one compiler error in the code.
C. There are exactly two compiler errors in the code.
D. If the line(s) with compiler errors are removed, the output is swing-climb.
++E. If the line(s) with compiler errors are removed, the output is swing-swing.
F. If the line(s) with compile errors are removed, the code throws a NullPointerException.
     */


    public static void swing(){
        System.out.println("swing");
    }

    public void climb(){
        System.out.println("climb");
    }

    public static void play(){
        swing();
        //climb(); instance method oldugu için static method içinde direk olarak cagrılmaz
    }

    public static void main(String[] args) {
        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        System.out.println("-");
        rope2.play();//null pointer exceoption vermez cunku static methodlar null üzerindende calısır
    }
}
