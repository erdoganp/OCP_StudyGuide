package questions.chapter13.distinguishing_thread_types;

public class TestDaemonThread1 extends Thread{

    //thread sınıfını extend ettiğimiz için run methodunu override etmemiz gerekiyor

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }else {
            System.out.println("user thread work");
        }

    }

    public static void main(String[] args) {
        var job=new Thread(()-> System.out.println("deememe"));


        TestDaemonThread1 t1=new TestDaemonThread1();
        TestDaemonThread1 t2=new TestDaemonThread1();
        TestDaemonThread1 t3=new TestDaemonThread1();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
