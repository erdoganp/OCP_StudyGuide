package questions.chapter11.q01;

import java.io.IOException;

public class Q01 {
    /*

    1. Which of the following can be inserted on line 8 to make this code compile? (Choose all
that apply.)
7: public void whatHappensNext() throws IOException {
8: // INSERT CODE HERE
9: }
++A. System.out.println("it's ok");
B. throw new Exception();
++C. throw new IllegalArgumentException();
++D. throw new java.io.IOException();
++E. throw new RuntimeException();
F. None of the above

     */


    public void whatHappensNext() throws IOException{

        System.out.println("ıt is ok");
    }


    public void whatHappensNext2() throws IOException{

      // throw new Exception();
    }


    public void whatHappensNext3() throws IOException{

        throw  new IllegalArgumentException();
    }


    public void whatHappensNext4() throws IOException{

       throw new java.io.IOException();
    }


    public void whatHappensNext5() throws IOException{

        throw new RuntimeException();
    }
}
