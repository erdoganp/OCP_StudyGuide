package questions.chapter13.waiting_for_results;

import java.util.concurrent.*;

public class CheckResults {

    private static int counter= 0 ;

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        try{
            Future<?> result=service.submit(()->{
               for(int i=0; i< 1_000_000; i++) counter ++;

            });

            Object resultRefrence =result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
            System.out.println(resultRefrence);

        }catch (TimeoutException | ExecutionException | InterruptedException e){
            System.out.println("Not Reached in time");

        }finally {
            service.shutdown();
        }

    }
}
