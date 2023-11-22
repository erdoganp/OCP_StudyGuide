package questions.chapter04.q21;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Q21 {
    /*
    Which of the following can fill in the blank to print avaJ? (Choose all that apply.)
    var puzzle = new StringBuilder("Java");
    puzzle. ;
    System.out.println(puzzle);

++A. reverse()
B. append("vaJ$").substring(0, 4)
++C. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() -1)
D. append("vaJ$").
     */
    public static void main(String[] args) {

      method1();
      method2();
      method3();
      method4();


    }

    public static void method1(){
        var puzzle=new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);
    }
    public static void method2(){
        var puzzle=new StringBuilder("Java");
        puzzle.append("vaJ$").substring(0, 4);
        System.out.println(puzzle);
    }
    public static void method3(){
        var puzzle=new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() -1);
        System.out.println(puzzle);
    }
    public static void method4(){
        var puzzle=new StringBuilder("Java");
        puzzle.append("vaJ$");
        System.out.println(puzzle);
    }
}
