package questions.chapter13.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadScheduleExample4 {

    static  int counter =0;

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1= ()->{

            LocalTime now=LocalTime.now();
            System.out.println("Task time :" +now);
            System.out.println("Counter " + ++counter);
        };

        LocalTime now=LocalTime.now();
        System.out.println("Before schedule " + now);
        ScheduledFuture<?> r1=service.scheduleAtFixedRate(task1, 3, 5, TimeUnit.SECONDS);
    }
}
