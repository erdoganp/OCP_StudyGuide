package questions.chapter10.q18;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Paging {
    /*
What is the output of the following?
11: public class Paging {
12: record Sesame(String name, boolean human) {
13: @Override public String toString() {
14: return name();
15: }
16: }
17: record Page(List<Sesame> list, long count) {}
18:
19: public static void main(String[] args) {
20: var monsters = Stream.of(new Sesame("Elmo", false));
21: var people = Stream.of(new Sesame("Abby", true));
22: printPage(monsters, people);
23: }
24:
25: private static void printPage(Stream<Sesame> monsters,
26: Stream<Sesame> people) {
27: Page page = Stream.concat(monsters, people)
28: .collect(Collectors.teeing(
29: Collectors.filtering(s ->
s.name().startsWith("E"),
30: Collectors.toList()),
31: Collectors.counting(),
32: (l, c) ->
new Page(l, c)));
33: System.out.println(page);
34: } }
A. Page[list=[Abby], count=1]
B. Page[list=[Abby], count=2]
C. Page[list=[Elmo], count=1]
++D. Page[list=[Elmo], count=2]
E. The code does not compile due to Stream.concat().
F. The code does not compile due to Collectors.teeing().
G. The code does not compile for another reason.


     */

    record Sesame(String name, boolean human){

        @Override public String toString(){
            return name;
        }

    }

    record Page(List<Sesame> list, long count){

    }

    public static void main(String[] args) {
        var monsters= Stream.of(new Sesame("Elmo", false));
        var people =Stream.of(new Sesame("Abby", true));

        printPage(monsters, people);
    }

    public static void printPage(Stream<Sesame> monsters,
                                 Stream<Sesame> people){

        Page page =Stream.concat(monsters, people)
                .collect(Collectors.teeing(
                        Collectors.filtering(s->s.name().startsWith("E"), Collectors.toList()), //birinci listeyi temsil eder
                        Collectors.counting(), //ikinci parametreyi temsil eder
                        (l, c) ->new Page(l, c)));
        System.out.println(page);
    }



}
