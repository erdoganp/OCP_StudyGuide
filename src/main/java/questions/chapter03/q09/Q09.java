package questions.chapter03.q09;

public class Q09 {
    /*
Which statements, when inserted independently into the following blank, will cause the code
to print 2 at runtime? (Choose all that apply.)
int count = 0;
BUNNY: for(int row = 1; row <=3; row++)
    RABBIT: for(int col = 0; col <3 ; col++) {
        if((col + row) % 2 == 0)
______________;
count++;
}
System.out.println(count);
A. break BUNNY
++B. break RABBIT
++C. continue BUNNY
D. continue RABBIT
++E. break
F. continue
G. None of the above, as the code contains a compiler error

     */
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
    }

    private static void method1() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break BUNNY;
                count++;
            }
        System.out.println(count);
    }

    private static void method2() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break RABBIT;
                count++;
            }
        System.out.println(count);
    }

    private static void method3() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue BUNNY;
                count++;
            }
        System.out.println(count);
    }

    private static void method4() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue RABBIT;
                count++;
            }
        System.out.println(count);
    }

    private static void method5() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break;
                count++;
            }
        System.out.println(count);
    }

    private static void method6() {

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue;
                count++;
            }
        System.out.println(count);
    }
}
