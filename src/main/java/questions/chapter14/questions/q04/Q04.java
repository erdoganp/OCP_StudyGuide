package questions.chapter14.questions.q04;

public class Q04 {
    /*

    4. For which values of path sent to this method would it be possible for the following code to
output Success? (Choose all that apply.)
public void removeBadFile(Path path) {
if(Files.isDirectory(path))
System.out.println(Files.deleteIfExists(path)
? "Success": "Try Again");
}
A. path refers to a regular file in the file system.
B. path refers to a symbolic link in the file system.
C. path refers to an empty directory in the file system.
D. path refers to a directory with content in the file system.
E. path does not refer to a record that exists within the file system.
++F. The code does not compile.

     */
  /**
   * deleteIfExists methodu checked exception fırlatır bundan dolayı handle or declare edilmesi gerekir
   * soruda ikiside yapılmadıgı için compile error verir
   * */

}
