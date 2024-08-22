package questions.chapter13.questions.q04;

import java.util.concurrent.*;

public class Q04 {

    /*

    4. Which lines need to be changed to make the code compile? (Choose all that apply.)
ExecutorService service = // w1
Executors.newSingleThreadScheduledExecutor();
service.scheduleWithFixedDelay(() ->
{
System.out.println("Open Zoo");
return null; // w2
}, 0, 1, TimeUnit.MINUTES);
var result = service.submit(() ->
// w3
System.out.println("Wake Staff"));
System.out.println(result.get()); // w4
A. It compiles and runs without issue.
++B. Line w1
++C. Line w2
D. Line w3
E. Line w4
F. It compiles but throws an exception at runtime.


     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
/**
 * Buradaki birinci problem scheduleWithFixedDelay methodunun ExecutorService objesi üzerinde cagrılması
 * burada ScheduleExecutorService kullanılması gerekiyor.
 * İkinci problem ise scheduleWithFixedDelay methodunun callable ile kullanılması burada runnable kullanılması gereiyor
 * */
        ExecutorService service= Executors.newSingleThreadScheduledExecutor();//w1
        /*
        service.scheduleWithFixedDelay(()->{
            System.out.println("Open Zoo");
                    return  null;//w2
             },0 , 1, TimeUnit.MINUTES);
*/
        var result=service.submit(() ->
                System.out.println("Wake Staff"));
        System.out.println(result.get());

    }

     static void fixed() throws ExecutionException, InterruptedException {


         ScheduledExecutorService service =Executors.newSingleThreadScheduledExecutor();
         service.scheduleWithFixedDelay(() ->{
             System.out.println("Open zoo" );
             }, 0, 1, TimeUnit.MINUTES);


         var result =service.submit(() -> System.out.println("Wake staff"));

         System.out.println(result.get());


     }
}
