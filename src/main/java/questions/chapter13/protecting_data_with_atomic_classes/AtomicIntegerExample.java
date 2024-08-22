package questions.chapter13.protecting_data_with_atomic_classes;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {

        AtomicInteger atomicInteger  = new AtomicInteger(100);
        System.out.println("get :" +  atomicInteger.get());
        System.out.println("getAndIncerement :"  + atomicInteger.getAndIncrement());//post-increment
        System.out.println("IncrementAndGet :"  + atomicInteger.incrementAndGet()); //pre-increment
        System.out.println("addAndGet : " + atomicInteger.addAndGet(500));

        atomicInteger.set(200);
        System.out.println("after set : " + atomicInteger);

        int oldValue=atomicInteger.getAndSet(300);
        System.out.println("getAndSet oldValue :" + oldValue);

        System.out.println("getAndDecrement :" + atomicInteger.getAndDecrement() );//post-decrement
        System.out.println("decrementAndGet :" + atomicInteger.decrementAndGet()); //pre-decrement
    }
}
