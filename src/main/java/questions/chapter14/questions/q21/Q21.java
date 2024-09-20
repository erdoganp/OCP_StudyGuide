package questions.chapter14.questions.q21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Q21 {

    /*
    21. Assume that /monkeys exists as a directory containing multiple files, symbolic links, and
subdirectories. Which statement about the following code is correct?
var f = Path.of("/monkeys");
try (var m =
Files.find(f, 0, (p,a) ->
a.isSymbolicLink())) { // y1
m.map(s ->
s.toString())
.collect(Collectors.toList())
.stream()
.filter(s ->
s.toString().endsWith(".txt")) // y2
.forEach(System.out::println);
}
A. It will print all symbolic links in the directory tree ending in .txt.
B. It will print the target of all symbolic links in the directory ending in .txt.
++C. It will print nothing.
D. It does not compile because of line y1.
E. It does not compile because of line y2.
F. It compiles but throws an exception at runtime.

     */

    public static void main(String[] args) throws IOException {

        var f= Path.of("extras/chapter14/monkeys");

        Files.createFile(Path.of(f.toString(), "sample-file.txt"));

        Files.createSymbolicLink(Path.of("extras/chapter14/monkeys/symbolic.txt"), f);

        try(var m =Files.find(f, 0, (p, a) ->a.isSymbolicLink())){ //max depth 0 oldugu için bir cıktı yazmaz
            m.map(s->s.toString())
                    .collect(Collectors.toList())
                    .stream()
                    .filter(s->s.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        }
    }

}
