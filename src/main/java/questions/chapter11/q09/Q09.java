package questions.chapter11.q09;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/*

9. For what value of pattern will the following print <005.21> <008.49> <1,234.0>?
String pattern = " ";
var message = DoubleStream.of(5.21, 8.49, 1234)
.mapToObj(v ->
new DecimalFormat(pattern).format(v))
.collect(Collectors.joining("> <"));
System.out.println("<"+message+">");
A. ##.#
B. 0,000.0#
C. #,###.0
++D. #,###,000.0#
E. The code does not compile regardless of what is placed in the blank.
F. None of the above

 */

public class Q09 {

    public static void main(String[] args) {

        String pattern ="#,###,000.0#";
       // String pattern ="0,000.0#";


        var message= DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v-> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));

        System.out.println("<"+ message + ">");

    }
}
