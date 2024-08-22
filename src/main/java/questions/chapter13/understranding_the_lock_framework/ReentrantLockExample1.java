package questions.chapter13.understranding_the_lock_framework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample1 {

    public static void main(String[] args) {

        //Implementation #1 with a synchronized block
        Object object = new Object();
        synchronized ( object){
            //protected code
        }


        //Implementation #2 with lock
        Lock lock =new ReentrantLock();
        try {
            lock.lock();
            //protected code
        }finally {
            lock.unlock();
        }

    }
}
