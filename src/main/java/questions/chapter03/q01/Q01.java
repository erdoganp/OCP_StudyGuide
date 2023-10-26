package questions.chapter03.q01;

public class Q01 {
    /*
    1. Which of the following data types can be used in a switch expression? (Choose all
that apply.)
++A. enum
++B. int
++C. Byte
D. long
++E. String
++F. char
++G. var
H. double

     */

    void method1(){

        Season season=Season.SPRING;

        switch (season)
        {
        }

    int i=5;
        switch (i){

        }

    Byte b=34;
        switch (b){

        }

    long l=6;
//        switch (l) { DOES NOT compile
//        }


        String s="";
        switch (s){

        }

        var v=23;
        switch (v){

        }

        double d=34;
//        switch (d){DOES NOT COMPILE
//
//        }

    }





}




enum Season{
    WINTER, SPRING,SUMMER, FALL
}
