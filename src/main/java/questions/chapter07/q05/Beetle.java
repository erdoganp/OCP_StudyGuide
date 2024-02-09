package questions.chapter07.q05;
/*

Which statements about the following program are correct? (Choose all that apply.)
1: interface HasExoskeleton {
2: double size = 2.0f;
3: abstract int getNumberOfSections();
4: }
5: abstract class Insect implements HasExoskeleton {
6: abstract int getNumberOfLegs();
7: }
8: public class Beetle extends Insect { //class seviyesinde hata verir
9: int getNumberOfLegs() { return 6; }
10: int getNumberOfSections(int count) { return 1; }
11: }
A. It compiles without issue.
B. The code will produce a ClassCastException if called at runtime.
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
+++E. The code will not compile because of line 8.
F. The code will not compile because of line 10.

* */

interface hasExoskeleton{
    double size=2.0f; //burda sorun çıkmaz çunkü upcasting var
   // float size2=5.7;//eger virgüllü bir ifade varsa ve float bir degere assign edilirse sonuna f yazmazsak COMPILE ERROR verir
    abstract int getNumberOfSections();
}

abstract class Insect implements hasExoskeleton{
    abstract int getNumberOfLegs();
}
/**
 * burda getNumberOfSectionsmethodu parametreli oldugu için overload edilmis ama override edilmesi gerekiyor bundan dolayı class seviyesinde hata verir
 * */
//public class Beetle extends  Insect{
//    int getNumberOfLegs(){return 6;}
//    int getNumberOfSections(int count){return 1;}
//}
