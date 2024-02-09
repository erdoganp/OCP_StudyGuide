package questions.chapter07.q18;
/*

What is printed by the following program?
public class Deer {
enum Food {APPLES, BERRIES, GRASS}
protected class Diet {
private Food getFavorite() {
return Food.BERRIES;
}
}
public static void main(String[] seasons) {
System.out.print(switch(new Diet().getFavorite()) {
case APPLES ->
"a";
case BERRIES ->
"b";
default ->
"c";
});
} }
A. a
B. b
C. c
D. The code declaration of the Diet class does not compile.
++E. The main() method does not compile.
F. The code compiles but produces an exception at runtime.
G. None of the above

* */

public class Deer {
    enum Food{
        APPLES,BERRIES,GRASS
    }

    protected class Diet{
        private Food getFavorite(){
            return Food.BERRIES;
        }
    }


    /**
     * Burada problem new Diet ile diet objesi olusturulmaya calısılıyor fakat bu bir innerclass  bundan dolayı
     * ONCE Deer objesi olusturulacak ki daha sonra new Diet denilebilsin
     * */
    public static void main(String[] args) {
//        System.out.println(switch (new Diet().getFavorite()){  //new Deer().new Diet().getFavorite() denilmesi gerekiyor
//            case APPLES -> "a";
//            case BERRIES -> "b";
//            default -> "c";
//
//        };
    }
}
