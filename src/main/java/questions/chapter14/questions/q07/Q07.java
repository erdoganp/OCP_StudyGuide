package questions.chapter14.questions.q07;

public class Q07 {
    /*

7. Assume that /kang exists as a symbolic link to the directory /mammal/kangaroo within
the file system. Which of the following statements are correct about this code snippet?
(Choose all that apply.)
var path = Paths.get("/kang");
if(Files.isDirectory(path) && Files.isSymbolicLink(path))
Files.createDirectory(path.resolve("joey"));
A. A new directory will always be created.
++B. A new directory may be created.
++C. If the code creates a directory, it will be reachable at /kang/joey.
D. If the code creates a directory, it will be reachable at /mammal/joey.
E. The code does not compile.
F. The code will compile but will always throw an exception at runtime.

     */
}
