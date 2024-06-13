package questions.chapter13.polling_with_sleep;

public class CheckResultsWithSleep {

    private static int counter =0;

    public static void main(String[] args) {

        new Thread(() ->{
            for(int i=0;i < 1_000_000; i++) counter ++;

        }).start();

        while (counter < 1_000_000){
            System.out.println("not reached yet");

        try{
            Thread.sleep(1_000);

        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        }

        System.out.println("Reached : " + counter);

    }
}
