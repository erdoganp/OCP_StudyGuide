package questions.chapter13.scheduling_tasks;

import java.util.concurrent.*;

public class ThreadScheduleExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
        Runnable task1=() -> System.out.println("Hello Zooo");

        Callable<String> task2=() ->"Monkey";
        ScheduledFuture<?> r1=service.schedule(task1,2, TimeUnit.SECONDS);
        ScheduledFuture<?> r2=service.schedule(task2, 4, TimeUnit.SECONDS);

        System.out.println(r1.get());
        System.out.println(r2.get());

    }
}
