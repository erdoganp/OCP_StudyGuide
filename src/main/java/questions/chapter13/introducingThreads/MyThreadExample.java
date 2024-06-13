package questions.chapter13.introducingThreads;

public class MyThreadExample {

    public static void main(String[] args) {
        MyThread myThread1=new MyThread("parameter-1");
        MyThread myThread2=new MyThread("parameter-2");
        MyThread myThread3=new MyThread("parameter-3");
        MyThread myThread4=new MyThread("parameter-4");
        MyThread myThread5=new MyThread("parameter-5");


        Thread thread1=new Thread(myThread1);
        Thread thread2=new Thread(myThread2);
        Thread thread3=new Thread(myThread3);
        Thread thread4=new Thread(myThread4);
        Thread thread5=new Thread(myThread5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


        /**eger run kullanırsak sırayla olur*/
//        thread1.run();
//        thread2.run();
//        thread3.run();
//        thread4.run();
//        thread5.run();
    }
}
