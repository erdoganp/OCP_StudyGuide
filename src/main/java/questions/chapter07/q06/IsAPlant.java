package questions.chapter07.q06;

/*

Which statements about the following program are correct? (Choose all that apply.)
1: public abstract interface Herbivore {
2: int amount = 10;
3: public void eatGrass();
4: public abstract int chew() { return 13; }
5: }
6:
7: abstract class IsAPlant extends Herbivore {
8: Object eatGrass(int season) { return null; }
9: }
A. It compiles and runs without issue.
B. The code will not compile because of line 1.
C. The code will not compile because of line 2.
++D. The code will not compile because of line 4.// abstract methodlar gövdesizdir override edildiği yerde implementasyonun yapılır
++E. The code will not compile because of line 7.//bir sınıf bir interface i implemente eder ,extend etmez,interface interface i extend eder
F. The code will not compile because line 8 contains an invalid method override

* */



//public abstract interface Herbivore{
//    int amount=10;
//    public void eatGrass();
//    public abstract int chew(){return 13;}
//}
//
//public abstract class IsAPlant extends Herbivore{
//    Object eatGrass(int season){return null;}
//
//}
