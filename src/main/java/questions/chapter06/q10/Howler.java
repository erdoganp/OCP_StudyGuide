package questions.chapter06.q10;
/*
10. Which of the following pairs, when inserted into the blanks, allow the code to compile?
(Choose all that apply.)
1: public class Howler {
2: public Howler(long shadow) {
3: ;
4: }
5: private Howler(int moon) {
6: super();
7: }
8: }
9: class Wolf extends Howler {
10: protected Wolf(String stars) {
11: super(2L);
12: }
13: public Wolf() {
14: ;
15: }
16: }
++A. this(3) at line 3, this("") at line 14
B. this() at line 3, super(1) at line 14
++C. this((short)1) at line 3, this(null) at line 14
D. super() at line 3, super() at line 14
E. this(2L) at line 3, super((short)2) at line 14
F. this(5) at line 3, super(null) at line 14
G. Remove lines 3 and 14.

 */


public class Howler {


    public Howler(long shadow){
       this((short)1);
       //this(3)
    }
    private Howler(int moon){
        super();
    }
}

class Wolf extends Howler{
    protected Wolf(String stars){
        super(2L);
    }
    public Wolf(){
        this(null);
        //this("");
    }
}
