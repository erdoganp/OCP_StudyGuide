package questions.chapter11.q11;

public class Q11 {

    /*

    11. Which of the following exceptions must be handled or declared in the method in which they
are thrown? (Choose all that apply.)
class Apple extends RuntimeException {}
class Orange extends Exception {}
class Banana extends Error {}
class Pear extends Apple {}
class Tomato extends Orange {}
class Peach extends Throwable {}

A. Apple
++B. Orange
C. Banana
D. Pear
++E. Tomato
++F. Peach

     */

    /**catch or declare dediğimizde burada checked exceptionlardan bahsediyoruz demek oluyor.
     * Runtime Exception ve Error lar unchecked exceptiondır.
     * unchecked exceptionlar için catch veya declare etmemize gerek yok
     * */

    class Apple extends RuntimeException{

    }

    class Orange extends Exception{

    }

    class Banana extends Error{


    }

    class Pear extends Apple{

    }

    class Tomato extends Orange{

    }

    class Peach extends Throwable{

    }
}
