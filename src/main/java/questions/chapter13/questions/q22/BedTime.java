package questions.chapter13.questions.q22;



import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class BedTime {
/*

22. Assuming one minute is enough time for the tasks submitted to the service executor to
complete, what is the result of executing countSheep()? (Choose all that apply.)
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class BedTime {
private AtomicInteger s1 = new AtomicInteger(0); // w1
private int s2 = 0;
private void countSheep() throws InterruptedException {
var service = Executors.newSingleThreadExecutor(); // w2
try {
for (int i = 0; i < 100; i++)
service.execute(() ->
{
s1.getAndIncrement(); s2++; }); // w3
Thread.sleep(60*1000);
System.out.println(s1 + " " + s2);
} finally { service.shutdown(); }
}
public static void main(String... nap) throws InterruptedException {
new BedTime().countSheep();
} }
A. The method consistently prints 100 99.
++B. The method consistently prints 100 100.
C. The output cannot be determined ahead of time.
D. The code will not compile because of line w1.
E. The code will not compile because of line w2.
F. The code will not compile because of line w3.
G. It compiles but throws an exception at runtime.

 */
    private AtomicInteger s1= new AtomicInteger(0);

    private int s2=0;

    private void countSheep() throws InterruptedException{

        var service = Executors.newSingleThreadExecutor();
        /**singleThread oldugu için s2 ++ degerinde de memory consistency olmayacak ve 100 yazacak
         * zaten getAndIncrement methoduda thread safe*/

        try {
            for(int i=0; i<100; i++){
                service.execute(() ->{
                    s1.getAndIncrement();
                    s2 ++;
                });
            }

            Thread.sleep(2000);
            System.out.println(s1 + " " + s2) ;
        }finally {
            service.shutdown();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new BedTime().countSheep();
    }
}
