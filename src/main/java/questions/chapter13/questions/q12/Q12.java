package questions.chapter13.questions.q12;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q12 {

    /*

    12. Assuming each call to takeNap() takes five seconds to execute without throwing an exception,
what is the expected result of executing the following code snippet?
ExecutorService service = Executors.newFixedThreadPool(4);
try {
service.execute(() ->takeNap());
service.execute(() ->takeNap());
service.execute(() ->takeNap());
} finally {
service.shutdown();
}
service.awaitTermination(2, TimeUnit.SECONDS);
System.out.println("DONE!");
A. It will immediately print DONE!.
++B. It will pause for 2 seconds and then print DONE!.
C. It will pause for 5 seconds and then print DONE!.
D. It will pause for 15 seconds and then print DONE!.
E. It will throw an exception at runtime.
F. None of the above, as the code does not compile.

     */


    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);

        LocalDateTime time1 = LocalDateTime.now();

        try {
            service.execute(() ->takeNap());
            service.execute(() ->takeNap());
            service.execute(() ->takeNap());
        }finally {
            service.shutdown();
        }

        service.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println("DONE");
        LocalDateTime time2=LocalDateTime.now();

        int time3=time2.getSecond() - time1.getSecond();
        System.out.println(time3);


    }

    private static void takeNap(){

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
