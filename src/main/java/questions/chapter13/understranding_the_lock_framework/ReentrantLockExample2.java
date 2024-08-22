package questions.chapter13.understranding_the_lock_framework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {

    public static void main(String[] args) {


         Lock lock =new ReentrantLock();
         lock.unlock(); // illegalMonitorStateExceptşon
    }
}
