package questions.chapter14.questions.q05;

import java.nio.file.Files;
import java.nio.file.Path;

public class Q05 {

    /*

    5. Assume that the directory /animals exists and is empty. What is the result of executing the
following code?
Path path = Path.of("/animals");
try (var z = Files.walk(path)) {
boolean b = z
.filter((p,a) ->
a.isDirectory() && !path.equals(p)) // x
.findFirst().isPresent(); // y
System.out.print(b ? "No Sub": "Has Sub");
}
A. It prints No Sub.
B. It prints Has Sub.
++C. The code will not compile because of line x.
D. The code will not compile because of line y.
E. The output cannot be determined.
F. It produces an infinite loop at runtime.

     */


    public static void main(String[] args) {


    }

    void method(){

        Path path =Path.of("/animals");
//        try(var z= Files.walk(path)){
//            boolean b=z
//                    .filter((p,a ) ->a.isDirectory() !path.equals(p))// x
//            .findFirst().isPresent(); //y
//
//            System.out.println(b ? "No Sub" : "Has Sub");
//        }


    /**the filter operation to Stream<Path> takes only one parameter, not tww*/

    }
}