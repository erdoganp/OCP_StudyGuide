package questions.chapter02.q08;

public class Q08 {
   /* 4: int pig = (short)4;
      5: pig = pig++;
      6: long goat = (int)2;
      7: goat -=1.0;
      8: System.out.print(pig + " -"+ goat);
  ++A. 4 -1
    B. 4 -2
    C. 5 -1
    D. 5 -2
    E. The code does not compile due to line 7.
    F. None of the above.
*/

    public static  void main(String[] args){
        int pig=(short)4;
        pig=pig++;
        long goat=(int)2;
        goat -=1.0;
        System.out.println(pig + " -" + goat);
    }
}
