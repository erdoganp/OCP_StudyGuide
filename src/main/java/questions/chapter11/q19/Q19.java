package questions.chapter11.q19;

public class Q19 {

    /*

    19. Suppose that we have the following three properties files and code. Which bundles are used
on lines 8 and 9, respectively?
Dolphins.properties
name=The Dolphin
age=0

Dolphins_en.properties
name=Dolly
age=4

Dolphins_fr.properties
name=Dolly
5: var fr = new Locale("fr");
6: Locale.setDefault(new Locale("en", "US"));
7: var b = ResourceBundle.getBundle("Dolphins", fr);
8: b.getString("name");
9: b.getString("age");
A. Dolphins.properties and Dolphins.properties
B. Dolphins.properties and Dolphins_en.properties
C. Dolphins_en.properties and Dolphins_en.properties
++D. Dolphins_fr.properties and Dolphins.properties //once Dolphins_fr kullanılır daha sonra burada age i bulamadıgı için fr atılır ve Dolphins.properites kullanılır
E. Dolphins_fr.properties and Dolphins_en.properties
F. The code does not compile.
G. None of the above


     */
/***
 * once Dolphins_fr kullanılır daha sonra burada age i bulamadıgı için fr atılır ve Dolphins.properites kullanılır
 * eger Dolphins.properties de age bilgisi olmasaydı default olarak tanıtılan Dolphins_en.properties kullanılacaktı
 *
 */


}
