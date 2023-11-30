package questions.chapter05.q04;

public class Q04 {
    /**
     * aynı anda hem casting hemde wideling yapılamaz
     * */
    /*
    4. Which of the following can fill in the blank and allow the code to compile? (Choose all that apply.)
final _______song = 6;
++A. int
++B. Integer
++C. long
D. Long
++E. double
F. Double
     */

    void method(){

        final int song=6;
        final Integer song2=6;
        final long song3=6;
        //final Long song4=6;
        final double song5=6;
        //final Double song6=6;
    }
}
