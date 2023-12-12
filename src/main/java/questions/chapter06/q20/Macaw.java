package questions.chapter06.q20;
/*

20. Which statement about the following program is correct?
1: class Bird {
2: int feathers = 0;
3: Bird(int x) { this.feathers = x; }
4: Bird fly() {
5: return new Bird(1);
6: } }
7: class Parrot extends Bird {
8: protected Parrot(int y) { super(y); }
9: protected Parrot fly() {
10: return new Parrot(2);
11: } }
12: public class Macaw extends Parrot {
13: public Macaw(int z) { super(z); }
14: public Macaw fly() {
15: return new Macaw(3);
16: }
17: public static void main(String... sing) {
18: Bird p = new Macaw(4);
19: System.out.print(((Parrot)p.fly()).feathers);
20: } }
A. One line contains a compiler error.
B. Two lines contain compiler errors.
C. Three lines contain compiler errors.
D. The code compiles but throws a ClassCastException at runtime.
+++E. The program compiles and prints 3.
F. The program compiles and prints 0.
 */

class Bird{
    int feathers=0;
    Bird(int x){
        this.feathers=x;

    }
    Bird fly(){
        return new Bird(1);
    }
}

class Parrot extends Bird{
    protected Parrot(int y) {
        super(y);
    }

    protected Parrot fly(){
        return new Parrot(2);
    }
}




public class Macaw extends Parrot {
    public Macaw(int z) {super(z);}
    public Macaw fly(){
        return new Macaw(3);
    }

    public static void main(String[] args) {
            Bird p=new Macaw(4);
        System.out.println(((Parrot)p.fly()).feathers);
    }
}
