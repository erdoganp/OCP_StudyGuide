package questions.chapter14.questions.q02;

import java.io.File;

public class Q02 {

    /*


    2. Assuming that / is the root directory within the file system, which of the following are true
statements? (Choose all that apply.)
++A. /home/parrot is an absolute path.//eger root directory ile baslıyorsa absoulte path dir
B. /home/parrot is a directory. //garantisi yok
C. /home/parrot is a relative path. //yanlıs
D. new File("/home") will throw an exception if /home does not exist.//hayır burada obje yaratilır sadece
E. new File("/home").delete() will throw an exception if /home does not exist.//yanlıs boolean deger doner
++F. A Reader offers character encoding, making it more useful when working with String
data than an InputStream.
G. A Reader offers multithreading support, making it more useful than an InputStream//yanlıs bunlar farklı yapılardır

    */

    public static void main(String[] args) {
            File file =new File("missing-path");
            new File("missing-path").delete();

    }
}
