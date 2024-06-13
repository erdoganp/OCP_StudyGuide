package questions.chapter13.distinguishing_thread_types;

public class Zoo {

    public static void pause(){

        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){

        }
        System.out.println("Thread finishing");

    }


    public static void main(String[] args) {


        var job= new Thread(()->pause(),"thread-1");

        //job.setDaemon(true);
        job.start();
        System.out.println(job.getName());
        System.out.println("main method finished");

    }
}
