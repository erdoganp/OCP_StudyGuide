package questions.chapter13.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadScheduleExample6 {
    /**schedulewithfixeddelay onceki taskın tamamlanmasından sonra delay e baslar
     * scheduleatfixeddelay de ise onceki taskın bitmesini beklemeden direk baslar.*/
    static  int counter =0;

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1= ()->{

            LocalTime now=LocalTime.now();
            System.out.println("Task time :" +now);
            System.out.println("Counter " + ++counter);

            try{
                Thread.sleep(4000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        };

        LocalTime now=LocalTime.now();
        System.out.println("Before schedule " + now);
        ScheduledFuture<?> r1=service.scheduleWithFixedDelay(task1, 2, 6, TimeUnit.SECONDS);

        /**onceki task 4 saniyede bittiği için 4 saniyeden sonra 6 saniye bekler ve diğer task ile arasında 10sn olmus olur*/
    }

}
