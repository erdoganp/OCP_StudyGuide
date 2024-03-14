package questions.chapter09.q07;

import java.util.ArrayList;
import java.util.List;

/*
7. Which of the following method signatures are valid overrides of the hairy() method in the
Alpaca class? (Choose all that apply.)
import java.util.*;
public class Alpaca {
public List<String> hairy(List<String> list) { return null; }
}
A. public List<String> hairy(List<CharSequence> list) { return null; }
++B. public List<String> hairy(List<String> list) { return null; }
C. public List<String> hairy(List<Integer> list) { return null; }
D. public List<CharSequence> hairy(List<String> list) { return null; }
E. public Object hairy(List<String> list) { return null; }
++F. public ArrayList<String> hairy(List<String> list) { return null; }

 */

/**
 * Override kurallar
 * Method imzası aynı olmalı yani ismi,aldıgı parametre sayısı aynı olmalı
 * Donus tipi coveriant olmalı yani subclass olabilir
 *
 * */
public class Alpaca {

    public List<String> hairly(List<String> list){
        return null;

    }


}
 /**charsequence Stringin parenti oldugu iiçin overrride işlemi olmaz compile error verir*/
class A extends Alpaca{
//    public List<String> hairly(List<CharSequence> list){
//        return null;
//    }
}

class B extends Alpaca{

//    public List<String> hairly(ArrayList<String> list){ //bu sekilde olursa overloaded olur
//        return null;
//    }

    @Override
    public List<String> hairly(List<String> list){
        return null;
    }
}

class C extends Alpaca{
/**COMPILE ERROR verir cunku Integer almıs*/
    //    public List<String> hairly(List<Integer> list){
//        return null;
//    }
}

class D extends Alpaca{
    /**Charsequence return type i compile error verir Coveriant değil*/
//    public List<CharSequence> hairly(List<String> list){
//        return null;
//    }
}

class E extends Alpaca{

    /**Object tipi compile error verir Coveriant deegil*/
//    public Object hairly(List<String> list) {
//        return null;
//    }
}

class F extends Alpaca{
    @Override
    public ArrayList<String> hairly(List<String> list){
        return null;
    }
}
