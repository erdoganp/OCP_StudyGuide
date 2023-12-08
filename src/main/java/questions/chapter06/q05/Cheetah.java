package questions.chapter06.q05;
/*
Which of the following complete the constructor so that this code prints out 50? (Choose all
that apply.)
class Speedster {
int numSpots;
}
public class Cheetah extends Speedster {
int numSpots;
public Cheetah(int numSpots) {
// INSERT CODE HERE

}
public static void main(String[] args) {
Speedster s = new Cheetah(50);
System.out.print(s.numSpots);
}
}
A. numSpots = numSpots;
B. numSpots = this.numSpots;
C. this.numSpots = numSpots;
D. numSpots = super.numSpots;
++E. super.numSpots = numSpots;
F. The code does not compile regardless of the code inserted into the constructor.
G. None of the above

 */

class Speedster{
    int numSpots;
}

public class Cheetah  extends  Speedster{
    int numSpots;

    public Cheetah(int numSpots){
        super.numSpots=numSpots;
    }

    public static void main(String[] args) {
        Speedster s=new Cheetah(50);
        System.out.println(s.numSpots);
    }
}
