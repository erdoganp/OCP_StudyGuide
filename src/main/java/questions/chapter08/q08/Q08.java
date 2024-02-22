package questions.chapter08.q08;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*

Which of the following is equivalent to this code? (Choose all that apply.)
UnaryOperator<Integer> u = x ->
x * x;
A. BiFunction<Integer> f = x ->x*x;
B. BiFunction<Integer, Integer> f = x ->x*x;
C. BinaryOperator<Integer, Integer> f = x ->x*x;
D. Function<Integer> f = x ->x*x;
++E. Function<Integer, Integer> f = x ->x*x;
F. None of the above

* */

public class Q08 {

    UnaryOperator<Integer> u= x ->x * x;

   // BiFunction<Integer> f = x1 -> x1*x1; // 3 tip olarak tanılanması gerek BiFunction<T,U,R>

   // BiFunction<Integer, Integer> f2 = x2 -> x2*x2;//3 tip olarak tanılanması gerek BiFunction<T,U,R>

   // BinaryOperator<Integer, Integer> f3 = x3 ->x3*x3;  //1 tip olarak tanımlanması gerek BinaryOperator<T>

   // Function<Integer> f4 = x4 -> x4*x4; //2 tip olarak tanımlanması gerek Function<T,R>

    Function<Integer, Integer> f5 = x5 -> x5*x5;








}
