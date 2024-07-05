package questions.chapter13.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.*;

public class ThreadScheduleExample3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Callable<String> task1=()->
        {
            LocalTime now = LocalTime.now();
            System.out.println("Task time " +now);
            return "Hello message" ;
        };

        LocalTime now = LocalTime.now();
        System.out.println("Before schedule " +now);
        ScheduledFuture<String> r1=service.schedule(task1, 5, TimeUnit.SECONDS);
        System.out.println(r1.get());

        service.shutdown();
    }
}
