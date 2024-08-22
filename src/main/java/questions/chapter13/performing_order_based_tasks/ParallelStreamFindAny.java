package questions.chapter13.performing_order_based_tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParallelStreamFindAny {

    public static void main(String[] args) {

        for(int i=0; i<50 ; i++){
            parallelStreamFindAny();
            serialStreamStreamFind();
        }

    }


    private static void parallelStreamFindAny(){

        Set<Integer> set=new HashSet<>();

        for(int i=0; i< 100; i++){

            int findAnyNumber= List.of(1, 2, 3, 4, 5, 6)
                    .parallelStream()
                    .findAny()
                    .get();
            set.add(findAnyNumber);
        }

        System.out.println("parallel Stream Result : " + set);


    }


    private static void serialStreamStreamFind(){
        Set<Integer> set =new HashSet<>();

        for (int i=0; i< 100 ; i++){

            int findAnyNumber = List.of(1, 2, 3, 4, 5, 6)
                    .stream()
                    .findAny()
                    .get();

            set.add(findAnyNumber);
        }

        System.out.println("serialNumberResult :"  + set);

    }




}
