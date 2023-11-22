package questions.chapter04.q19;

import java.util.Arrays;

public class Q19 {
    /*
    Which of the following fill in the blank to print a positive integer? (Choose all that apply.)
String[] s1 = { "Camel", "Peacock", "Llama"};
String[] s2 = { "Camel", "Llama", "Peacock"};
String[] s3 = { "Camel"};
String[] s4 = { "Camel", null};
System.out.println(Arrays. );

++A. compare(s1, s2)
++B. mismatch(s1, s2)
C. compare(s3, s4)
++D. mismatch (s3, s4)
E. compare(s4, s4)
F. mismatch (s4, s4)
     */
    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        System.out.println(Arrays.compare(s1, s2) );
        System.out.println(Arrays.mismatch(s1, s2) );
        System.out.println(Arrays.compare(s3, s4) );
        System.out.println(Arrays.mismatch (s3, s4) );
        System.out.println(Arrays.compare(s4, s4) );
        System.out.println(Arrays.mismatch (s4, s4) );

    }
}
