package questions.chapter13.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadScheduleExample5 {

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
        ScheduledFuture<?> r1=service.scheduleAtFixedRate(task1, 2, 6, TimeUnit.SECONDS);

        /**onceki taskın baslama süresinden sonra 6 sn bekler ve 6 sn sonra dgerini baslatır taskın bitmesini beklemz
         * bundan dolayı her task arasında 6sn fark olur*/
    }
}
