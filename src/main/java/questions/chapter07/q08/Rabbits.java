package questions.chapter07.q08;
/*
When inserted in order, which modifiers can fill in the blank to create a properly encapsulated
class? (Choose all that apply.)
public class Rabbits {
int numRabbits = 0;
void multiply() {
numRabbits *= 6;
}
int getNumberOfRabbits() {
return numRabbits;
}
}
++A. private, public, and public
++B. private, protected, and private
++C. private, private, and protected
D. public, public, and public
E. The class cannot be properly encapsulated since multiply() does not begin with set.
F. None of the above

* */
/**
 * burda onemli olan instance variable in private olarak tanımlanması encapsulation için
 * */
public class Rabbits {
    private int numRabbits=0;
    public void multiply(){
        numRabbits *=6;
    }

    public int getNumberOfRabbits(){
        return numRabbits;
    }
}
