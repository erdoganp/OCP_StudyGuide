package questions.chapter05.q10;


import questions.chapter05.q10.rope.Rope;

import static questions.chapter05.q10.rope.Rope.*;


public class Chimp {
    public static void main(String[] args) {

        /*
A. swing swing 5
++B. swing swing 10
C. Compiler error on line 2 of Chimp
D. Compiler error on line 5 of Chimp
E. Compiler error on line 6 of Chimp
F. Compiler error on line 7 of Chimp
         */
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);
    }
}
