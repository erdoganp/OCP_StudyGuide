package questions.chapter10.q19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q19 {

    /*

    19. What is the simplest way of rewriting this code?
List<Integer> x = IntStream.range(1, 6)
.mapToObj(i ->i)
.collect(Collectors.toList());
x.forEach(System.out::println);

A.
IntStream.range(1, 6); //bir cıktı üretmez

++B.
IntStream.range(1, 6)
.forEach(System.out::println);

C. //calısır ama en basit hali bu değil maptoObject yapmaya gerek yok
IntStream.range(1, 6)
.mapToObj(i ->i)
.forEach(System.out::println);

D. None of the above is equivalent.
E. The provided code does not compile.
     */

    public static void main(String[] args) {
        List<Integer> x= IntStream.range(1, 6)
                .mapToObj(i->i)
                .collect(Collectors.toList());
        x.forEach(System.out::println);
    }

    private static void optionA(){

        IntStream.range(1,6);

    }

    private static void optionB(){

      IntStream.range(1,6)
                .forEach(System.out::println);
    }

    private static void optionC(){
        IntStream.range(1,6)
                .mapToObj(i->i)
                .forEach(System.out::println);

    }


}
