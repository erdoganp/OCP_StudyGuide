package questions.chapter11.q13;

public class Q13 {

    /*


    13. Which of the following are true statements about exception handling in Java? (Choose all
that apply.)
++A. A traditional try statement without a catch block requires a finally block.
++B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources
statement without a catch block requires a finally block.
E. A try-with-resources
statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.




     */

    public static void main(String[] args) {


    }



    void optionA(){

        try{

        }catch (IllegalArgumentException e){

        }
    }

    void optionB(){
        try{

        }finally {

        }
    }
}