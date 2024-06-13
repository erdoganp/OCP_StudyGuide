package questions.chapter13.introducingThreads;

public class ForLoopRunnable implements Runnable{
    @Override
    public void run() {
        for(int x=1 ; x<10 ; x++){
            System.out.println("Runnable running "+ Thread.currentThread().getName() + " x : " + x) ;

        }
    }
}
