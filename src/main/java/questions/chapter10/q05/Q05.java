package questions.chapter10.q05;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Q05 {
    /*
    Which of the following sets result to 8.0? (Choose all that apply.)
A.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->(int) x)
.collect(Collectors.groupingBy(x ->x))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));
B.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->x)
.boxed()
.collect(Collectors.groupingBy(x ->x))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));
C.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->(int) x)
.boxed()
.collect(Collectors.groupingBy(x ->x))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));

D.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->(int) x)
.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));
E.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->x)
.boxed()
.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));
F.
double result = LongStream.of(6L, 8L, 10L)
.mapToInt(x ->(int) x)
.boxed()
.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
.keySet()
.stream()
.collect(Collectors.averagingInt(x ->x));


     */

    public static void main(String[] args) {

        optionC();
        optionF();
    }

    private  static void optionA(){
//
//        double result= LongStream.of(6L, 8L, 10L)
//                .mapToInt(x ->(int) x)
//                .collect(Collectors.groupingBy(x->x)) //collect methodunu cagırabilmemiz için boxed kullanmamız gerek
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x->x));
    }


    private static void optionB(){
//
//        double result= LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x) //burada cast yapılması gerek ki long dan int e cevirilsin diye
//                .boxed()
//                .collect(Collectors.groupingBy(x->x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x->x));

    }



    private static void optionC(){

        double result=LongStream.of(6L,8L, 10L)
                .mapToInt(x->(int) x)
                .boxed()
                .collect(Collectors.groupingBy(x->x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x->x));

        System.out.println(result);
    }


    private static void optionD(){
//        double result=LongStream.of(6L, 8L, 10L)
//                .mapToInt(x->(int) x) //boxed methodu kullanılmamıs
//                .collect(Collectors.groupingBy(x->x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x->x));
    }

    private static void optionE(){
//
//        double result= LongStream.of(6L, 8L, 10L)
//                .mapToInt(x->x)//cast yapılmamıs
//                .boxed()
//
    }

    private static void optionF(){

        double result= LongStream.of(6L, 8L, 10L)
                .mapToInt(x->(int)x)
                .boxed()
                .collect(Collectors.groupingBy(x->x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x->x));


        System.out.println(result);
    }

}
