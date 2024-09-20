package questions.chapter14.questions.q22;

public class Q22 {

    /*

22. Which of the following fields will be null after an instance of the class created
on line 17 is serialized and then deserialized using ObjectOutputStream and
ObjectInputStream? (Choose all that apply.)
1: import java.io.Serializable;
2: import java.util.List;
3: public class Zebra implements Serializable {
4: private transient String name = "George";
5: private static String birthPlace = "Africa";
6: private transient Integer age;
7: List<Zebra> friends = new java.util.ArrayList<>();
8: private Object stripes = new Object(); //burada Object tipinde degişkenler serilazable edilemezler bir instance olf
9: { age = 10;}
10: public Zebra() {
11: this.name = "Sophia";
12: }
13: static Zebra writeAndRead(Zebra z) {
14: // Implementation omitted
15: }
16: public static void main(String[] args) {
17: var zebra = new Zebra();
18: zebra = writeAndRead(zebra);
19: }
A. age
B. birthplace
C. friends
D. name
E. stripes
F. The code does not compile.
+++G. The code compiles but throws an exception at runtime

     */

/**burada Object tipinde degişkenler serilazable edilemezler ,transitive de yapılmadıgı için calısma zamanında hata vericektir*/
}