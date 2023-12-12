package questions.chapter06.q15;

/*
15. Which statements about the following program are correct? (Choose all that apply.)
1: abstract class Nocturnal {
2: boolean isBlind();
3: }
4: public class Owl extends Nocturnal {
5: public boolean isBlind() { return false; }
6: public static void main(String[] args) {
7: var nocturnal = (Nocturnal)new Owl();
8: System.out.println(nocturnal.isBlind());
9: } }
A. It compiles and prints true.
B. It compiles and prints false.
++C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.
G. None of the above

 */
abstract class Nocturnal{
  //  boolean isBliend(); abstract yazılmamıs
}
public class Owl extends Nocturnal {
    public boolean isBlind(){
        return false;

    }

    public static void main(String[] args) {
        var noctural=(Nocturnal) new Owl();
        // System.out.println(noctural.isBliend());
    }
}
