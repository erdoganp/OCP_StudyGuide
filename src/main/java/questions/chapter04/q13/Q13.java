package questions.chapter04.q13;

public class Q13 {

    /*
    What is the result of the following code?
public class Lion {
public void roar(String roar1, StringBuilder roar2) {
roar1.concat("!!!");
roar2.append("!!!");
}
public static void main(String[] args) {
var roar1 = "roar";
var roar2 = new StringBuilder("roar");
new Lion().roar(roar1, roar2);
System.out.println(roar1 + " " + roar2);
} }
A. roar roar
++B. roar roar!!!
C. roar!!! roar
D. roar!!! roar!!!
E. An exception is thrown.
F. The code does not compile.
     */

    public static void main(String[] args) {
        var roar1 = "roar";
        var roar2 = new StringBuilder("roar");
        new Q13().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!"); //String sınıfı immutable oldugu için eger tekrar assign edilmezse orginal deger değişmez
        roar2.append("!!!"); //StringBuilder sınıfı mutable dır bu yüzden orginal deger degişir
    }

}
