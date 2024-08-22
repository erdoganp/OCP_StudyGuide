package questions.chapter13.increasing_concurrency_with_pool;

import java.time.LocalTime;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPoolExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(5);

        Runnable task1= () ->{
            System.out.println("Executing the task, Thread#name " +Thread.currentThread().getName() +", " + LocalTime.now());
        };
        Runnable task2= () ->{
            System.out.println("Executing the task, Thread#name " +Thread.currentThread().getName() +", " + LocalTime.now());
        };
        Runnable task3= () ->{
            System.out.println("Executing the task, Thread#name " +Thread.currentThread().getName() +", " + LocalTime.now());
        };


        scheduledExecutorService.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(task2, 0, 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(task3, 0, 2, TimeUnit.SECONDS);

        System.out.println("Thread main finishedeeee");

    }
}
