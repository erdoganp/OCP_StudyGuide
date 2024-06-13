package questions.chapter13.introducingThreads;

public class MyRunnable  implements Runnable{


    private final String parameter;

    public MyRunnable(String parameter){
        this.parameter=parameter;

    }

    @Override
    public void run() {
        System.out.println("Important job running in MyRunnable : "  + parameter);
    }
}
