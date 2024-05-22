package questions.chapter11.q20;

public class Q20 {
    /*

    20. What is printed by the following program?
1: public class DriveBus {
2: public void go() {
3: System.out.print("A");
4: try {
5: stop();
6: } catch (ArithmeticException e) {
7: System.out.print("B");
8: } finally {
9: System.out.print("C");
10: }
11: System.out.print("D");
12: }
13: public void stop() {
14: System.out.print("E");
15: Object x = null;
16: x.toString();
17: System.out.print("F");
18: }
19: public static void main(String n[]) {
20: new DriveBus().go();
21: } }
A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace
F. AEBCD followed by a stack trace
++G. AEC followed by a stack trace
H. A stack trace with no other output


     */

/**
 *1 akısta oncelikle go methodu calsır ve A ifadesini yazar
 * 2)stop methodu cagrılır ve E ifadesi yazar
 * 3)null pointer exception olustugu için catch e duser fakat catch de yakalanmaz
 * 4)finally blogu calısır ve C yazar program sonrasında crash olur
 *
 * */

    public static void main(String[] args) {
        new Q20().go();

    }



        public void go(){
            System.out.println("A");
            try{
                stop();
            }catch (ArithmeticException e){ //null pointer exceptionı yakalayamaz
                System.out.println("B");
            }finally {
                System.out.println("C");
            }
            System.out.println("B");
        }


    public void stop(){
        System.out.println("E");
        Object x =null;
        x.toString(); //null pointer exception verir
        System.out.println("F");

    }
    }

