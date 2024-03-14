package questions.chapter09.q16;
/*
16. What is the result of the following code?
4: Map m = new HashMap();
5: m.put(123, "456");
6: m.put("abc", "def");
7: System.out.println(m.contains("123"));
A. false
B. true
C. Compiler error on line 4
D. Compiler error on line 5
++E. Compiler error on line 7
F. A runtime exception is thrown.

 */

import java.util.HashMap;
import java.util.Map;

public class Q16 {
    public static void main(String[] args) {


        Map m=new HashMap();
        m.put(123,"456");
        m.put("abc","def");
        //System.out.println(m.contains("123"));//contains diye bir method yoktur map de containsKey veya containsValue kullanılır

    }
}
