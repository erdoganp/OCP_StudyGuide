package questions.chapter11.q16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q16 {
    /*

    16. Which of the following can be inserted into the blank to allow the code to compile and run
without throwing an exception? (Choose all that apply.)
var f = DateTimeFormatter.ofPattern("hh o'clock");
System.out.println(f.format( .now()));
A. ZonedDateTime
B. LocalDate
C. LocalDateTime
D. LocalTime
E. The code does not compile regardless of what is placed in the blank.
++F. None of the above

     */

    public static void main(String[] args) {

        /**bu sekilde kod hata verir runtime da cunku pattern olarak yazdıgımız ifade de ozel karakterler dısındakiler
         * tek tırnak ile baslatılmalı ve bitirilmelidir*/
        //var f = DateTimeFormatter.ofPattern("hh o'clock " );
        var fOlmasıGereken = DateTimeFormatter.ofPattern("hh' o''clock'");
        System.out.println(fOlmasıGereken.format(ZonedDateTime.now()));
//        System.out.println(f.format(LocalDateTime.now()));
//        System.out.println(f.format(LocalTime.now()));
//        System.out.println(f.format(LocalDate.now()));



    }
}
