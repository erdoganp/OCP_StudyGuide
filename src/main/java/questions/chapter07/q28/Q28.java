package questions.chapter07.q28;
/*

Which of the following classes and interfaces do not compile? (Choose all that apply.)
public abstract class Camel { void travel(); }
public interface EatsGrass { private abstract int chew(); }
public abstract class Elephant {
abstract private class SleepsAlot {
abstract int sleep();
} }
public class Eagle { abstract soar(); }
public interface Spider { default void crawl() {} }
++A. Camel
++B. EatsGrass
C. Elephant
++D. Eagle
E. Spider
F. None of the classes or interfaces compile.

*/

public class Q28 {

//    public abstract class Camel { void travel(); } //hata verir cunku travel methodunda body yok
//    public interface EatsGrass { private abstract int chew() ;} //hata verir cunku abstract methodlar private tanımlamazlar
    public abstract class Elephant {
        abstract private class SleepsAlot {
            abstract int sleep();
        } }
   // public class Eagle { abstract soar(); }//hata verir cunku abstract method bir abstract sınıf veya interface de olmak zorunda
    public interface Spider { default void crawl() {} }
}
