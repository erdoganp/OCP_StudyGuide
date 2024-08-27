package questions.chapter13.questions.q20;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class PrintCounter {
    /*
    20. What is the result of executing the following program? (Choose all that apply.)
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class PrintCounter {
static int count = 0;
public static void main(String[] args) throws InterruptedException, ExecutionException {
var service = Executors.newSingleThreadExecutor();
try {
var r = new ArrayList<Future<?>>();
IntStream.iterate(0,i ->
i+1).limit(5).forEach(
i ->
r.add(service.execute(() ->
{count++;})) // n1
);
for(Future<?> result : r) {
System.out.print(result.get()+" "); // n2
}
} finally { service.shutdown(); }
} }
A. It prints 0 1 2 3 4
B. It prints 1 2 3 4 5
C. It prints null null null null null
D. It hangs indefinitely at runtime.
E. The output cannot be determined.
++F. The code will not compile because of line n1.
G. The code will not compile because of line n2.


     */

    static int count= 0 ;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var service = Executors.newSingleThreadExecutor();
        try{
            /**execute methodu void oldugu için future tpinde deger donmez ama r future tipnde degerleri alıyor*/
            var r= new ArrayList<Future<?>>();
//            IntStream.iterate(0, i->i +1).limit(5).forEach(
//                    i->r.add(service.execute(() ->{
//                        count ++;
//                    }))
//            );
            for (Future <?> result : r){
                System.out.println(result.get()  + " ");
            }

        }finally {
            service.shutdown();
        }
    }
}
