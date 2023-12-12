package questions.chapter06.q19;
/*

19. What is the output of the following code?
1: class Reptile {
2: {System.out.print("A");}
3: public Reptile(int hatch) {}
4: void layEggs() {
5: System.out.print("Reptile");
6: } }
7: public class Lizard extends Reptile {
8: static {System.out.print("B");}
9: public Lizard(int hatch) {}
10: public final void layEggs() {
11: System.out.print("Lizard");
12: }
13: public static void main(String[] args) {
14: var reptile = new Lizard(1);
15: reptile.layEggs();
16: } }
A. AALizard
B. BALizard
C. BLizardA
D. ALizard
E. The code will not compile because of line 3.
++F. None of the above////parent da constructor tanıtıldıgı için compiler otomatik olarak constructor üretmez.bunun için kendin tanıtman gerekir.

 */

class Reptile{
    {
        System.out.println("A");
    }
    public Reptile(int hatch){
    }
    void layEggs(){
        System.out.println("Reptile");
    }

}

//public class Lizard extends Reptile {
//
//    static {
//        System.out.println("B");
//    }
//    public Lizard(int hatch){
//        super(1); //super olmazsa calısmaz hata verir
//    }
//
//    public final void layEggs(){
//        System.out.println("Lizard");
//    }
//
//    public static void main(String[] args) {
//        var reptile=new Lizard(1);
//        reptile.layEggs();
//    }

