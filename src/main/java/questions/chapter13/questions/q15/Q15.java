package questions.chapter13.questions.q15;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q15 {

    /*
    15. Which statement about the following code snippet is correct?
2: var cats = Stream.of("leopard", "lynx", "ocelot", "puma")
3: .parallel();
4: var bears = Stream.of("panda","grizzly","polar").parallel();
5: var data = Stream.of(cats,bears).flatMap(s ->
s)
6: .collect(Collectors.groupingByConcurrent(
7: s ->
!s.startsWith("p")));
8: System.out.println(data.get(false).size()
9: + " " + data.get(true).size());

++A. It outputs 3 4.
B. It outputs 4 3.
C. The code will not compile because of line 6.
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. It compiles but throws an exception at runtime.

     */

    public static void main(String[] args) {
        var cats= Stream.of("leopard", "lynx", "ocelot", "puma")
                .parallel();

        var bears = (Stream.of("panda", "grizzly", "polar").parallel());
        var data=Stream.of(cats, bears).flatMap(s->s)
                .collect(Collectors.groupingByConcurrent(
                        s->!s.startsWith("p") //burada p ile baslamayanları alıyor .
                ));

        System.out.println(data.get(false).size() + " " + data.get(true).size() );//ilk kısımda p ile baslayanları istediği içn sonuc 3 4

    }
}
