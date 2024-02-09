package questions.chapter07.q15;

/*
Which lines, when entered independently into the blank, allow the code to print
Not scared at runtime? (Choose all that apply.)
public class Ghost {
public static void boo() {
System.out.println("Not scared");
}
protected final class Spirit {
public void boo() {
System.out.println("Booo!!!");
}
}
public static void main(String... haunt) {
var g = new Ghost().new Spirit() {};
;
}
}
A. g.boo()
B. g.super.boo()
C. new Ghost().boo()
D. g.Ghost.boo()
E. new Spirit().boo()
F. Ghost.boo()
++G. None of the above

* */

public class Ghost {
    public static void boo(){
        System.out.println("Not scared");
    }

    protected final class Spirit{
        public void boo(){
            System.out.println("Boo");
        }
    }

    public static void main(String... haunt) {

        /**
         * burada new Spirit(){} yaptıgı zaman sonraki suslu parantez Spirit sınıfından bir anonim subclass olsturulmaya çalısılıyor demektir
         * ama Spirit sınıfı final oldugu için subclass olusturulamaz bundan dolayı compile error verir
         * */
        //var g=new Ghost().new Spirit(){};
        var g=new Ghost().new Spirit();//bu sekilde yapılabilirdi
    }
}
