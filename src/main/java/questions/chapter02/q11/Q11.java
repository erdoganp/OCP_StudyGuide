package questions.chapter02.q11;

public class Q11 {
    /*
    What is the output of the following code?
        11: int sample1 = (2 * 4) % 3;
        12: int sample2 = 3 * 2 % 3;
        13: int sample3 = 5 * (1 % 2);
        14: System.out.println(sample1 + ", " + sample2 + ", " + sample3);
    A. 0, 0, 5
    B. 1, 2, 10
    C. 2, 1, 5
  ++D. 2, 0, 5
    E. 3, 1, 10
    F. 3, 2, 6
    G. The code does not compile.
    */

    public static void main(String[] args){
        int sample1=(2 * 4) % 3;
        int sample2=3 * 2 % 3;
        int sample3=5 * (1 % 2);

        System.out.println(sample1 + ", " + sample2 + ", " + sample3);
    }
}
