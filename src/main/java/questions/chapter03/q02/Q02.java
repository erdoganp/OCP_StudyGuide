package questions.chapter03.q02;

public class Q02 {
    /*
    2. What is the output of the following code snippet? (Choose all that apply.)
3: int temperature = 4;
4: long humidity = -temperature
+ temperature * 3;
5: if (temperature>=4)
6: if (humidity < 6) System.out.println("Too Low");
7: else System.out.println("Just Right");
8: else System.out.println("Too High");

A. Too Low
++B. Just Right
C. Too High
D. A NullPointerException is thrown at runtime.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.
     */

    public static void main(String[] args){

        int temperature=4;
        long humidity= -temperature + temperature * 3;
        if(temperature >=4)
        if (humidity<6) System.out.println("too low");
        else System.out.println("just right");
        else System.out.println("too high");

    }


}
