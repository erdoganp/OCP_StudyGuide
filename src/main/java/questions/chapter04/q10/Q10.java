package questions.chapter04.q10;

public class Q10 {
    /*
    How many of these lines contain a compiler error? (Choose all that apply.)
 int one = Math.min(5, 3);
 long two = Math.round(5.5);
 double three = Math.floor(6.6);
 var doubles = new double[] {one, two, three};
++A. 0
B. 1
C. 2
D. 3
E. 4
     */

    public static void main(String[] args) {
        int one = Math.min(5, 3);
        long two = Math.round(5.5);
        double three = Math.floor(6.6);
        var doubles = new double[] {one, two, three};
    }
}
