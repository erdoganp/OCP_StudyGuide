package questions.chapter10.q07;

import test.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q07 {
    /*

    We have a method that returns a sorted list without changing the original. Which of the following
can replace the method implementation to do the same with streams?
private static List<String> sort(List<String> list) {
var copy = new ArrayList<String>(list);
Collections.sort(copy, (a, b) ->b.compareTo(a));
return copy;
}
A.
return list.stream()
.compare((a, b) ->b.compareTo(a))
.collect(Collectors.toList());

B.
return list.stream()
.compare((a, b) ->b.compareTo(a))
.sort();

C.
return list.stream()
.compareTo((a, b) ->b.compareTo(a))
.collect(Collectors.toList());

D.
return list.stream()
.compareTo((a, b) ->b.compareTo(a))
.sort();

E.
return list.stream()
.sorted((a, b) ->b.compareTo(a))
.collect();

++F.
return list.stream()
.sorted((a, b) ->b.compareTo(a))
.collect(Collectors.toList());



     */

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("ahmet");
        list.add("cemil");
        list.add("deniz");
        System.out.println( sort(list));
    }

    private static List<String> sort(List<String> list){

        var copy =new ArrayList<String>(list);
        Collections.sort(copy, (a,b) ->b.compareTo(a));

        //return copy;

        return list.stream()
                .sorted((a,b) ->b.compareTo(a))
                .collect(Collectors.toList());

//
//        return list.stream()
//                .compare((a,b) ->b.compareTo(a))//streamlerde compareTo methodu tok
//                .collect(Collectors.toList());
//

//
//        return list.stream()
//                .compare((a,b) ->b.compareTo(a))//streamlerde compareTo methodu tok
//                .sort();

//
//        return list.stream()
//                .compareTo((a,b) ->b.compareTo(a))//streamlerde compareTo methodu tok
//                .collect(Collectors.toList());


//
//        return  list.stream()
//                .compareTo((a,b) ->b.compareTo(a))  //streamlerde compareTo methodu tok
//                .sort();

//
//        return list.stream()
//                .sorted((a,b) ->b.compareTo(a))
//                .collect(); //collect methodu parametre almak zorunda

    }
}
