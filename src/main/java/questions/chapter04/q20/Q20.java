package questions.chapter04.q20;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Q20 {
    /*
    Note that March 13, 2022 is the weekend that clocks spring ahead for daylight saving time.

What is the output of the following? (Choose all that apply.)
var date = LocalDate.of(2022, Month.MARCH, 13);
var time = LocalTime.of(1, 30);
var zone = ZoneId.of("US/Eastern");
var dateTime1 = ZonedDateTime.of(date, time, zone);
var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
int hour = dateTime2.getHour();
boolean offset = dateTime1.getOffset()
== dateTime2.getOffset();
System.out.println("diff = " + diff);
System.out.println("hour = " + hour);
System.out.println("offset = " + offset);


++A. diff = 1
B. diff = 2
C. hour = 2
++D. hour = 3
E. offset = true
F. The code does not compile.
G. A runtime exception is thrown.
     */
    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime1 = ZonedDateTime.of(date, time, zone);
        var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int hour = dateTime2.getHour();
        boolean offset = dateTime1.getOffset()
                == dateTime2.getOffset();
        System.out.println("diff = " + diff);
        System.out.println("hour = " + hour);
        System.out.println("offset = " + offset);
    }
}
