package questions.chapter13.managing_a_thread_life_cycle;

public class ThreadStateExample1 {

    public static void main(String[] args) {
        Thread currentMainThread=Thread.currentThread();

        System.out.println("## CurrentMainThread ###");
        System.out.println(currentMainThread.getState());
        System.out.println(currentMainThread.isAlive());


        Thread thread = new Thread(() -> System.out.println("Hello world"));
        System.out.println("## before thread.start() ##");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());

        thread.start();

        System.out.println("## after thread.start() ## ");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());

     }
}
