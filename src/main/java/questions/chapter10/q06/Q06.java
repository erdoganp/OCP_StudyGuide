package questions.chapter10.q06;

import java.util.stream.Stream;

public class Q06 {


    /*

    Which of the following can fill in the blank so that the code prints out false? (Choose all
that apply.)
var s = Stream.generate(() ->"meow");
var match = s._________ (String::isEmpty);
System.out.println(match);
++A. allMatch
B. anyMatch //hang
C. findAny //optional<>
D. findFirst //optional
E. noneMatch /hang
F. None of the above
     */

    public static void main(String[] args) {
        optionA();
        //optionB();
       // optionC();

    }


    private static void optionA(){

        var s= Stream.generate(()->"meow");
        var match=s.allMatch(String ::isEmpty);
        System.out.println(match);
    }

    private static void optionB(){
        var s= Stream.generate(()->"meow");
        var match=s.anyMatch(String ::isEmpty);  //hang olur cunku hiç bulamıyor ve kırılım yapamıyor
        System.out.println(match);

    }

    private static void optionC(){

        var s= Stream.generate(()->"meow");
      //  var match=s.findAny(String ::isEmpty);
       // System.out.println(match);
    }

    private static void optionD(){

        /**findFirst() ve findAny() methodları Optional<T> doner*/

        var s= Stream.generate(()->"meow");
        //var match=s.findFirst(String ::isEmpty);
        //var match=s.findAny(String ::isEmpty);
        //System.out.println(match);
    }

    private static void optionF(){

        var s= Stream.generate(()->"meow");
        var match=s.noneMatch(String ::isEmpty);
        System.out.println(match);
    }

}
