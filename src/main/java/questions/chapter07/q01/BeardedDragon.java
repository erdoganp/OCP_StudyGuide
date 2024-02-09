package questions.chapter07.q01;
/*

The answers to the chapter review questions can be found in the Appendix.
1. Which of the following are valid record declarations? (Choose all that apply.)
public record Iguana(int age) {
private static final int age = 10; }

public final record Gecko() {}

public abstract record Chameleon() {
private static String name; }

public record BeardedDragon(boolean fun) {
@Override public boolean fun() { return false; } }

public record Newt(long size) {
@Override public boolean equals(Object obj) { return false; }
public void setSize(long size) {
this.size = size;
} }
A. Iguana
++B. Gecko
C. Chameleon
++D. BeardedDragon
E. Newt
F. None of the above

 */
public record BeardedDragon(boolean fun) { //dogru bir kullanım problem yok
    @Override
    public boolean fun(){
        return false;
    }
}
