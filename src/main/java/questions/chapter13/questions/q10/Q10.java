package questions.chapter13.questions.q10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q10 {
    /*

    10. What is the result of executing the following code snippet?
List<Integer> lions = new ArrayList<>(List.of(1,2,3));
List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
Set<Integer> bears = new ConcurrentSkipListSet<>();
bears.addAll(lions);
for(Integer item: tigers) tigers.add(4); // x1
for(Integer item: bears) bears.add(5); // x2
System.out.println(lions.size() + " " + tigers.size()
+ " " + bears.size());
++A. It outputs 3 6 4.
B. It outputs 6 6 6.
C. It outputs 6 3 4.
D. The code does not compile.
E. It compiles but throws an exception at runtime on line x1.
F. It compiles but throws an exception at runtime on line x2.
G. It compiles but enters an infinite loop at runtime.



     */

    public static void main(String[] args) {

        List<Integer> lions=new ArrayList<>(List.of(1, 2, 3)); //liste olusturuyoruz
        List<Integer> tigers= new CopyOnWriteArrayList<>(lions); //lions daki listeyi tigers a kopyalıyoruz
        Set<Integer> bears= new ConcurrentSkipListSet<>(); // skip ile olusturdugumuz için sorted liste olusturuyoruz

        bears.addAll(lions); //lions daki elemanları bears setine de ekliyoruz

        for(Integer item: tigers)
            tigers.add(4);   // tigers a 3 defa 4 elemanını ekliyoruz

        for (Integer item : bears)
            bears.add(4); //bears a 3 defa ekleme yapıyoruz ama set oldugu için   bir defa 4 u ekliyor

        System.out.println(lions.size() + " " + tigers.size() +" " + bears.size());

        System.out.println("lions : " + lions);
        System.out.println("tigers: " + tigers);
        System.out.println("bears : " + bears);

        //lions da herhangi bir değişklik yapmadıgımız için size ı 3 olarak kalıyor

    }

}
