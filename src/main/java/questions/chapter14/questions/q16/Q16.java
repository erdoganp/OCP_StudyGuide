package questions.chapter14.questions.q16;

import java.io.*;

public class Q16 {

    /*

    16. Assuming zoo-data.
txt exists and is not empty, what statements about the following
method are correct? (Choose all that apply.)
private void echo() throws IOException {
var o = new FileWriter("new-zoo.
txt");
try (var f = new FileReader("zoo-data.
txt");
var b = new BufferedReader(f); o) {
o.write(b.readLine());o
}
o.write("");
}
++A. When run, the method creates a new file with one line of text in it.
B. When run, the method creates a new file with two lines of text in it.
C. When run, the method creates a new file with the same number of lines as the originalfile.
+++D. The method compiles but will produce an exception at runtime.
E. The method does not compile.
F. The method uses byte stream classes.

     */

    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("zoo-data.txt");
        pw.println("line1");
        pw.println("line2");
        pw.println("line3");
        pw.println("line4");

        pw.close();
        echo();

    }

    private static void echo() throws IOException{

        var o =new FileWriter("new-zoo.txt");
        try(var f=new FileReader("zoo-data.txt");
        var b=new BufferedReader(f); o){
            o.write(b.readLine());
        }

        o.write("");
    }
}
