package questions.chapter08.q11;

import java.util.function.Predicate;

public class Fantasy {

    /*

    How many times is true printed out by this code?
import java.util.function.Predicate;
public class Fantasy {
public static void scary(String animal) {
var dino = s ->
"dino".equals(animal);
var dragon = s ->
"dragon".equals(animal);
var combined = dino.or(dragon);
System.out.println(combined.test(animal));
}
public static void main(String[] args) {
scary("dino");
scary("dragon");
scary("unicorn");
}
}

A. One
B. Two
C. Three
++D. The code does not compile.
E. A runtime exception is thrown
    */

    public static void scary(String animal){
//
//      //  var dino=s-> "dino".equals(animal); //var olarak contexti çözemez
//        //Predicate<String> dino= s-> "dino".equals(animal);
//        //var dragon = s -> //var olarak contexti cozemez
//                "dragon".equals(animal);
//        var combined = dino.or(dragon);
//        System.out.println(combined.test(animal));
//    }
//    public static void main(String[] args) {
//        scary("dino");
//        scary("dragon");
//        scary("unicorn");
   }
}

