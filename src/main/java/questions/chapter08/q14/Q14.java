package questions.chapter08.q14;
/*

Which of the following are valid lambda expressions? (Choose all that apply.)
A. (Wolf w, var c) ->39
++B. (final Camel c) ->{}
C. (a,b,c) ->{int b = 3; return 2;}
++D. (x,y) ->new RuntimeException()
E. (var y) ->return 0;
F. () ->{float r}
G. (Cat a, b) ->{}

* */


public class Q14 {
    public static void main(String[] args) {

        /**
         * YA HEP-YA HİÇ LAMBDA SOL TARAFINDA  BU KURAL GECERLİDİR
         * */

      //  (Wolf w,var c) ->39; //var tanımlanmıssa digeride var olmak zorunda
      //  (final Camel c) -> {} //sorun yok
      //  (a,b,c) ->{int b = 3; return 2;} //b tekrar tanımlanmıs
        //(x,y) ->new RuntimeException() //sorun yok
        //(var y) ->return 0; //return kullanıldıgı için süslü parantez olmak zorunda
        //() ->{float r} //süslü parantez oldugu için noktalı virgül olmak zorunda
        //(Cat a, b) ->{} //birinin tipi var ise digeride olmak zorunda YA HEP-YA HİÇ
    }

    class Wolf{

    }

    class Cat{

    }

    class Camel{

    }


}
