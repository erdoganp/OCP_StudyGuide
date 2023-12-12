package questions.chapter06.q18;

import java.awt.print.PrinterAbortException;

/*
18. Which statements about the following classes are correct? (Choose all that apply.)
1: public class Mammal {
2: private void eat() {}
3: protected static void drink() {}
4: public Integer dance(String p) { return null; }
5: }
6: class Primate extends Mammal {
7: public void eat(String p) {}
8: }
9: class Monkey extends Primate {
10: public static void drink() throws RuntimeException {}
11: public Number dance(CharSequence p) { return null; }
12: public int eat(String p) {}
13: }
A. The eat() method in Mammal is correctly overridden on line 7. //eat methodu private oldugu için kalıtım vermez bundan dolayı override veye overload edilmez
B. The eat() method in Mammal is correctly overloaded on line 7.//eat methodu private oldugu için kalıtım vermez bundan dolayı override veye overload edilmez
C. The drink() method in Mammal is correctly overridden on line 10.//drink methodu static oldugu için override edilmez
++D. The drink() method in Mammal is correctly hidden on line 10.//dogru,static oldugu için hidden edilebilr ve burada uygun kullnılmıs
E. The dance() method in Mammal is correctly overridden on line 11.//Donus tipi Integer dan Number a dondugu için override edilmemiştir
++F. The dance() method in Mammal is correctly overloaded on line 11.//Dogru,method ismi aynı ,mehod parametre tipi farklı oldugu için overload edilmiştir
G. The eat() method in Primate is correctly hidden on line 12.//hidden edilmemiştir static degil
H. The eat() method in Primate is correctly overloaded on line 12.//overload edilmemiştir ayrıca donus tipi return edilmediği için complier error veri

 */
public class Mammal {
    private void eat(){

    }
    protected static void drink(){}
    public Integer dance(String p){
        return null;
    }
}
class Primate extends Mammal{
    public  void eat(String p){}

}

class Monkey extends Primate{

    public static void drink() throws  RuntimeException{}
    public Number dance(CharSequence p){return null;}
  //  public int eat(String p){}

}