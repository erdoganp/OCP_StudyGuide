package questions.chapter05.q21;

public class Q21 {
    /*
    burada onemli olan method ismi ve parametre tipleri ve sayısıdır.donus tipi ve acces modifiers overloaded da etkili değil

    Which method signatures are valid overloads of the following method signature? (Choose all
that apply.)
public void moo(int m, int... n)
A. public void moo(int a, int... b)--COMPILE ERROR-üstteki method ile birebir aynı
++B. public int moo(char ch)
C. public void moooo(int... z)-isim farklı
++D. private void moo(int... x)
E. public void moooo(int y)-isim farklı
F. public void moo(int... c, int d)-COMPILE ERROR-vararg basta olamaz
G. public void moo(int... i, int j...) --COMPILE ERROR-birden fazla vararg olamaz bir method da

     */
    public void moo(int m,int... n){

    }
    public int moo(char ch){
        return 1;
    }
    private void moo(int... x){

    }
}
