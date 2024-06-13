package questions.chapter13.introducingThreads;

public class CreatingAThreadExample {
    public static void main(String[] args) {

        new Thread(() -> System.out.print("hello")).start();
        System.out.print("world");
    }
}
