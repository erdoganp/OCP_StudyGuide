package questions.chapter05.q13;

import questions.chapter05.q13.rope.*;

import static questions.chapter05.q13.rope.Rope.*;
public class RopeSwing {
/*
burada Rope sınıfnda static olarak bulunan lenght instance variable bir kez olusturuluyor ve bu sınıftan üretilne her obje aynı lenght ü
üzerinde çalısıyor
A. 02
B. 08
C. 2
++D. 8
E. The code does not compile.
F. An exception is thrown.
14. How many lines in the following code

 */
   private static Rope rope1=new Rope();

   private static Rope rope2=new Rope();
    {
        System.out.println(rope1.lenght);//burada RopeSwing objesi üretilmediği için initialize block calısmaz
    }

    public static void main(String[] args) {
//        rope1.lenght = 2;
//        rope2.lenght = 8;

        lenght = 2;
        lenght = 8;
        System.out.println(rope1.lenght);
    }

}
