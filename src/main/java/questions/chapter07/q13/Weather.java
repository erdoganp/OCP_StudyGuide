package questions.chapter07.q13;
/*

What is the result of the following program?
public class Weather {
enum Seasons {
WINTER, SPRING, SUMMER, FALL
}
public static void main(String[] args) {
Seasons v = null;
switch (v) {
case Seasons.SPRING ->
System.out.print("s");
case Seasons.WINTER ->
System.out.print("w");
case Seasons.SUMMER ->
System.out.print("m");
default ->
System.out.println("missing data"); }
}
}
A. s
B. w
C. m
D. missing data
E. Exactly one line of code does not compile.
++F. More than one line of code does not compile.
G. The code compiles but produces an exception at runtime
* */

public class Weather {
    enum Seasons{
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Seasons v=null;
        switch (v){
            /**
             * enumlarda switch kullanıdgımızda
             * case SPRING olarak kullanmamız gerekir
             * yani direk ENUM değerini yazmalıyız
             * */

//            case Seasons.SPRING -> System.out.println("s");
//            case Seasons.WINTER -> System.out.println("w");
//            case Seasons.SUMMER -> System.out.println("m");
            default -> System.out.println("missing data");
        }
    }
}
