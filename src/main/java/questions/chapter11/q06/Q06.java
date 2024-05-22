package questions.chapter11.q06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q06 {

    /*

What is the output of the following code?
LocalDate date = LocalDate.parse("2022-04-
30",
DateTimeFormatter.ISO_LOCAL_DATE_TIME);
System.out.println(date.getYear() + " "
+ date.getMonth() + " "+ date.getDayOfMonth());
A. 2022 APRIL 2
B. 2022 APRIL 30
C. 2022 MAY 2
D. The code does not compile.
++E. A runtime exception is thrown.


     */

    public static void main(String[] args) {


        /**LocalDate objesinde DateTimeFormatter kullanamayız eger bu sekilde kullanırsak runtime da hata verir*/
        LocalDate date=LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(date.getYear() + " "+ date.getMonth()+  " " + date.getDayOfMonth());

    }
}
