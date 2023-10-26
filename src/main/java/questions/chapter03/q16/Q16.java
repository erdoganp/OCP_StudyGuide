package questions.chapter03.q16;

public class Q16 {

    /*
    Given the following array, which code snippets print the elements in reverse order from how
they are declared? (Choose all that apply.)
char[] wolf = {'W', 'e', 'b', 'b', 'y'};
++A.int q = wolf.length;
for( ; ; ) {
System.out.print(wolf[--q]);
if(q==0) break;
}
++B.for(int m=wolf.length-1;m>=0; --m)
System.out.print(wolf[m]);
C.
for(int z=0; z<wolf.length; z++)
System.out.print(wolf[wolf.length-z]);
++D.
int x = wolf.length-1;
for(int j=0; x>=0 && j==0; x--)
System.out.print(wolf[x]);
E.
final int r = wolf.length;
for(int w = r-1;r>-1;w = r-1)
System.out.print(wolf[w]);
F.
for(int i=wolf.length; i>0; --i)
System.out.print(wolf[i]);
G. None of the above

     */
    public static void main(String[] args) {

        int participants = 4, animals = 2, performers = -1;
        while((participants = participants+1) < 10) {}
        do {} while (animals++ <= 1);
        for( ; performers<2; performers+=2) {}
        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);

        method1();
        System.out.println();

        method2();
        System.out.println();

        // method3();
        // System.out.println();

        method4();
        System.out.println();

        // method5(); // Infinite Loop
        // System.out.println();

        // method6(); //ArrayIndexOutOfBoundsException
        System.out.println();
    }

    private static void method1() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};

        int q = wolf.length;
        for (; ; ) {
            System.out.print(wolf[--q]);
            if (q == 0) break;
        }
    }

    private static void method2() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int m = wolf.length - 1; m >= 0; --m)
            System.out.print(wolf[m]);
    }

    private static void method3() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int z = 0; z < wolf.length; z++)
            System.out.print(wolf[wolf.length - z]); // ArrayIndexOutOfBoundsException
    }


    private static void method4() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--)
            System.out.print(wolf[x]);
    }

    private static void method5() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        final int r = wolf.length;
        for (int w = r - 1; r > -1; w = r - 1)
            System.out.print(wolf[w]);
    }

    private static void method6() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int i = wolf.length; i > 0; --i)
            System.out.print(wolf[i]);
    }
}
