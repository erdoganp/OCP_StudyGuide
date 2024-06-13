package questions.chapter13.introducingThreads;

/**
 * Kurallar
 * 1)run methodu kullandıgımızda yeni thread olusturmaz tek bir threa üzerinden senkron ilerler yani sırayla
 * 2)start methodunu kullandıgımızda herbiri için yeni bir thread olusur ve asenkron ilerler yani paralel olarak calısır.
 * 3)More generally, we can create a Thread and its associated task one of two ways in Java:
 * ■■ Provide a Runnable object or lambda expression to the Thread constructor.
 * ■■ Create a class that extends Thread and overrides the run() method.
 * */

public class CreatingAThreadExample4 {
    public static void main(String[] args) {
        Runnable printInventory =()  -> System.out.println("Printing zoo inventory");
        Runnable printRecords =() ->{
            for(int i=0; i<3; i++){
                System.out.println("Printing record: " + i);
            }
        };


        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");


    }
}
