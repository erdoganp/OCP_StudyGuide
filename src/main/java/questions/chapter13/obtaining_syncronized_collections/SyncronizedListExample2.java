package questions.chapter13.obtaining_syncronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncronizedListExample2 {

    private static final Object LOCK=new Object();

    public static void main(String[] args) throws InterruptedException {

        List<Integer> original =new ArrayList<>();

        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        List<Integer> syncronizedList = Collections.synchronizedList(original);
        List<Integer> nonSyncronizedList=new ArrayList<>(original);
        List<Integer> nonSyncronizedListWithObjectLock=new ArrayList<>(original);
        List<Integer> nonSyncronizedListWithReentrantLock=new ArrayList<>(original);


        ExecutorService executorService = Executors.newCachedThreadPool();

        ReentrantLock reentrantLock = new ReentrantLock();

        for(int i=0; i<1000; i++){

            executorService.submit(() ->syncronizedList.add(new Random().nextInt()));
            executorService.submit(() ->nonSyncronizedList.add(new Random().nextInt()));

            executorService.submit(()->{
                synchronized (LOCK){
                    nonSyncronizedListWithObjectLock.add(new Random().nextInt());
                }
            }
            );

            executorService.submit(()->
                    {
                        try{
                            reentrantLock.lock();
                            nonSyncronizedListWithReentrantLock.add(new Random().nextInt());
                        }finally {
                            reentrantLock.unlock();
                        }
                    }
            );
        }

        executorService.shutdown();

        boolean result =executorService.awaitTermination(1, TimeUnit.MINUTES);

        if(result){
            System.out.println(syncronizedList.size());
            System.out.println(nonSyncronizedList.size());
            System.out.println(nonSyncronizedListWithObjectLock.size());
            System.out.println(nonSyncronizedListWithReentrantLock.size());
        }


    }
}
