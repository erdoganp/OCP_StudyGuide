package questions.chapter05.q20;

public class Run {
    /*

    ++A. The code prints out 2-4-.
    B. The code prints out 3-4-.
    C. The code prints out 4-2-.
    D. The code prints out 4-4-.
    E. The code prints 3-4-if you remove the method static void execute(int num).
    F. The code prints 4-4-ifyou remove the method static void execute(int num).
     */

    static void execute() {
        System.out.print("1-");
    }
    static void execute(int num) {
        System.out.print("2-");
    }
    static void execute(Integer num) {
        System.out.print("3-");
    }
    static void execute(Object num) {
        System.out.print("4-");
    }
    static void execute(int... nums) {
        System.out.print("5-");
    }
    public static void main(String[] args) {
        Run.execute(100);
        Run.execute(100L);
    }
}
