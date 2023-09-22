package questions.chapter01.q20;

public class PoliceBox {
/*
A. It prints Q1=blue.
B. It prints Q2=1200.
++C. It prints P1=null.
D. It prints P2=1400.
E. Line 4 does not compile.
F. Line 12 does not compile.
G. Line 13 does not compile.
H. None of the above.
* */


    String color;
    long age;
    public void PoliceBox(){
        color ="blue";
        age=1200;
    }

    public static void main(String[] args){

        var p =new PoliceBox();
        var q=new PoliceBox();

        p.color="green";
        p.age=1400;

        p=q;

        System.out.println("Q1=" +q.color);
        System.out.println("Q2=" + q.age);
        System.out.println("P1=" + p.color);
        System.out.println("P2=" +p.age);



    }
}
