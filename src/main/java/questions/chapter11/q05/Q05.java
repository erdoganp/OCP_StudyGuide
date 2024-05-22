package questions.chapter11.q05;

import java.text.NumberFormat;
import java.util.Locale;

public class Q05 {
    /*

    Assuming the current locale uses dollars ($) and the following method is called with a double
value of 100_102.2, which of the following values are printed? (Choose all that apply.)
public void print(double t) {
System.out.print(NumberFormat.getCompactNumberInstance().format(t));
System.out.print(
NumberFormat.getCompactNumberInstance(
Locale.getDefault(), Style.SHORT).format(t));
System.out.print(NumberFormat.getCurrencyInstance().format(t));
}
A. 100
B. $100,000.00
++C. 100K
D. 100 thousand
E. 100M
++F. $100,102.20
G. None of the above

     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        print(100_102.2);

    }

    public static void print(double t){

        System.out.println(NumberFormat.getCompactNumberInstance().format(t));
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT).format(t));

        System.out.println(NumberFormat.getCurrencyInstance().format(t));

    }

}

