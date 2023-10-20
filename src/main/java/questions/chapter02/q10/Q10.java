package questions.chapter02.q10;

public class Q10 {

    /*
    What are the unique outputs of the following code snippet? (Choose all that apply.)
    short height = 1, weight = 3;
    short zebra = (byte) weight * (byte) height;
    double ox = 1 + height * 2 + weight;
    long giraffe = 1 + 9 % height + 1;
    System.out.println(zebra);
    System.out.println(ox);
     System.out.println(giraffe);

     A. 1
     B. 2
     C. 3
     D. 4
     E. 5
     F. 6
   ++G. The code does not compile.

     */

    public static void main(String[] args){
        short height=1,weight=3;
        //short zebra=(byte)weight *(byte) height; burada işlem yapıldıgı için int e yukseltilir fakat assign  olarak short yapıldıgı için compile olmaz
    }


}
