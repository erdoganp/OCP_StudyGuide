package questions.chapter13.waiting_for_results;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        var service = Executors.newSingleThreadExecutor();

        try{
            Future<Integer> results=service.submit(() ->30 +11 );
            System.out.println(results.get());
            System.out.println(results.isDone());
            System.out.println(results.isCancelled());
            service.shutdown();
        }finally {
            service.shutdown();
        }


    }
}
