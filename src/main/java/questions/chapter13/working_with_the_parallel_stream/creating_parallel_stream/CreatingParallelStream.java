package questions.chapter13.working_with_the_parallel_stream.creating_parallel_stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreatingParallelStream {

    public static void main(String[] args) {

        Collection<Integer> collection = List.of(1,2);

        Stream<Integer> p1=collection.stream().parallel();
        Stream<Integer> p2=collection.parallelStream();
    }
}
