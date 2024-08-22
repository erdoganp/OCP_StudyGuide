package questions.chapter13.working_with_the_parallel_stream.creating_parallel_stream;

import java.util.stream.IntStream;

public class ParallelStreamExample2 {

    public static void main(String[] args) {
        System.out.println("Normal ...");

        IntStream range =IntStream.rangeClosed(1, 10);
        range.forEach(x->{
            System.out.println("Thread : " + Thread.currentThread().getName()+ ", value: "+ x);
        });

        System.out.println("Parallel ...");

        IntStream range2= IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(x->{
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value :" + x);
        });
    }
}
