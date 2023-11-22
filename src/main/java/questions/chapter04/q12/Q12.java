package questions.chapter04.q12;

public class Q12 {
    /*
    What is output by the following code? (Choose all that apply.)
var numbers = "012345678".indent(1);
numbers = numbers.stripLeading();
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.print(numbers.substring(7));
++A. 12
B. 123
C. 7
++D. 78
++E. A blank line
F. The code does not compile.
G. An exception is thrown
     */
    public static void main(String[] args) {
        var numbers = "012345678".indent(1); //indent ile bir bosluk kosulur ifadenin basına
        numbers = numbers.stripLeading();//basdaki boslugu siler
        System.out.println(numbers.substring(1, 3));//12
        System.out.println(numbers.substring(7, 7));//bosluk
        System.out.print(numbers.substring(7));//78
    }
}
