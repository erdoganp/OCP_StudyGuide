package questions.chapter07.q16;

/*
The following code appears in a file named Ostrich.java. What is the result of compiling
the source file?
1: public class Ostrich {
2: private int count;
3: static class OstrichWrangler {
4: public int stampede() {
5: return count;
6: } } }
A. The code compiles successfully, and one bytecode file is generated: Ostrich.class.
B. The code compiles successfully, and two bytecode files are generated: Ostrich.class
and OstrichWrangler.class.
C. The code compiles successfully, and two bytecode files are generated: Ostrich.class
and Ostrich$OstrichWrangler.class.
D. A compiler error occurs on line 3.
++E. A compiler error occurs on line 5.


*/

public class Ostrict {
    private int count;



    static class OstrictWragler{

    /**
     * buradaki problem static bir inner sınıf static olmayan bir instance variable a erisemez.
     * COMPILE ERROR verir.
     * */
//        public int stampede(){
//            return count;
//        }
    }
}
