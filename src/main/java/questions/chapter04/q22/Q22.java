package questions.chapter04.q22;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Q22 {
    /*
    What is the output of the following code?
var date = LocalDate.of(2022, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth()
+ " " + date.getDayOfMonth());

++A. 2022 APRIL 30
B. 2022 MAY 2
C. 2025 APRIL 2
D. 2025 APRIL 30
E. 2025 MAY 2
F. The code does not compile.
G. A runtime exception is thrown.
     */

    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.APRIL, 30);
        date.plusDays(2); //LocalDate sınıfı immutable oldugu için assign edilmesi gerekiyor objeye tekrar degisikliklerin yansıması için
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)->System.out.println(n)
        );


    }
}
