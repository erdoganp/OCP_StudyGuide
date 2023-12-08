package questions.chapter06.q04;

/**
 * Burada onemli olan sey parent class da constructor tanımı yapılmıs olması
 * normalde constructor tanımı olması default constructorı java bizim için üretiyor ve alt sınıfda da bunu cagırıyor.
 * fakat üst sınıfta parametreli constructor tanımı yapıldıgı için bizim bu constructorı super(parametre..) ile cagırmamız gerekiyor.
 * eger bunu yapmazsak code hata verir
 * */
/*
4. What is the output of the following program?
1: class Mammal {
2: private void sneeze() {}
3: public Mammal(int age) {
4: System.out.print("Mammal");
5: } }
6: public class Platypus extends Mammal {
7: int sneeze() { return 1; }
8: public Platypus() {
9: System.out.print("Platypus");
10: }
11: public static void main(String[] args) {
12: new Mammal(5);
13: } }
A. Platypus
B. Mammal
C. PlatypusMammal
D. MammalPlatypus
E. The code will compile if line 7 is changed.
++F. The code will compile if line 9 is changed.

 */

public class Mammal {

    private void sneeze(){
    }

    public Mammal(int age){
        System.out.println("Mammal");
    }
}

 class Platypus extends Mammal{
    int sneeze() {return 1;}

    public Platypus(){
        super(1);  //Eger super() ile ust sınıfın constructorunu cagırmazsak code hata verir.
        System.out.println("platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
