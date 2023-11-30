package questions.chapter05.q17;

public class Squares {
    /*
    17.
        What is the result of the following program?
    A. -1
  ++B. 9
    C. 81
    D. Compiler error on line 9
    E. Compiler error on a different line
     */

    public static long square(int x){
        var y=x * (long)x;
        x=-1;
        return y;

    }

    public static void main(String[] args) {
        var value=9;
        var result=square(value);
        System.out.println(value);
    }
}
