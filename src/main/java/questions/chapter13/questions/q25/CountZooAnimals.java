package questions.chapter13.questions.q25;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CountZooAnimals {
    /*

    25. Assuming an implementation of the performCount() method is provided prior to runtime,
which of the following are possible results of executing the following application? (Choose
all that apply.)
import java.util.*;
import java.util.concurrent.*;
public class CountZooAnimals {
public static void performCount(int animal) {
// IMPLEMENTATION OMITTED
}
public static void printResults(Future<?> f) {
try {
System.out.println(f.get(1, TimeUnit.DAYS)); // o1
} catch (Exception e) {
System.out.println("Exception!");
}
}
public static void main(String[] args) throws Exception {
final var r = new ArrayList<Future<?>>();
ExecutorService s = Executors.newSingleThreadExecutor();
try {
for(int i = 0; i < 10; i++) {
final int animal = i;
r.add(s.submit(() ->
performCount(animal))); // o2
}
r.forEach(f ->
printResults(f));
} finally { s.shutdown(); }
} }
A. It outputs a number 10 times.
B. It outputs a Boolean value 10 times.
C. It
A. It outputs a number 10 times.
B. It outputs a Boolean value 10 times.
++C. It outputs a null value 10 times.
++D. It outputs Exception! 10 times.
E. It hangs indefinitely at runtime.
F. The code will not compile because of line o1.
G. The code will not compile because of line o2.
     */

    public static void performCount(int animal){

    }

    public static void printResult(Future<?> f){
        try{
            System.out.println(f.get(1, TimeUnit.DAYS));
        }catch (Exception e){
            System.out.println("Exception");
        }

    }

    public static void main(String[] args) {
        final var r=new ArrayList<Future<?>>();

        ExecutorService s=Executors.newSingleThreadExecutor();

        try {
            for (int i=0; i<10 ; i++){
                final int animal =i;
                r.add(s.submit(() ->performCount(animal)));
            }
            r.forEach(f->printResult(f));
        }finally {
            s.shutdown();
        }
    }
}
