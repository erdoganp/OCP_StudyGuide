package questions.chapter08.q01;
/*
What is the result of the following class?
1: import java.util.function.*;
2:
3: public class Panda {
4: int age;
5: public static void main(String[] args) {
6: Panda p1 = new Panda();
7: p1.age = 1;
8: check(p1, p ->
p.age < 5);
9: }
10: private static void check(Panda panda,
11: Predicate<Panda> pred) {
12: String result =
13: pred.test(panda) ? "match" : "not match";
14: System.out.print(result);
15: } }
A. ++match
B. not match
C. Compiler error on line 8
D. Compiler error on lines 10 and 11
E. Compiler error on lines 12 and 13
F. A runtime exception is thrown.


*/



/**
 *
 * */
import java.util.function.Predicate;

public class Panda {

    int age;

    public static void main(String[] args) {
        Panda p1=new Panda();

        p1.age=1;
        check(p1,p -> p.age < 5); //burada p ile gösterilen obje p1 objesi cunku check methodu tanımında bu sekilde gösterildi


    }


    /**
     * check methodumuz ,ilk parametresi panda objesi,ikinci parametresi Panda objesi alan ve geriye boolen donen bir predicate functional interface,
     *
     * */
    private static void check(Panda panda, Predicate<Panda> pred){

        String result=pred.test(panda) ? "match"  :"not match"; // lambda expression true ise match false ise not match don
        System.out.println(result);
    }

}
