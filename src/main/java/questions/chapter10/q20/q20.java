package questions.chapter10.q20;

import javax.swing.plaf.OptionPaneUI;
import javax.swing.text.html.Option;
import java.util.Optional;

public class q20 {

    /*

    20. Which of the following throw an exception when an Optional is empty? (Choose all
that apply.)
A. opt.orElse("");
B. opt.orElseGet(() ->"");
++C. opt.orElseThrow();
D. opt.orElseThrow(() ->throw new Exception());
++E. opt.orElseThrow(RuntimeException::new);
++F. opt.get();
G. opt.get("");


     */



    public static void main(String[] args) {

    }

    private static void optionA(){

        Optional<String> opt =Optional.empty();
        opt.orElse(""); //exception fırlatmaz "" doner
    }

    private static void optionalB(){
        Optional<String> opt= Optional.empty();
        opt.orElseGet(()->""); // exception fırlatmaz "" doner

    }

    private static void  optionalC(){
        Optional<String> opt = Optional.empty();
        opt.orElseThrow(); //dogru kullanım ,Exception fırlatır
    }

    private static void optionalD(){

        Optional<String> opt= Optional.empty();
        //opt.orElseThrow(()->throw new Exception()); orElseThrow methodunda throw anahtar kelimesi ile supplier verilmez

    }

    private static void optionalE(){
        Optional<String> opt=Optional.empty();
        opt.orElseThrow(RuntimeException::new); //dogru kullanım Exception fırlatır

    }

    private static void optionalF(){
        Optional<String> opt=Optional.empty();
        opt.get(); //dogru kullanım exception fırlatır

    }

    private static void optionalG(){
        Optional<String> opt=Optional.empty();
        //opt.get("");get methodu parametre almaz
    }
}
