package questions.chapter12.q09;

public class Q09 {

    /*

    9. Suppose you are creating a service provider that contains the following class. Which line of
code needs to be in your module-info.
java?
package dragon;
import magic.*;
public class Dragon implements Magic {
public String getPower() {
return "breathe fire";
}
}
A. provides dragon.Dragon by magic.Magic;
B. provides dragon.Dragon using magic.Magic;
C. provides dragon.Dragon with magic.Magic;
D. provides magic.Magic by dragon.Dragon;
E. provides magic.Magic using dragon.Dragon;
++F. provides magic.Magic with dragon.Dragon;


     */

    /**
     * Kurallar
     * 1)provides ...with...seklinde kullanılır
     * 2)provides den sonra interface gelir
     * */
}
