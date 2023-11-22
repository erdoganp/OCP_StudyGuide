package questions.chapter04.q14;

import java.time.*;

public class Q014 {
    /*
    Given the following, which can correctly fill in the blank? (Choose all that apply.)
var date = LocalDate.now();
var time = LocalTime.now();
var dateTime = LocalDateTime.now();
var zoneId = ZoneId.systemDefault();
var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
Instant instant = ;
++A. Instant.now()
B. new Instant()
C. date.toInstant()
D. dateTime.toInstant()
E. time.toInstant()
++F. zonedDateTime.toInstant()
     */

    public static void main(String[] args) {
        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant = Instant.now();
        Instant instant1=zonedDateTime.toInstant(); //toInstant methodu sadece ZonedDateTime da vardır

    }
}
