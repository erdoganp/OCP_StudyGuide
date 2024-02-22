package questions.chapter08.q17;

/*

What is the result of running the following class?
1: import java.util.function.*;
2:
3: public class Panda {
4: int age;
5: public static void main(String[] args) {
6: Panda p1 = new Panda();
7: p1.age = 1;
8: check(p1, p ->{p.age < 5});
9: }
10: private static void check(Panda panda,
11: Predicate<Panda> pred) {
12: String result = pred.test(panda)
13: ? "match" : "not match";
14: System.out.print(result);
15: } }
A. match
B. not match
++C. Compiler error on line 8
D. Compiler error on line 10
E. Compiler error on line 12
F. A runtime exception is thrown.

 */

import java.util.function.Predicate;

public class Panda {

    int age;

    public static void main(String[] args) {
        Panda p1=new Panda();
        p1.age=1;
        //check(p1, p->{p.age < 5}); Burada COMPILE ERROR verir cunku suslu parantez var ama return ve noktalı virgül kullanılmamıs
    }

    private static void check(Panda panda , Predicate<Panda> pred){
        String result =pred.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}
