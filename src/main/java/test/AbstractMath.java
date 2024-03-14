package test;

import java.util.function.Consumer;
import java.util.function.Function;

public class AbstractMath extends DifferantialMath{


    public static void main(String[] args) {
        FunctionalMath m=new FunctionalMath();
        System.out.println(m.secret);

        Consumer<String> c= (t) ->{System.out.println(t);} ;

        Function<Integer,Integer> d=(x) -> x++;

    }

}
