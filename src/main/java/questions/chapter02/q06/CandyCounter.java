package questions.chapter02.q06;

public class CandyCounter {
  /*  6. What is the output of the following program?
            1: public class CandyCounter {
            2: static long addCandy(double fruit, float vegetables) {
            3: return (int)fruit+vegetables;
            4: }
            5:
            6: public static void main(String[] args) {
            7: System.out.print(addCandy(1.4, 2.4f) + ", ");
            8: System.out.print(addCandy(1.9, (float)4) + ", ");
            9: System.out.print(addCandy((long)(int)(short)2, (float)4)); } }
    A. 4, 6, 6.0
    B. 3, 5, 6
    C. 3, 6, 6
    D. 4, 5, 6
    E. The code does not compile because of line 9.
  ++F. None of the above.*/

   /* static long addCandy(double fruit,float vegatables){
        return (int)fruit + vegatables;
    }*///DOES NOT COMPILE

    //Solution 1
    static long addCandyFixed(double fruit,float vegatables){return (int)(fruit+vegatables); }

    //Solution 2
    static  long addCandyFixed2(double fruit,float vegatables){return (long) (fruit+vegatables);}


}
