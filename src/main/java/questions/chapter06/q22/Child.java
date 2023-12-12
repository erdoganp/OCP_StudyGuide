package questions.chapter06.q22;

/*

22. What does the following program print?
1: class Person {
2: static String name;
3: void setName(String q) { name = q; } }
4: public class Child extends Person {
5: static String name;
6: void setName(String w) { name = w; }
7: public static void main(String[] p) {
8: final Child m = new Child();
9: final Person t = m;
10: m.name = "Elysia";
11: t.name = "Sophia";
12: m.setName("Webby");
13: t.setName("Olivia");
14: System.out.println(m.name + " " + t.name);
15: } }
A. Elysia Sophia
B. Webby Olivia
C. Olivia Olivia
++D. Olivia Sophia
E. The code does not compile.
F. None of the above
 */
class Person{
    static String name;
    void setName(String q){
        name=q;
    }
}
public class Child extends Person {
    static String name;
    void setName(String w){
        name=w;
    }

    public static void main(String[] args) {
        final Child m=new Child();
        final Person t=m;

        m.name="Eliysia";
        t.name="Sophia";
        m.setName("Webby");
        t.setName("olivia"); //setname override edildiği için child sınıfın name ini değiştirir
        System.out.println(m.name + " "+ t.name);
    }
}
