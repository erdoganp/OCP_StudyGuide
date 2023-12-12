package questions.chapter06.q11;
/*
11. What is the result of the following?
1: public class PolarBear {
2: StringBuilder value = new StringBuilder("t");
3: { value.append("a"); }
4: { value.append("c"); }
5: private PolarBear() {
6: value.append("b");
7: }
8: public PolarBear(String s) {
9: this();
10: value.append(s);
11: }
12: public PolarBear(CharSequence p) {
13: value.append(p);
14: }
15: public static void main(String[] args) {
16: Object bear = new PolarBear();
17: bear = new PolarBear("f");
18: System.out.println(((PolarBear)bear).value);
19: } }
A. tacb
B. tacf
++C. tacbf
D. tcafb
E. taftacb
F. The code does not compile.
G. An exception is thrown.
 */

public class PolarBear {
    StringBuilder value=new StringBuilder("t");
    {
        value.append("a");
    }
    {
        value.append("c");
    }

    private PolarBear(){
        value.append("b");
    }
    public PolarBear(String s){
        this();
        value.append(s);
    }
    public PolarBear(CharSequence p){
        value.append(p);
    }

    public static void main(String[] args) {
        Object bear=new PolarBear();
        bear =new PolarBear("f");
        System.out.println(((PolarBear)bear).value);
    }
}
