package questions.chapter13.introducingThreads;

public class ForLoopRunnableExample {

    public static void main(String[] args) {
        ForLoopRunnable runnable1=new ForLoopRunnable();

        Thread thread1=new Thread(runnable1 , "first thread");
        Thread thread2=new Thread(runnable1 , "second thread");

        thread1.start();
        thread2.start();
    }
}
