package questions.chapter04.q03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q03 {

    /*
    Note that March 13, 2022 is the weekend when we spring forward, and November 6, 2022
is when we fall back for daylight saving time. Which of the following can fill in the blank
without the code throwing an exception? (Choose all that apply.)
var zone = ZoneId.of("US/Eastern");
var date = ;
var time = LocalTime.of(2, 15);
var z = ZonedDateTime.of(date, time, zone);
++A. LocalDate.of(2022, 3, 13)
B. LocalDate.of(2022, 3, 40)
++C. LocalDate.of(2022, 11, 6)
++D. LocalDate.of(2022, 11, 7)
E. LocalDate.of(2023, 2, 29)//2023 leap year olmadıgı için 29 kullanılamaz
F. LocalDate.of(2022, MonthEnum.MARCH, 13);

     */

    public static void main(String[] args) {

       // method1();
       // method2();
      //  method3();
       // method4();
        method5();
        method6();

    }

    public static void method1(){
        var zone= ZoneId.of("US/Eastern");
        var date= LocalDate.of(2022, 3, 13);
        var time = LocalTime.of(2,15);
        var z= ZonedDateTime.of(date,time,zone);
        System.out.println(z);
    }
    public static void method2(){
        var zone= ZoneId.of("US/Eastern");
        var date= LocalDate.of(2022, 3, 40);
        var time = LocalTime.of(2,15);
        var z= ZonedDateTime.of(date,time,zone);
        System.out.println(z);
    }
    public static void method3(){
        var zone= ZoneId.of("US/Eastern");
        var date= LocalDate.of(2022, 11, 6);
        var time = LocalTime.of(2,15);
        var z= ZonedDateTime.of(date,time,zone);
        System.out.println(z);
    }
    public static void method4(){
        var zone= ZoneId.of("US/Eastern");
        var date= LocalDate.of(2022, 11, 7);
        var time = LocalTime.of(2,15);
        var z= ZonedDateTime.of(date,time,zone);
        System.out.println(z);
    }
    public static void method5(){
        var zone= ZoneId.of("US/Eastern");
        var date= LocalDate.of(2023, 2, 29);
        var time = LocalTime.of(2,15);
        var z= ZonedDateTime.of(date,time,zone);
        System.out.println(z);
    }
    public static void method6(){
        var zone= ZoneId.of("US/Eastern");
    //    var date= LocalDate.of(2022, MonthEnum.MARCH, 13);Month.MARCH olmak zorunda
        var time = LocalTime.of(2,15);
      //  var z= ZonedDateTime.of(date,time,zone);
     //   System.out.println(z);
    }

}
