package questions.chapter09.q03;

import java.util.ArrayDeque;

/**
 * kurallar
 * eger first ve last belirtilmediyse ekleme işlemleri sona ,çıkarma ve okuma işlemleri onden baslar.
 * ekleme işlemlerinde boolean geri doner çıkarma ve okuma işlemlerinde T doner.
 *
 * */

/*
What is the result of the following statements?
3: var greetings = new ArrayDeque<String>();
4: greetings.offerLast("hello");
5: greetings.offerLast("hi");
6: greetings.offerFirst("ola"); //sondurum [ola,hello,hi]
7: greetings.pop(); //[hello,hi]
8: greetings.peek();
9: while (greetings.peek() != null)
10: System.out.print(greetings.pop()); //pop yapıldıgında cıkarılan eleman doner.ilk cıkan hello oldugu için ilk yazılır sonra hi
A. hello
++B. hellohi
C. hellohiola
D. hiola
E. The code does not compile.
F. An exception is thrown.
 */


public class Q03 {
    public static void main(String[] args) {
        var greeting =new ArrayDeque<String>();
        greeting.offerLast("hello");
        greeting.offerLast("hi");
        greeting.offerFirst("ola");

        System.out.println(greeting);

        greeting.pop();
        greeting.peek();

        while (greeting.peek()!=null){
            System.out.print(greeting.pop());
        }

    }

}
