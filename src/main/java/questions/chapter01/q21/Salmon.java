package questions.chapter01.q21;

public class Salmon {
/*
What is the output of executing the following class?
A.7-0-2-1-
B.7-0-1-
C.0-7-2-1-
++D.7-0-2-4-
E.0-7-1-
F.The class does not compile because of line 3.
G. The class does not compile because of line 4.
H. None of the above.

* */

    int count;
    {System.out.print(count+"-");}
    {count++;}

    public Salmon(){
     count =4;
        System.out.print(2 +"-");
    }

    public static void main(String[] args){
        System.out.print(7+ "-");
        var s=new Salmon();
        System.out.print(s.count+"-");
    }

}
