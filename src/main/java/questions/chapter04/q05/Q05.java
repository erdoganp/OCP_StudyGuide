package questions.chapter04.q05;

public class Q05 {
    /*
   What is the result of the following code?
 var sb = new StringBuilder();
 sb.append("aaa").insert(1, "bb").insert(4, "ccc");
 System.out.println(sb);
A. abbaaccc
++B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An empty line
F. The code does not compile.
     */

    public static void main(String[] args) {
        var sb=new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);
    }
}
