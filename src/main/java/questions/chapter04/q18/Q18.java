package questions.chapter04.q18;

public class Q18 {
    /*
    What is the result of the following code? (Choose all that apply.)
13: String s1 = """
14: purr""";
15: String s2 = "";
16:
17: s1.toUpperCase();
18: s1.trim();
19: s1.substring(1, 3);
20: s1 += "two";
21:
22: s2 += 2;
23: s2 += 'c';
24: s2 += false;
25:
26: if ( s2 == "2cfalse") System.out.println("==");
27: if ( s2.equals("2cfalse")) System.out.println("equals");
28: System.out.println(s1.length());
A. 2
B. 4
++C. 7
D. 10
E. ==
++F. equals
G. An exception is thrown.
H. The code does not compile.
     */
    public static void main(String[] args) {

        String s1 = """
                    purr""";
        String s2 = "";

        s1.toUpperCase();
        s1.trim();
        s1.substring(1, 3);
        s1 += "two";

        s2 += 2;
        s2 += 'c';
        s2 += false;

         if ( s2 == "2cfalse") System.out.println("==");
         if ( s2.equals("2cfalse")) System.out.println("equals");
         System.out.println(s1.length());
    }
}
