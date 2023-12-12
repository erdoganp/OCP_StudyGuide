package questions.chapter06.q23;

/*
1: class Canine {
2: public Canine(boolean t) { logger.append("a"); }
3: public Canine() { logger.append("q"); }
4:
5: private StringBuilder logger = new StringBuilder();
6: protected void print(String v) { logger.append(v); }
7: protected String view() { return logger.toString(); }
8: }
9:
10: class Fox extends Canine {
11: public Fox(long x) { print("p"); }
12: public Fox(String name) {
13: this(2);
14: print("z");
15: }
16: }
17:
18: public class Fennec extends Fox {
19: public Fennec(int e) {
20: super("tails");
21: print("j");
22: }
23: public Fennec(short f) {
24: super("eevee");
25: print("m");
26: }
27:
28: public static void main(String... unused) {
29: System.out.println(new Fennec(1).view());
30: } }

A. qpz
++B. qpzj
C. jzpa
D. apj
E. apjm
F. The code does not compile.
G. None of the above
 */

class Canine {
    public Canine (boolean t) {
        logger.append("a");
    }
    public Canine(){
        logger.append("q");
    }

    private  StringBuilder logger=new StringBuilder();
    protected void print(String v){
        logger.append(v);
    }
    protected String view(){
        return logger.toString();
    }
        }

 class Fox extends Canine{
    public Fox(long x) {
        print("p");
    }
    public Fox(String name){
        this(2);
        print("z");
    }

 }
public class Fennec extends Fox {
    public Fennec(int e){
        super("tails");
        print("j");
    }

    public Fennec(short f){
        super("evee");
        print("m");
    }

    public static void main(String... unused) {
        System.out.println(new Fennec(1).view());

    }
}
