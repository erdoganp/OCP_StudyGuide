package questions.chapter01.q9;

public class Q9 {
    /*
    Which of the following are correct? (Choose all that apply.)
A. An instance variable of type float defaults to 0. //0.0 dır
B. An instance variable of type char defaults to null. //nul karakteri defaulttur
C. A local variable of type double defaults to 0.0.  //local variable larda ilk deger ataması zorunludur
D. A local variable of type int defaults to null.    //local variable larda ilk deger ataması zorunludur
++E. A class variable of type String defaults to null.
F. A class variable of type String defaults to the empty string "". // null dur
G. None of the above.
    * */
    public float Floatt;
    public char karaker;

    String name;

    public static void main(String[] args){
            Q9 q9=new Q9();

        double dablue;


        int sayi;

       // System.out.println(dablue + sayi );

        System.out.println(q9.Floatt+ " "+ q9.name + " " + q9.karaker);
    }



}
