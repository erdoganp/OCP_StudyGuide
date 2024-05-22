package questions.chapter11.q10;

public class Q190 {

    /*

    10. Which scenario is the best use of an exception?
A. An element is not found when searching a list.
++B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don’t know how to code a method.

     */

    public void setAge(int age){ //Runtime exception verdiği için  throws ile işaretlememize gerek yok

        if(age < 0){

            throw new IllegalArgumentException();
        }
    }
}
