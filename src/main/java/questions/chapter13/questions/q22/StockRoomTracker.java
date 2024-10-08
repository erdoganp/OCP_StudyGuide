package questions.chapter13.questions.q22;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class StockRoomTracker {
    /*
    23. What is the result of executing the following application? (Choose all that apply.)
import java.util.concurrent.*;
import java.util.stream.*;
public class StockRoomTracker {
public static void await(CyclicBarrier cb) { // j1
try { cb.await(); } catch (Exception e) {}
}
public static void main(String[] args) {
var cb = new CyclicBarrier(10,
() ->
System.out.println("Stock Room Full!")); // j2
IntStream.iterate(1, i ->
1).limit(9).parallel()
.forEach(i ->
await(cb)); // j3
} }
A. It outputs Stock Room Full!
B. The code will not compile because of line j1.
C. The code will not compile because of line j2.
D. The code will not compile because of line j3.
E. It compiles but throws an exception at runtime.
++F. It compiles but waits forever at runtime.
     */

    public static void await(CyclicBarrier cb){
        try {
            cb.await();
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        var cb=new CyclicBarrier(10,
                ()-> System.out.println("Stock room full !"));

        IntStream.iterate(1, i->1).limit(9).parallel() //max size 9 oldugu için progran takılı kalır
                .forEach(i->await(cb));
    }
}
