package questions.chapter08.q16;

import java.util.List;
import java.util.function.Predicate;
/*

Which of the following can be inserted without causing a compilation error? (Choose all
that apply.)
public void remove(List<Character> chars) {
char end = 'z';
// INSERT LINE HERE
Predicate<Character> predicate = c ->
{
char start = 'a'; return start <= c && c <= end; };

A. char start = 'a';
B. char c = 'x';
++C. chars = null;
D. end = '1';
E. None of the above
 */

public class Q16 {

    public void remove(List<Character> chars){

        char end ='z';

        //char start ='a'; //lambda da tanımlandıgı için olmaz
      //  char c= 'x'; lambda da tanımladıgı için olmaz
        chars =null; //olur
       // end='l'; // olmaz cunku tekrar atama yapılamaz lambda içerisinde kullanılan parametreye effectively final olmak zorundadır



        Predicate<Character> predicate = c ->{
            char start = 'a' ; return start<=c && c<=end;
         };
    }
}
