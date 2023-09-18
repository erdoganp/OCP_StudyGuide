package questions.chapter01.q05;

public class Bear {

    /*
    *Which statements about the following program are correct? (Choose all that apply.)

    A. The object created on line 9 is eligible for garbage collection after line 13. ++
    B. The object created on line 9 is eligible for garbage collection after line 14.
    C. The object created on line 10 is eligible for garbage collection after line 12.
    D. The object created on line 10 is eligible for garbage collection after line 13. ++
    E. Garbage collection is guaranteed to run.
    F. Garbage collection might or might not run.                                       ++
    G. The code does not compile.
   * */

    /*
    * kodun çalısma sekli
    * 1)öncelikler brownBear ve polarBear adında stack de iki referans olusur ve bu referansların Heap alanında gösterdiği
    * iki farklı object bulunur
    * 2)Heap deki objectlerin içlerinde pandaBear adında referans bulunur
    * 3)33. satırdan sonra brownbearın gösterdiği objenin içinde bulunan pandaBear referensı polarBearın gösterdiği objeji göstermektedir
    * 4)polarBear referansı ile obje arasında baglantı kesiliyor
    * 5)brownBear ile onun gösterdiği objenin baglantısı kesiliyor
    * */
    private Bear pandaBear;
    private void roar(Bear b){
        System.out.println("Roar ..");
        pandaBear=b;
    }

    public  static void main(String[] args){
        Bear brownBear =new Bear();
        Bear polarBear =new Bear();
        brownBear.roar(polarBear);
        polarBear=null;
        brownBear=null;
        System.gc();
    }
}
