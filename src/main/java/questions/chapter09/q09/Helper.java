package questions.chapter09.q09;

import java.io.FileNotFoundException;
/*

Which of these statements can fill in the blank so that the Helper class compiles successfully?
(Choose all that apply.)
2: public class Helper {
3: public static <U extends Exception>
4: void printException(U u) {
5:
6: System.out.println(u.getMessage());
7: }
8: public static void main(String[] args) {
9: Helper. ;
10: } }
++A. printException(new FileNotFoundException("A"))
++B. printException(new Exception("B"))
C. <Throwable>printException(new Exception("C"))//Throwable Exceptionın parenti oldugu için gecerli değil
++D. <NullPointerException>printException(new NullPointerException("D"))
E. printException(new Throwable("E")) ////Throwable Exceptionın parenti oldugu için gecerli değil
 */

public class Helper {
    public static <U extends Exception> void printException(U u){
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A"));
        Helper.printException(new Exception("B"));
        //<Throwable> printException(new Exception("C")); //Throwable Exceptionın parenti oldugu için gecerli değil
        Helper.<NullPointerException>printException(new NullPointerException("D"));
        //printException(new Throwable("E")); ////Throwable Exceptionın parenti oldugu için gecerli değil
    }
}
