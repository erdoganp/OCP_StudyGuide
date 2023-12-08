package questions.chapter06.q07;

/*

What is the output of the following code?
1: class Arthropod {
2: protected void printName(long input) {
3: System.out.print("Arthropod");
4: }
5: void printName(int input) {
6: System.out.print("Spooky");
7: } }
8: public class Spider extends Arthropod {
9: protected void printName(int input) {
10: System.out.print("Spider");
11: }
12: public static void main(String[] args) {
13: Arthropod a = new Spider();
14: a.printName((short)4);
15: a.printName(4);
16: a.printName(5L);
17: } }

++A. SpiderSpiderArthropod
B. SpiderSpiderSpider
C. SpiderSpookyArthropod
D. SpookySpiderArthropod
E. The code will not compile because of line 5.
F. The code will not compile because of line 9.
G. None of the above

 */

/**
 * burada öncelik Spider sınıfının methodlarındadır..
 * çünkü spider sınıfının nesnesi olusturuluyor.
 * eger spider sınıfında ilgili method bulunmazsa üst sınıfdaki method kullanılır
 *
 */

class Arthropod{
    protected void printName(long input){
        System.out.print("Arthropod");
    }
    void printName(int input){
        System.out.print("Spooky");
    }
//    void printName(short input){
//        System.out.println("Arthapot short");
//    }
}



public class Spider  extends  Arthropod{
    protected void printName(int input){
        System.out.print("Spider");
    }

//    protected void printName(short input){
//        System.out.println("Spider short");
//    }

    public static void main(String[] args) {
        Arthropod a=new Spider();
        a.printName((short)4);
        a.printName(4);
        a.printName(5L);
    }
}
