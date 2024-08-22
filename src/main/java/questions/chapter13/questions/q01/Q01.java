package questions.chapter13.questions.q01;

import java.util.ArrayList;

public class Q01 {

    /*
    1. Given the following code snippet, which options correctly create a parallel stream? (Choose
all that apply.)
var c = new ArrayList<Thread>();
var s = c.stream();
var p = ;
A. new ParallelStream(s)
B. c.parallel()
++C. s.parallelStream() //collection üzerindende olusturabildiğimiz için c.parallelStream diyebiliyoruz
D. c.parallelStream()
E. new ParallelStream(c)
++F. s.parallel()   //stream üzerinden olusturdugumuz için s.parallel diyoruz


     */

    public static void main(String[] args) {
        var c=new ArrayList<Thread>();
        var s=c.stream();
        var p =s.parallel();
        var p2=c.parallelStream();


    }
}
