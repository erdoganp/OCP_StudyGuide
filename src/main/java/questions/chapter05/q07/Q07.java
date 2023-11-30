package questions.chapter05.q07;

public class Q07 {
    /*
    Given the following method, which of the method calls return 2? (Choose all that apply.)
public int juggle(boolean b, boolean... b2) {
return b2.length;
}
A. juggle();
B. juggle(true);
C. juggle(true, true);
++D. juggle(true, true, true);
E. juggle(true, {true, true}); //array initialize method parametresi kısmında yapılmaz
++F. juggle(true, new boolean[2]);
     */

    public static int juggle(boolean b,boolean...b2){
        return b2.length;
    }

    public static void main(String[] args) {
            //juggle();
        System.out.println(juggle(true));
        System.out.println(juggle(true,true));
        System.out.println(juggle(true,true,true));
       // System.out.println(juggle(true,{true,true}));
        System.out.println(juggle(true,new boolean[2]));
    }
}
