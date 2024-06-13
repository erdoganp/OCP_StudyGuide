package questions.chapter13.introducingThreads;

public class MyThread extends Thread{

    private final String parameter;

    public MyThread(String parameter){
        this.parameter=parameter;
    }

    @Override
    public void run(){
        System.out.println("Importantjob running in MyThread : " + parameter);
    }


}
