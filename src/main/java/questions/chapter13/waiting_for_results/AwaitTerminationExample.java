package questions.chapter13.waiting_for_results;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable printInventory=() -> System.out.println("printing zoo inventory");
        Runnable printRecords=() ->{

            for(int i=0;i < 3; i++){
                System.out.println("Printing record : " +i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        }
        finally {
            service.shutdown();
        }

        boolean awaitTerminationResult= service.awaitTermination(1, TimeUnit.MINUTES);

        if(awaitTerminationResult )
            System.out.println("Finished");
        else
            System.out.println("at least one task still running");
    }
}
