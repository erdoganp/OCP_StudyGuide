package questions.chapter02.q19;

public class Q19 {
    /*
    19. What is the result of executing the following code snippet? (Choose all that apply.)
    3: int start = 7;
    4: int end = 4;
    5: end += ++start;
    6: start = (byte)(Byte.MAX_VALUE + 1);
A. start is 0.
+B. start is -128.
C. start is 127.
D. end is 8.
E. end is 11.
+F. end is 12.
G. The code does not compile.
H. The code compiles but throws an exception at runtime.
     */

    public static void main(String[] args){
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte)(Byte.MAX_VALUE + 1);

        System.out.println(start);
        System.out.println(end);
    }
}
