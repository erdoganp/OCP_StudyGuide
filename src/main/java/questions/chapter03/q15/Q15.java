package questions.chapter03.q15;

public class Q15 {
    /*
    5. What is the result of the following code snippet?
final char a = 'A', e = 'E';
char grade = 'B';
switch (grade) {
default:
case a:
case 'B': 'C': System.out.print("great ");
case 'D': System.out.print("good "); break;
case e:
case 'F': System.out.print("not good ");
}
A. great
B. great good
C. good
D. not good
E. The code does not compile because the data type of one or more case statements does
not match the data type of the switch variable.
++F. None of the above
     */

    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
                //   case 'B': 'C': System.out.print("great ");
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
    }
}
