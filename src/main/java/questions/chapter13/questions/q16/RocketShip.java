package questions.chapter13.questions.q16;

import java.util.ArrayList;

public class RocketShip {
    /*
    16. Assuming one minute is enough time for all the threads within this program to complete,
what are the possible results of executing the following program? (Choose all that apply.)
public class RocketShip {
private volatile int fuel;
private void launch(int checks) {
var p = new ArrayList<Thread>();
for (int i = 0; i < checks; i++)
p.add(new Thread(() ->
fuel++));
p.forEach(Thread::interrupt);
p.forEach(Thread::start);
p.forEach(Thread::interrupt);
}
public static void main(String[] args) throws Exception {
var ship = new RocketShip();
ship.launch(100);
Thread.sleep(60*1000);
System.out.print(ship.fuel);
} }
++A. It prints a number less than 100.
++B. It prints 100.
C. It prints a number greater than 100.
D. It does not compile.
E. It compiles but throws an InterruptedException at runtime.

     */

    private volatile int fuel;

    private void launch(int checks){

        var p= new ArrayList<Thread>();

        for(int i=0; i<checks ; i++)
            p.add(new Thread(() ->fuel++));

        p.forEach(Thread::interrupt);
        p.forEach(Thread::start);
        p.forEach(Thread::interrupt);
    }

    public static void main(String[] args) throws Exception {
        var ship =new RocketShip();

        ship.launch(100);
       /// Thread.sleep(60*1000);
        System.out.println(ship.fuel);

        /**
         * burada volatile keywordu thread safe saglamaz memory consistency saglar
         * fuel da post increment thread safe saglamadıgı için her calıstırıldıgnda farklı sonuc verir
         * */
    }
}
