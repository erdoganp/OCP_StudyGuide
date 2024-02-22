package questions.chapter08.q10;

import java.util.List;
import java.util.function.Predicate;
/*

Which of the following can be inserted without causing a compilation error? (Choose all
that apply.)
public void remove(List<Character> chars) {
char end = 'z';
Predicate<Character> predicate = c ->
{
char start = 'a'; return start <= c && c <= end; };
// INSERT LINE HERE
}

++A. char start = 'a';
++B. char c = 'x';
++C. chars = null;
D. end = '1';
E. None of the above

*/

public class Q10 {

    public void remove(List<Character> chars){

        char end ='z';

        Predicate<Character> predicate =c ->{
            char start ='a' ; return start <=c && c<=end;
        };

        char start='a'; //start parametresi lambda expression içinde ayrı olarak tanımlandıgı için bundan bagımsızdır
        char c='x'; //lambda expression kısmında tanımlandıgı için bundan bagımsızdır.
        chars = null; // lambda expressionda kullanılmadıgı için burada assigment yapılabilir

        //  end='l'; //end parametresi lambda expression içerisinde kullanıldıgı için potansiyel olarak final olmak zorunda
                //bundan dolayı tekrar bir assginment yapılamaz


    }
}
