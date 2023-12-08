package questions.chapter06.q01;

public class BirdSeed {

    /*
    Which code can be inserted to have the code print 2?
public class BirdSeed {
private int numberBags;
boolean call;
public BirdSeed() {
// LINE 1
call = false;
// LINE 2
}
public BirdSeed(int numberBags) {
this.numberBags = numberBags;
}
public static void main(String[] args) {
var seed = new BirdSeed();
System.out.print(seed.numberBags);
} }
A. Replace line 1 with BirdSeed(2);.
B. Replace line 2 with BirdSeed(2);.
C. Replace line 1 with new BirdSeed(2);.
D. Replace line 2 with new BirdSeed(2);.
++E. Replace line 1 with this(2);.
F. Replace line 2 with this(2);.//COMPILER ERROR verir
G. The code prints 2 without any changes.

     */


    private int numberBags;
    boolean call;

    public BirdSeed(){
        this(2); //this() constructor caller ,contructorin içinde ilk satırda yer almak zorunda yoksa compiler error verir
        call=false;
    }

    public BirdSeed(int numberBags){
        this.numberBags=numberBags;
    }

    public static void main(String[] args) {
        var seed=new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
