package questions.chapter09.q18;

public class Q18 {

    /*

    What code change is needed to make the method compile, assuming there is no
class named T?
public static T identity(T t) {
return t;
}
A. Add <T> after the public keyword.
++B. Add <T> after the static keyword.
C. Add <T> after T.
D. Add <?> after the public keyword.
E. Add <?> after the static keyword.
F. No change is required. The code already compiles.

     */

    public static <T> T identity(T t){
        return t;
    }
}
