package questions.chapter13.waiting_for_results;

import java.util.concurrent.*;

public class CallableFutureCancelExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Callable<String> callableMessage=()->{
            Thread.sleep(1000);
            return "Callable Message";
        };

        Future<String> stringFuture=executorService.submit(callableMessage);
        int count=0;
        while (!stringFuture.isDone()){
            System.out.println("Task is still not done!!");
            Thread.sleep(200);
            count ++;

            if(count > 10){
                System.out.println("Cancelling ....");
                stringFuture.cancel(true);
            }
        }

        if(!stringFuture .isCancelled()){
            System.out.println("Task completed ..Retrieving the result");
            String result=stringFuture.get();
            System.out.println(result);
        }else {
            System.out.println("task is canceled");
        }


    }
}
