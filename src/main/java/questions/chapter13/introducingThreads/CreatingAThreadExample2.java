package questions.chapter13.introducingThreads;

public class CreatingAThreadExample2 {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.print("Hello " + Thread.currentThread().getName() + "#")
        ).start();

        System.out.print("World " + Thread.currentThread().getName() + "#");
    }

}

