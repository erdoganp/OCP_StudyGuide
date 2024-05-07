package questions.chapter10.q16;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q16 {

    /*
16. Which of the following statements are true about this code? (Choose all that apply.)
20: Predicate<String> empty = String::isEmpty;
21: Predicate<String> notEmpty = empty.negate();
22:
23: var result = Stream.generate(() ->"")
24: .limit(10)
25: .filter(notEmpty)
26: .collect(Collectors.groupingBy(k ->k))
27: .entrySet()
28: .stream()
29: .map(Entry::getValue)
30: .flatMap(Collection::stream)
31: .collect(Collectors.partitioningBy(notEmpty));
32: System.out.println(result);
A. It outputs {}.
++B. It outputs {false=[], true=[]}.
C. If we changed line 31 from partitioningBy(notEmpty) togroupingBy(n ->n), it would output {}.
D. If we changed line 31 from partitioningBy(notEmpty) togroupingBy(n ->n), it would output {false=[], true=[]}.
E. The code does not compile.
F. The code compiles but does not terminate at runtime.
     */

    public static void main(String[] args) {
        Predicate<String> empty = String ::isEmpty;
        Predicate<String> notEmpty =empty.negate();

        var result=Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k->k)) //GroupingBy da map yapısı olusur key value olarak
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty)); //partitionBy da true false olarak key value olur sadece

        System.out.println(result);

    }
}
