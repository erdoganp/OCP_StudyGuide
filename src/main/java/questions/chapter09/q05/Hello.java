package questions.chapter09.q05;
/*
What is the result of the following code?
1: public record Hello<T>(T t) {
2: public Hello(T t) { this.t = t; }
3: private <T> void println(T message) {
4: System.out.print(t + "-"
+ message);
5: }
6: public static void main(String[] args) {
7: new Hello<String>("hi").println(1);
8: new Hello("hola").println(true);
9: } }
A. hi followed by a runtime exception
++B. hi-1hola-true
C. The first compiler error is on line 1.
D. The first compiler error is on line 3.
E. The first compiler error is on line 8.
F. The first compiler error is on another line.

 */
/**
 * eger methodda <T> olarak tanımlama yapıldıysa ustteki tipden bagımsız harekket eder
 * */

public record Hello<T> (T t) {
    public Hello(T t) {
        this.t=t;
    }
    private <T> void println(T message){
        System.out.println(t + "-" + message);
    }

    public static void main(String[] args) {
        new Hello<String>("hi").println(1); //Hello recordu String tipnde fakat println methodu integer tipinde sorun yok
        new Hello("hola").println(true); //Hello recordu String tipinde fakat println methodu boolean tipinde burada da sorun yok
    }
}
