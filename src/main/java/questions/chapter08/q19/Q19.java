package questions.chapter08.q19;

import java.util.Set;
import java.util.function.Consumer;

/*

Which of the following compiles and prints out the entire set? (Choose all that apply.)
Set<?> set = Set.of("lion", "tiger", "bear");
var s = Set.copyOf(set);
Consumer<Object> consumer = _______________;
s.forEach(consumer);
A. () ->System.out.println(s)
B. s ->System.out.println(s)
C. (s) ->System.out.println(s)
D. System.out.println(s)
E. System::out::println
++F. System.out::println

 */

public class Q19 {
    public static void main(String[] args) {

        Set<?> set = Set.of("lion", "tiger", "bear");
        var s = Set.copyOf(set);
        Consumer<Object> consumer = System.out::println;
      //  Consumer<Object> consumer= System::out::println;//bu sekilde bir kullanım yok
      //  Consumer<Object> consumer =  s -> System.out.println(s);//s parametresi yukarıda tanımlandıgı için tekrar kullanılmaz
       // Consumer<Object> consumer (s) -> System.out.println(s);//s parametresi yukarıda tanımlandıgı için tekrar kullanılmaz
      //  Consumer<Object> consumer= () -> System.out.println(s);//parametre almak zorunda
       // Consumer<Object> consumer= System.out.println(s);//bu sekilde bir kullanım yok
        s.forEach(consumer);
    }
}
