package questions.chapter14.questions.q19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q19 {
    /*

    19. Assuming that the directories and files referenced exist and are not symbolic links, what is
the result of executing the following code?
var p1 = Path.of("/lizard",".").resolve(Path.of("walking.txt"));
var p2 = new File("/lizard/././actions/../walking.txt").toPath();
System.out.print(Files.isSameFile(p1,p2));
System.out.print(" ");
System.out.print(p1.equals(p2));
System.out.print(" ");
System.out.print(Files.mismatch(p1,p2));
A. true true -1
B. true true 0
++C. true false -1
D. true false 0
E. false true -1
F. false true 0
G. The code does not compile.
H. The result cannot be determined.

     */

    public static void main(String[] args) throws IOException {

        var p1= Path.of("extras/chapter14/lizard", ".").resolve(Path.of("walking.txt"));
        var p2=new File("extras/chapter14/lizard/././actions/../walking.txt").toPath();


        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.normalize());
        System.out.println(p2.normalize());

        System.out.println(Files.isSameFile(p1,p2));
        System.out.println(" ");
        System.out.println(p1.equals(p2));
        System.out.println(" ");
        System.out.println(Files.mismatch(p1,p2));
    }
}
