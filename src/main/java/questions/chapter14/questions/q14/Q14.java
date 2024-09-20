package questions.chapter14.questions.q14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q14 {
    /*

    14. What is the output of the following code? (Choose three.)
22: var p1 = Path.of("/zoo/./bear","../food.txt");
23: p1.normalize().relativize(Path.of("/lion"));
24: System.out.println(p1);
25:
26: var p2 = Paths.get("/zoo/animals/bear/koala/food.txt");
27: System.out.println(p2.subpath(1,3).getName(1));
28:
29: var p3 = Path.of("/pets/../cat.txt");
30: var p4 = Paths.get("./dog.txt");
31: System.out.println(p4.resolve(p3));

A. ../../lion
++B. /zoo/./bear/../food.txt
C. animal
++D. bear
++E. /pets/../cat.txt
F. /pets/../cat.txt/./dog.txt

     */

    public static void main(String[] args) {
        var p1 = Path.of("/zoo/./bear","../food.txt");
        p1.normalize().relativize(Path.of("/lion")); //immutable oldugu için ignore edilir
        System.out.println(p1);

        var p2 = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(p2.subpath(1,3).getName(1));

         var p3 = Path.of("/pets/../cat.txt");
         var p4 = Paths.get("./dog.txt");
         System.out.println(p4.resolve(p3));
    }
}
