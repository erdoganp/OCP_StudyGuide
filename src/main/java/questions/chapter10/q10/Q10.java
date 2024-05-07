package questions.chapter10.q10;

import java.util.Comparator;
import java.util.stream.Stream;

public class Q10 {


    /*

    Given the four statements (L, M, N, O), select and order the ones that would complete the
expression and cause the code to output 10 lines. (Choose all that apply.)
Stream.generate(() ->
"1")
L: .filter(x ->
x.length()> 1)
M: .forEach(System.out::println)
N: .limit(10)
O: .peek(System.out::println)
;
A. L, N
B. L, N, O
C. L, N, M
D. L, N, M, O
E. L, O, M
++F. N, M
G. N, O

     */

    public static void main(String[] args) {

optionA();
optionF();

    }

    private static void optionA(){

        System.out.println("##option A");
        Stream.generate(() ->"1")
                .filter(x->x.length()> 1)
                .limit(10); //burada terminal operator kullanılmadıgı için stream calısmaz

    }


    private static void optionB(){

        System.out.println("##option A");
        Stream.generate(() ->"1")
                .filter(x->x.length()> 1)
                .limit(10)
                .peek(System.out::println); //terminal operator yok

    }

    private static void optionC(){


        System.out.println("##option A");
        Stream.generate(() ->"1")
                .filter(x->x.length()> 1) //burada filter a uygun eleman olmadıgı için hicbir deger cıktısı üretmez
                .limit(10)
                .forEach(System.out::println);

    }

    private static void optiomD(){
        System.out.println("##option A");
        Stream.generate(() ->"1")
                .filter(x->x.length()> 1) //burada filter a uygun eleman olmadıgı için hicbir deger cıktısı üretmez
                .limit(10)
                .forEach(System.out::println);
                //.peek() // terminal operatorden sonra method kullanılmaz

    }

    private static void optionE(){

        System.out.println("##option A");
        Stream.generate(() ->"1")
                .filter(x->x.length()> 1) //burada filter a uygun eleman olmadıgı için hicbir deger cıktısı üretmez
                .peek(System.out::println)
                .forEach(System.out::println);

    }

    private static void optionF(){

        System.out.println("##optionF");
        Stream.generate(()->"1")
                .limit(10)
                .forEach(System.out::println);

    }

}
