package questions.chapter08.q06;

import java.util.function.Predicate;

/*

Which of the following lambda expressions can be passed to a function of Predicate<String>
type? (Choose all that apply.)

++A. s ->s.isEmpty()
B. s -->s.isEmpty()
++C. (String s) ->s.isEmpty()
D. (String s) -->s.isEmpty()
E. (StringBuilder s) ->s.isEmpty()
F. (StringBuilder s) -->s.isEmpty()

* */
public class Q06 {

    public static void main(String[] args) {
        Predicate<String > st=s ->s.isEmpty();
//        Predicate<String > st2=s -->s.isEmpty();
        Predicate<String> st3= (String s) ->s.isEmpty();
//        Predicate<String> st4= (String s) -->s.isEmpty(); --> olamaz
   //     Predicate<String > st5=StringBuilder s ->s.isEmpty(); //StringBuilder olamaz
     //   Predicate<String > st6=StringBuilder s-->s.isEmpty(); //StringBuilder olamaz
    }

}
