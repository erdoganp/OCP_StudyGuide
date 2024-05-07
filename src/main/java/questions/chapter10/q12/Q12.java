package questions.chapter10.q12;

import java.util.Set;
import java.util.stream.Stream;

public class Q12 {
    /*

    12. Which is true of the following code?
Set<String> birds = Set.of("oriole", "flamingo");
Stream.concat(birds.stream(), birds.stream(), birds.stream())
.sorted() // line X
.distinct()
.findAny()
.ifPresent(System.out::println);
A. It is guaranteed to print flamingo as is and when line X is removed.
B. It is guaranteed to print oriole as is and when line X is removed.
C. It is guaranteed to print flamingo as is, but not when line X is removed.
D. It is guaranteed to print oriole as is, but not when line X is removed.
E. The output may vary as is.
+++F. The code does not compile.
G. It throws an exception because the same list is used as the source for multiple streams.

     */

/**
 *  public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) */

    public static void main(String[] args) {

        Set<String>  birds =Set.of("oriole", "flamingo");
        //Stream.concat(birds.stream(),birds.stream(),birds.stream()) //DOES NOT COMPILE cunku 3 parametre almıs concat.2 parametre alması gerekiyor
        Stream.concat(birds.stream(),birds.stream())
                .sorted() //sıralama yapar
                .findAny().ifPresent(System.out::println); //flamingo ilk eleman oldugu için onu doner

    }
}
