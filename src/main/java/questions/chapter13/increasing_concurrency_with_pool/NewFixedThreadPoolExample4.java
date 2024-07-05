package questions.chapter13.increasing_concurrency_with_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NewFixedThreadPoolExample4 {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(2);

        ThreadPoolExecutor pool=(ThreadPoolExecutor)executor;

        System.out.println("###Stats before tasks execution###");

        printThreadPoolExecutorDetails(pool);

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        System.out.println("###Stats after task execution ##");
        printThreadPoolExecutorDetails(pool);

        executor.shutdown();

    }


    private static void printThreadPoolExecutorDetails(ThreadPoolExecutor pool){
        System.out.println("Largest execution : " +
                pool.getLargestPoolSize());


        System.out.println("Maximum allow thread" +
                pool.getMaximumPoolSize());

        System.out.println("Current thread in pool" +
                pool.getPoolSize());

        System.out.println("Current execution thrad" +
                pool.getActiveCount());

        System.out.println("Total number of count " +
                pool.getTaskCount());

    }


    static class Task implements Runnable{

        public void run(){
                try{
                    System.out.println("Running task !Thread name: " +
                            Thread.currentThread().getName());
                    Thread.sleep(500);
                    System.out.println("Task completed, Thread Name : " +
                            Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();

                }
        }

    }

}


