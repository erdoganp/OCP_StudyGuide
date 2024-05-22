package questions.chapter11.q15;

public class Q15 {

    /*

    15. Which of the following, when inserted independently in the blank, use locale parameters that
are properly formatted? (Choose all that apply.)
import java.util.Locale;
public class ReadMap implements AutoCloseable {
private Locale locale;
private boolean closed = false;
@Override public void close() {
System.out.println("Folding map");
locale = null;
closed = true;
}
public void open() {
this.locale =_____________________ ;
}
public void use() {
// Implementation omitted
}
}
A. new Locale("xM") //yanlıs, dil kucuk olmalı
B. new Locale("MQ", "ks") //yanlıs,dil kucuk ,region buyuk olmalı
++C. new Locale("qw") // dogru
++D. new Locale("wp", "VW") //dogru
E. Locale.create("zp") // create dye bir method yoktur
F. new Locale.Builder().setLanguage("yw").setRegion("PM") //.build() methodu eksik bırakılmıs
G. The code does not compile regardless of what is placed in the blank.

     */
}
