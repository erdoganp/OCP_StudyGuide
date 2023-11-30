package questions.chapter05.q16;

public class Test {
    /*
    What is the result of the following statements?
    A. byte-float-Object-
    B.int-float-Object-
    C.byte-Object-float-
    D.int-Object-float-
  ++E.int-Object-Object-
    F.byte-Object-Object-
     */

    public void print(byte x){
        System.out.println("byte-");
    }

    public void print(int x){
        System.out.println("int-");

    }

    public void print(float x){
        System.out.println("float-");
    }

    public void print(Object x){
        System.out.println("Object-");
    }

    public static void main(String[] args) {
        Test t=new Test();
        short s=123;
        t.print(s);
        t.print(true);
        t.print(6.789);

    }

}
