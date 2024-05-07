package questions.chapter10.q09;

import java.util.stream.LongStream;

public class Q09 {

    /*

9. Which of the following can we add after line 6 for the code to run without error and not produce
any output? (Choose all that apply.)
4: var stream = LongStream.of(1, 2, 3);
5: var opt = stream.map(n ->n * 10)
6: .filter(n ->n < 5).findFirst();

A.
if (opt.isPresent())
System.out.println(opt.get());
++B.
if (opt.isPresent())
System.out.println(opt.getAsLong());
C.opt.ifPresent(System.out.println);
++D.opt.ifPresent(System.out::println);
E. None of these; the code does not compile.
F. None of these; line 6 throws an exception at runtime.

     */

    public static void main(String[] args) {

        optionB();
        optionD();

    }

    private static void optionA(){
        var stream = LongStream.of(1,2,3);
        var opt= stream.map(n ->n * 10)
                .filter(n->n<5)
                .findFirst();

        if (opt.isPresent()){
           // System.out.println(opt.get); get methodu kullanılmaz longStream oldugu için getAsLong olması gerekiyor

        }
    }


    private  static void optionB(){

        var stream = LongStream.of(1,2,3);
        var opt= stream.map(n ->n * 10)
                .filter(n->n<5)
                .findFirst();


        if(opt.isPresent()){
            System.out.println(opt.getAsLong());
        }

    }


    private static void optionC(){
        var stream = LongStream.of(1,2,3);
        var opt= stream.map(n ->n * 10)
                .filter(n->n<5)
                .findFirst();

        //opt.ifPresent(System.out.println); bu sekilde olmaz method refrence ile yazmak yada lambda expression ile yazılması gerekiyor
    }

    private static void optionD(){

        var stream = LongStream.of(1,2,3);
        var opt= stream.map(n ->n * 10)
                .filter(n->n<5)
                .findFirst();

        opt.ifPresent(System.out::println);
    }

}
