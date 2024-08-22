package questions.chapter13.working_with_the_parallel_stream.creating_parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample3 {

    public static void main(String[] args) {

        System.out.println("Serial ..");

        List<String> alpha =getData();
        alpha.stream().forEach(System.out::println);

        System.out.println("Parallel ..");

        List<String> alpha2=getData();
        alpha2.parallelStream().forEach(System.out::println);
    }

    private static List<String> getData(){

        List<String> alpha=new ArrayList<>();

        int n=97;
        while (n<=122){
            char c=(char) n;
            alpha.add(String.valueOf(c));
            n++;
        }

        return alpha;

    }
}
