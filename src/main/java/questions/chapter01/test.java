package questions.chapter01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class test {

    public  static void main(String[] args){

        Calendar cal=Calendar.getInstance();

        cal=getDate("14-8-2023 15:42");
        //cal=getCurrentDay("WED, 4 Jul 2023 14:56");
        //cal=getCurrentDay("20.04.2023 14:56");
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println((cal.get(Calendar.MONTH))+1);
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24 bazlı saat diliminde saat
        System.out.println(cal.get(Calendar.MINUTE));       //dakika


    }
    public static Calendar getDate(String date) {


        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm",Locale.ENGLISH);
      //  SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm",Locale.ENGLISH);
        try{
            cal.setTime(sdf.parse(date));// all done
        }catch (ParseException parseException){
            parseException.printStackTrace();
        }

       return cal;
    }
}
