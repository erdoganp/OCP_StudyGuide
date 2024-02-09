package questions.chapter07.q04;

/*

What is the output of the following program?
public sealed class ArmoredAnimal permits Armadillo {
public ArmoredAnimal(int size) {}
@Override public String toString() { return "Strong"; }
public static void main(String[] a) {
var c = new Armadillo(10, null);
System.out.println(c);
}
}
class Armadillo extends ArmoredAnimal {
@Override public String toString() { return "Cute"; }
public Armadillo(int size, String name) {
super(size);
}
}

A. Strong
B. Cute
++C. The program does not compile.
D. The code compiles but produces an exception at runtime.
E. None of the above

 */


//public sealed class ArmoredAnimal permits Armadillo {
//    public ArmoredAnimal (int size){
//
//    }
//    @Override
//    public String toString(){
//        return "Strong";
//    }
//
//    public static void main(String[] args) {
//        var c=new Armadillo(10,null);
//        System.out.println(c);
//    }
//}

/**
 * burada problem eger bir sealed sınıf extend ediliyorsa extend eden sınıf sealed,non-sealed veya final olmak zorunda
// * */

//class Armadillo extends ArmoredAnimal{
//    @Override
//    public String toString(){
//        return "Cute";
//    }
//    public Armadillo(int size,String name){
//        super(size);
//    }
//}
