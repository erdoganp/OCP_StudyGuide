package questions.chapter07.q19;

public class Bear {
/*

Which of the following are printed by the Bear program? (Choose all that apply.)
public class Bear {
enum FOOD {
BERRIES, INSECTS {
public boolean isHealthy() { return true; }},
FISH, ROOTS, COOKIES, HONEY;
public abstract boolean isHealthy();
}
public static void main(String[] args) {
System.out.print(FOOD.INSECTS);
System.out.print(FOOD.INSECTS.ordinal());
System.out.print(FOOD.INSECTS.isHealthy());
System.out.print(FOOD.COOKIES.isHealthy());
}
}
A. insects
B. INSECTS
C. 0
D. 1
E. false
F. true
++G. The code does not compile

*/


   /**
    * ONEMLI KURAL
    * Bir enum içinde abstract method tanımlı ise enumdaki tüm üyeler bu abstract methodu override etmek ZO-RUN-DA!!
    *soruda Intersect için override işlemi yapılmıs fakat diger üyeler bu methodu override etmemis
    * bundan dolayı COMPILE -ERROR verir
    * */

//    enum FOOD{
//        BERRIES, INSECTS{
//            public boolean isHealth(){
//                return true;
//            }
//        },
//        FISH,ROOTS, COOKIES, HONEY;
//        public abstract boolean isHealth();
//    }
}
