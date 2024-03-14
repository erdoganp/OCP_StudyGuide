package questions.chapter09.q02;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/*

Which of the following are true? (Choose all that apply.)
12: List<?> q = List.of("mouse", "parrot");
13: var v = List.of("mouse", "parrot");
14:
15: q.removeIf(String::isEmpty);
16: q.removeIf(s ->
s.length() == 4);
17: v.removeIf(String::isEmpty);
18: v.removeIf(s ->
s.length() == 4);
A. This code compiles and runs without error.
B. Exactly one of these lines contains a compiler error.
++C. Exactly two of these lines contain a compiler error.
D. Exactly three of these lines contain a compiler error.
E. Exactly four of these lines contain a compiler error.
F. If any lines with compiler errors are removed, this code runs without throwing an
exception.
++G. If any lines with compiler errors are removed, this code throws an exception.

 */

public class Q02 {

    public static void main(String[] args) {
            List<?> q= List.of("mouse","parrot");
            var v=List.of("mouse","parrot");


            /**
             * KURALLAR
             * 1)List.of methodu immutable liste üretir ,yani ekleme ,cıkarma ve değiştirmeye izin vermez
             * 2)<?> unbounded wildcard bize obje turunde liste üretir. yani obje üzerinden hareket ettrilir.
             *
             * */

            //q.removeIf(String::isEmpty); //bu sekilde olmaz cunku q ref bir Object listesini temsil eder String fegil
            //q.removeIf(s->s.length()==4);//Obje lerde length methodu yoktur

        v.removeIf(String::isEmpty); //Compile time da hata vermez fakat List.of methodu ile üretildiği için runtime da silmeya calıstıfında hata verir
        v.removeIf(s->s.length() ==4);


    }

}
