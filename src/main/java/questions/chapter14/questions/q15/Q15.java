package questions.chapter14.questions.q15;

import java.io.File;
import java.nio.file.Path;

public class Q15 {

    /*

    15. Suppose that the working directory is /weather and the absolute path
/weather/winter/snow.dat represents a file that exists within the file system. Which of
the following lines of code create an object that represents the file? (Choose all that apply.)
A. new File("/weather", "winter", "snow.dat")
++B. new File("/weather/winter/snow.dat")
C. new File("/weather/winter", new File("snow.dat"))
D. new File("weather", "/winter/snow.dat")
++E. new File(new File("/weather/winter"), "snow.dat")
++F. Path.of("/weather/winter/snow.dat").toFile();
G. None of the above

     */

    public static void main(String[] args) {
        //new File("weather" ,"winter", "snow.dat") //bu sekilde bir constructor yoktur
        new File("weather/winter/snow.dat");
        //new File("weather/winter", new File("snow.dat")) //once obje yaratılmalı sonra string ifade almalı
        new File("weather", "/winter/snow.dat"); //burada ifade compile olur fakat weather in basında / olmadıgı için absoulte path i temsil etmez

        new File(new File("/weather/winter"), "snow.dat");
        Path.of("/weather/winter/snow.dat").toFile();

    }
}
