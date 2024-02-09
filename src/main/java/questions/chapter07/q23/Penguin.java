package questions.chapter07.q23;

/*
*
Given the following program, what can be inserted into the blank line that would allow it to
print Swim! at runtime?
interface Swim {
default void perform() { System.out.print("Swim!"); }
}
interface Dance {
default void perform() { System.out.print("Dance!"); }
}
public class Penguin implements Swim, Dance {
public void perform() { System.out.print("Smile!"); }
private void doShow() {
;
}
public static void main(String[] eggs) {
new Penguin().doShow();
}
}
A. super.perform()
B. Swim.perform()
C. super.Swim.perform()
++D. Swim.super.perform()
E. The code does not compile regardless of what is inserted into the blank.
F. The code compiles, but due to polymorphism, it is not possible to produce the requested
*
*
*
* * */


interface Swim{
    default void perform(){
       System.out.println("Swim!");
    }
}

interface Dance{
    default void perform(){
        System.out.println("Dance!");
    }
}
public class Penguin implements Swim,Dance{
    public void perform(){
        System.out.println("Smile");
    }

    private void doShow(){

        //super.perform();
        //Swim.perform();
        //super.Swim.perform();
        Swim.super.perform();



    }

    public static void main(String[] args) {
        new Penguin().doShow();
    }
}
