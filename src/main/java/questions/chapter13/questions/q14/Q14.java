package questions.chapter13.questions.q14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Q14 {

    /*

    A. The code will always output Tortoise followed by Hare.
B. The code will always output Hare followed by Tortoise.
++C. If the code does output anything, the order cannot be determined.
D. The code does not compile.
++E. The code compiles but may produce a deadlock at runtime.
F. The code compiles but may produce a livelock at runtime.
G. It compiles but throws an exception at runtime.

     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Object o1 = new Object();
        Object o2=new Object();

        var service = Executors.newFixedThreadPool(2);

        var f1 =service.submit(() ->{
            synchronized (o1){
                synchronized (o2){
                    System.out.println("Tortoise");
                }
            }
        });

        var f2= service.submit(() ->{
            synchronized (o2){
                synchronized (o1){
                    System.out.println("hare");
                }
            }
        });

        f1.get();
        f2.get();
    }
}
