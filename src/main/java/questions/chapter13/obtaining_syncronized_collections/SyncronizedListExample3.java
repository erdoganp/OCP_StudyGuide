package questions.chapter13.obtaining_syncronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronizedListExample3 {

    private static final Object LOCK=new Object();

    public static void main(String[] args) {

        List<Integer> original =new ArrayList<>();

        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        List<Integer> syncronizedList= Collections.synchronizedList(original);

        for (Integer i: syncronizedList){
            if(i==2){
                syncronizedList.remove(Integer.valueOf(2));
                //java.util.ConcurrentModificationException
            }
        }


    }
}
