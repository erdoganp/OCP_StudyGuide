package questions.chapter11.q22;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q22 {
    /*
    22. What is the output of the following code?
try {
LocalDateTime book = LocalDateTime.of(2022, 4, 5, 12, 30, 20);
System.out.print(book.format(DateTimeFormatter.ofPattern("m")));
System.out.print(book.format(DateTimeFormatter.ofPattern("z")));
System.out.print(DateTimeFormatter.ofPattern("y").format(book));
} catch (Throwable e) {}
A. 4
++B. 30
C. 402
D. 3002
E. 3002022
F. 402022
G. None of the above

     */

    public static void main(String[] args) {

        try{
            LocalDateTime book = LocalDateTime.of(2022, 6, 5, 12, 40, 20);
           System.out.print(book.format(DateTimeFormatter.ofPattern("m"))); //minutes  e karsılık geliyor
            System.out.print(book.format(DateTimeFormatter.ofPattern("z"))); //Date time da zone bilgisi olmadıgı içn hata verir ve kod orda catch e duser
            System.out.print(DateTimeFormatter.ofPattern("y").format(book));


        }catch (Throwable e){

        }
    }
}
