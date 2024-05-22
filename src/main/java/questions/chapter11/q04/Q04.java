package questions.chapter11.q04;

public class Q04 {

    /*
4. What is the output of the following snippet, assuming a and b are both 0?
3: try {
4: System.out.print(a / b);
5: } catch (RuntimeException e) {
6: System.out.print(-1);
7: } catch (ArithmeticException e) {
8: System.out.print(0);
9: } finally {
10: System.out.print("done");
11: }
A. -1
B. 0
C. done-1
D. done0
++E. The code does not compile.//Birden fazla catch blogu varsa aralarında hiyerarsik olarak sıra olmalıdır
F. An uncaught exception is thrown.
G. None of the above

     */

    public static void main(String[] args) {

        int a=0;
        int b=0;

        try{
            System.out.println(a /b );
        }catch (RuntimeException e){
            System.out.println(-1);
        }
//        catch (ArithmeticException e){
//            System.out.println(0);
//        }
        finally {
            System.out.println("done");
        }


    }
}
