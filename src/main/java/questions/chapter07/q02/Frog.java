package questions.chapter07.q02;
/*
Which of the following statements can be inserted in the blank line so that the code will compile
successfully? (Choose all that apply.)
interface CanHop {}
public class Frog implements CanHop {
public static void main(String[] args) {
frog = new TurtleFrog();
}
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}

++A. Frog
++B. TurtleFrog
C. BrazilianHornedFrog -->olmaz cunku BrazilianHornedFrog ile TurtleFrog arasında hiyerarşi yoktur
++D. CanHop
++E. var
F. Long
G. None of the above; the code contains a compilation error.

 */
interface CanHop{

}
public class Frog implements CanHop{
    public static void main(String[] args) {
       //Frog frog =new TurtleFrog();
       // TurtleFrog frog =new TurtleFrog();
       // CanHop frog =new TurtleFrog();
        var frog =new TurtleFrog();

    }
}

class BrazilianHornedFrog extends Frog{

}

class TurtleFrog extends Frog{

}

