package questions.chapter11.q25;

import java.text.NumberFormat;
import java.util.Locale;

public record Wallet(double money) {
    /*

    25. Assuming U.S. currency is in dollars ($) and German currency is in euros (€), what is the
output of the following program?
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;
public record Wallet(double money) {
private String openWallet() {
Locale.setDefault(Category.DISPLAY,
new Locale.Builder().setRegion("us").build());
Locale.setDefault(Category.FORMAT,
new Locale.Builder().setLanguage("en").build());
return NumberFormat.getCurrencyInstance(Locale.GERMANY)
.format(money);
}
public void printBalance() {
System.out.println(openWallet());
}
public static void main(String... unused) {
new Wallet(2.4).printBalance();
} }
++A. 2,40 €
B. $2.40
C. 2.4
D. The code does not compile.
E. None of the above

     */

    private String openWallet(){
        Locale.setDefault(Locale.Category.DISPLAY,new Locale.Builder().setRegion("us").build());

        Locale.setDefault(Locale.Category.FORMAT, new Locale.Builder().setLanguage("en").build());

        return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money);
    }

    public void printBalance(){
        System.out.println(openWallet());
    }

    public static void main(String[] args) {
        new Wallet(2.4).printBalance();
    }
}
