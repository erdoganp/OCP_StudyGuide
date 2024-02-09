package questions.chapter07.q22;

/*

Which of the following can be inserted in the rest() method? (Choose all that apply.)
public class Lion {
class Cub {}
static class Den {}
static void rest() {
;
} }
A. Cub a = Lion.new Cub()
B. Lion.Cub b = new Lion().Cub()
++C. Lion.Cub c = new Lion().new Cub()
++D. var d = new Den()
E. var e = Lion.new Cub()
F. Lion.Den f = Lion.new Den()
++G. Lion.Den g = new Lion.Den()
H. var h = new Cub()

* */

public class Lion {
    class Cub{

    }

    static class Den{}
    static void Rest(){
        //Cub a =Lion.new Cub(); //Bu olmaz cunku once Lion objesi new ile olusturulması gerekiyor
      //  Lion.Cub b=new Lion().Cub(); //bu olmaz cunku new Cub() demesi gerekiyor

        Lion.Cub c=new Lion().new Cub(); //BU dogru cunku once Lion objesi olusturulup daha sonra Cup objesi olusturulmus
        var d=new Den();//Bu dogru cunku Den static bir sınıf

       // var e=Lion.new Cub();// bu olmaz cunku Lion objesi olusturulmamıstır
      //  Lion.Den f=Lion.new Den();//bu olmaz cunku Lion objesi olusturulmadan Den objesi olusturulmaz

        Lion.Den g=new Lion.Den(); //bu dogru cunku Den static bir sınıf oldugu için Lion objesi üzerinden direk erişilebilir

        //var h=new Cub();// bu olmaz cunku Cub objesi olusturulabilmesi için once Lion objesi olusturulmalı
    }
}
