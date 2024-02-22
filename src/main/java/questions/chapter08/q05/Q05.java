package questions.chapter08.q05;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

/*
Which of the following functional interfaces contain an abstract method that returns a primitive
value? (Choose all that apply.)
++A. BooleanSupplier
B. CharSupplier  //bu sekilde bir functional interface yok
++C. DoubleSupplier
D. FloatSupplier  //bu sekilde bir functional interface yok
++E. IntSupplier
F. StringSupplier   //bu sekilde bir functional interface yok

*/

public class Q05 {
    BooleanSupplier b= () ->true;
    DoubleSupplier d =() ->1.0;

    IntSupplier i=() ->1;



}
