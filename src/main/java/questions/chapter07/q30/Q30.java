package questions.chapter07.q30;
/*

Assuming the following classes are declared as top-level
types in the same file, which classes
contain compiler errors? (Choose all that apply.)
sealed class Bird {
public final class Flamingo extends Bird {}
}
sealed class Monkey {}
class EmperorTamarin extends Monkey {}
non-sealed
class Mandrill extends Monkey {}
sealed class Friendly extends Mandrill permits Silly {}
final class Silly {}

A. Bird
B. Monkey
++C. EmperorTamarin
D. Mandrill
++E. Friendly
F. Silly
G. All of the classes compile without issue.
 */



/**
 * KURALLAR
 *1. sealed sınıfı extend eden bir sınıf sealed,non-sealed veya final olmak zorunda
 *2.aynı dosyada oldugunda permits ifadesi kullanılmayabilir
 * 3.eger permits kullanılıyorsa permit edilen sınıf diger sınıfı extend etmek zorunda
 * */



public class Q30 {
    sealed class Bird{
        public final class Flamingo extends Bird{ //burda sorun olmaz cunku subclass tanımlanmıs ve final verilmis

        }
    }

    sealed class Monkey{}

   // class EmpororTamarin extends Monkey{ //sorun olur cunku Sealed classı extend ediyorsan sealed,non-sealed veya final olmak zorundasın

    //}

    non-sealed class Mandrill extends Monkey{ //sorun yok bu sekilde kullanılır

    }

//    sealed class Friendly extends Mandrill permits Silly{ //burda sorun var cunku Silly sınıfı bunu extend etmemiştir

    }

    final class Silly{

    }

}
