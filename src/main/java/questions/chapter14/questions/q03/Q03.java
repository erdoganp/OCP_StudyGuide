package questions.chapter14.questions.q03;

import java.io.IOException;
import java.io.Writer;

public class Q03 {

    /*

    3. What are possible results of executing the following code? (Choose all that apply.)
public static void main(String[] args) throws IOException {
String line;
var c = System.console();
Writer w = c.writer();
try (w) {
if ((line = c.readLine("Enter your name: ")) != null)
w.append(line);
w.flush();
}
}
A. The code runs, but nothing is printed.
++B. The code prints what was entered by the user.
C. The code behaves the same if throws IOException is removed.
++D. A NullPointerException may be thrown.
E. A NullPointerException will always be thrown.
F. A NullPointerException will never be thrown.
G. The code does not compile

     */

    public static void main(String[] args) throws IOException {

        String line;
        var c=System.console();
        Writer w=c.writer();

        try(w){
            if ((line =c.readLine("Enter your name")) !=null)
                w.append(line);

            w.flush();
        }

    }
}
