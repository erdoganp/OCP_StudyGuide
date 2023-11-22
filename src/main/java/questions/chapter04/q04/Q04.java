package questions.chapter04.q04;

public class Q04 {
    /*
    4. Which of the following are output by this code? (Choose all that apply.)
3: var s = "Hello";
4: var t = new String(s);
++5: if ("Hello".equals(s)) System.out.println("one");
6: if (t == s) System.out.println("two");
++7: if (t.intern() == s) System.out.println("three");
++8: if ("Hello" == s) System.out.println("four");
9: if ("Hello".intern() == t) System.out.println("five");
++A. one
B. two
++C. three
++D. four
E. five
F. The code does not compile.
G. None of the above
     */

    public static void main(String[] args) {
        var s="Hello";
        var t=new String(s);
        if("Hello".equals(s)) System.out.println("one");
        if(t==s) System.out.println("two");
        if(t.intern()==s) System.out.println("three");
        if("Hello" ==s) System.out.println("four");
        if("Hello".intern() == t) System.out.println("five");
    }
}
