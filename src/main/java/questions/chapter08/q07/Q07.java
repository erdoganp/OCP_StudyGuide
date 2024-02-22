package questions.chapter08.q07;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
/*

Which of these statements is true about the following code?
public void method() {
x((var x) ->
{}, (var x, var y) ->
false);
}
public void x(Consumer<String> x, BinaryOperator<Boolean> y) {}
A. The code does not compile because of one of the variables named x.
B. The code does not compile because of one of the variables named y.
C. The code does not compile for another reason.
D. The code compiles, and the x in each lambda refers to the same type.
++E. The code compiles, and the x in each lambda refers to a different type.

*/



public class Q07 {

    public void method(){
        x((var x) -> {}, (var x, var y) -> false);
    }


    public void x(Consumer<String> x, BinaryOperator<Boolean> y){

    }
}
