package questions.chapter14.questions.q18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q18 {

    /*
    18. Assume that reader is a valid stream whose next characters are PEACOCKS. What is true
about the output of the following code snippet? (Choose all that apply.)
var sb = new StringBuilder();
sb.append((char)reader.read());
reader.mark(10);
for(int i=0; i<2; i++) {
sb.append((char)reader.read());
reader.skip(2);
}
reader.reset();
reader.skip(0);

sb.append((char)reader.read());
System.out.println(sb.toString());
A. The code may print PEAE.
++B. The code may print PEOA.
C. The code may print PEOE.
D. The code may print PEOS.
E. The code will always print PEAE.
F. The code will always print PEOA.
G. The code will always print PEOE.
H. The code will always print PEOS.
     */

    public static void main(String[] args) throws IOException {

        BufferedInputStream reader=new BufferedInputStream(new FileInputStream("extras/chapter14/peacok.txt"));

        var sb=new StringBuilder();
        sb.append((char) reader.read());
        reader.mark(10);
        for (int i=0; i<2 ; i++){
            sb.append((char) reader.read());
            reader.skip(2);
        }

        reader.reset();
        reader.skip(0);

        sb.append((char) reader.read());

        System.out.println(sb.toString());

    }
}
