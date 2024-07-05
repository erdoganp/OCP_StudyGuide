package questions.chapter13.waiting_for_results;

import java.util.concurrent.*;

public class CallableExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var service= Executors.newSingleThreadExecutor();
        Future<Integer> result=null;
        try{
            result=service.submit(()->
           {
              Thread.sleep(2000);
              return 10;
           });

            System.out.println(result.get(1, TimeUnit.SECONDS));
        }catch (TimeoutException e){
            e.printStackTrace();
            System.out.println(result.isDone());
            System.out.println(result.isCancelled());
        }finally {
            service.shutdown();
        }
    }
}
