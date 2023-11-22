package questions.chapter03.q21;

public class Q21 {

    /*

    A minimum of how many lines need to be corrected before the following method
will compile?
21: void findZookeeper(Long id) {
22: System.out.print(switch(id) {
23: case 10 ->{"Jane"}
24: case 20 ->{yield "Lisa";};
25: case 30 ->"Kelly";
26: case 30 ->"Sarah";
27: default ->"Unassigned";
28: });
29: }
A. Zero
B. One
C. Two
D. Three
++E. Four
F. Five
     */

    void findZookeeper(Long id){
//        System.out.println(switch (id){ //Switcg de long tipnde deger parametre olarak alınmaz
//            case 10 ->{"Jane"}  //süslü parantez kullanılıyorsa yield kullanılmak zorunda
//            case 20 ->{yield "lisa";} //; fazla omus
//            case 30->"Kelly";
//            case 30->"Sarah"; //case 30 var zaten dublicate olmus
//            default -> "Unsigned";
//
//        });
    }
}
