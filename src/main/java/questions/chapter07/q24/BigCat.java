package questions.chapter07.q24;
/*

Which lines of the following interface do not compile? (Choose all that apply.)
1: public interface BigCat {
2: abstract String getName();
3: static int hunt() { getName(); return 5; }
4: default void climb() { rest(); }
5: private void roar() { getName(); climb(); hunt(); }
6: private static boolean sneak() { roar(); return true; }
7: private int rest() { return 2; };
8: }
A. Line 2
++B. Line 3
C. Line 4
D. Line 5
++E. Line 6
F. Line 7
G. None of the above

*/

/***
 * KURALLAR
 * interface dogası gereki içerisindeki methodlar interface i implemete eden sınıf tarafından override edilmelidir.
 * 1. interface içinde bir static method varsa bu static method override edilemeceyeği için body si bulunmak zorunda
 * 2.eger interface bir default method içeriyorsa bu method da body bulundurmak zorunda
 * 3. eger bir interface bir private method içeriyorsa bu methoda da kalıtılamayacagı için body si olmak zorunda
 * 4.static methodlar instance methodlara direk erişemezler cunku bir instance methodun erişilebilmesi için objesinin olusması gerekir class load edildiğinde erişilemez
 * 5.instance methodlar static methodlara direk erişirler cunku class lar yuklendiğinde bu methodlarada erişebilir duruma gelir
 */

public interface BigCat {

        abstract String getName();
        static int hunt(){
           // getName();//hunt() methodu static oldugu için instance methodu direk cagıramaz obje üzerinden erismek zorunda
            return 5;
        }

        default void climb(){
            rest(); //buradad sorun yok default method gövde içermek zorunda ve private methodu cagırabilir
        }

        private void roar(){ //burada da sorun yok cunku gövdesindeki methodlara erişebilir
            getName();
            climb();
            hunt();


        }

        private static boolean sneak(){
         //   roar(); //roar methodu bir instance method oldugu için direk erisemez obje üzerinden erisebilir
            return true;
        }

        private int rest(){//sorun yok
            return 2;
        };
}
