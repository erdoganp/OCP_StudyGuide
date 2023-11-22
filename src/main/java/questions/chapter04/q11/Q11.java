package questions.chapter04.q11;

import java.time.LocalDate;

public class Q11 {
    /*
    What is the output of the following code?
var date = LocalDate.of(2022, 4, 3);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth()
+ " " + date.getDayOfMonth());
A. 2022 MARCH 4
B. 2022 MARCH 6
C. 2022 APRIL 3
D. 2022 APRIL 5
E. The code does not compile.
F. A runtime exception is thrown.
     */

    public static void main(String[] args) {
        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2);
        //date.plusHours(3);LocalDate sınıfı Hour bilgisi alamaz bundan dolayı hata verecektir
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());
    }
}
