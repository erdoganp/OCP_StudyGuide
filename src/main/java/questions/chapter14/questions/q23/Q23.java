package questions.chapter14.questions.q23;

public class Q23 {

    /*

    23. What are some possible results of executing the following code? (Choose all that apply.)
var x = Path.of("/animals/fluffy/..");
Files.walk(x.toRealPath().getParent()) // u1
.map(p ->
p.toAbsolutePath().toString()) // u2
.filter(s ->
s.endsWith(".java"))
.forEach(System.out::println);
++A. It prints some files in the root directory. //dosya varsa java tipindekileri basar
B. It prints all files in the root directory.
C. FileSystemLoopException is thrown at runtime.
++D. Another exception is thrown at runtime. //eger dosya yoksa hata fırlatabilir toRealPath methodu
E. The code will not compile because of line u1.
F. The code will not compile because of line u2.

     */
}
