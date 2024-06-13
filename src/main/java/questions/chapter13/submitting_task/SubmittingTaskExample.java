package questions.chapter13.submitting_task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmittingTaskExample {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello -message-Task");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try{

            executorService.execute(task);
            executorService.submit(task);
            executorService.submit(new MyRunnable());
        }finally {
            executorService.shutdown();
        }

    }


    static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("My Runnable#run invoked");
        }
    }
}


