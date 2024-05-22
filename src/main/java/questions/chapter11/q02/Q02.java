package questions.chapter11.q02;

public class Q02 {

    /*

    2. Which statement about the following class is correct?
1: class Problem extends Exception {
2: public Problem() {}
3: }
4: class YesProblem extends Problem {}
5: public class MyDatabase {
6: public static void connectToDatabase() throw Problem {
7: throws new YesProblem();
8: }
9: public static void main(String[] c) throw Exception {
10: connectToDatabase();
11: }
12: }
A. The code compiles and prints a stack trace for YesProblem at runtime.
B. The code compiles and prints a stack trace for Problem at runtime.
C. The code does not compile because Problem defines a constructor.
D. The code does not compile because YesProblem does not define a constructor.
E. The code does not compile but would if Problem and YesProblem were switched on lines
6 and 7.
++F. None of the above //throws method signiture da kullanılır throw ise gövdede

     */

    class Problem extends Exception{

        public Problem(){

        }
    }

    class YesProblem extends Problem{}

    class MyDatabase{
//
//        public static void connectToDatabase() throw Problem{
//            throws new YesProblem();
//        }
//
    }

}
