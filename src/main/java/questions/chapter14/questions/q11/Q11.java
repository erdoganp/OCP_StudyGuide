package questions.chapter14.questions.q11;

import java.io.*;

public class Q11 {

    /*
    11. Which classes will allow the following to compile? (Choose all that apply.)
var is = new BufferedInputStream(new FileInputStream("z.txt"));
InputStream wrapper = new _________________(is);
try (wrapper) {}
++A. BufferedInputStream
B. BufferedReader
C. BufferedWriter
D. FileInputStream
E. ObjectInputStream
F. ObjectOutputStream
G. None of the above, as the first line does not compile

     */
    void method() throws IOException{
        var is =new BufferedInputStream(new FileInputStream("z.txt"));
        InputStream wrapper=new BufferedInputStream(is);
        try (wrapper){

        }
    }


    void method2() throws IOException{

        var is=new BufferedInputStream(new FileInputStream("z.txt"));
        InputStream wrapper=new ObjectInputStream(is);
        try(wrapper){

        }
    }
}
