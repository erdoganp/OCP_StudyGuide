package questions.chapter13.questions.q18;

import java.util.concurrent.Callable;

public class Q18 {

    /*

    18. Which of the following are valid Callable expressions? (Choose all that apply.)
A. a ->{return 10;}
B. () ->{String s = "";}
++C. () ->5
D. () ->{return null}
++E. () ->"The" + "Zoo"
F. (int count) ->count+1
++G. () -> {System.out.println("Giraffe"); return 10;}
     */

    public static void main(String[] args) {

        /**Callable interface i parametre almaz*/
       /* Callable optionA= a ->{
            return 10;
        };
        */

        /**geriye deger donmemis*/
        /*
        Callable optionB = () ->{
            String s=" ";
        };
    */

        Callable optionC= () ->5;

 /**noktalı virgül kulllanılmams*/
        /*
        Callable optionD=() ->{
            return  null
        };
*/

        Callable optionE= () ->"The"  +" Zoo";

    /*
    Callable optionF=(int count) ->count +1


    */


    Callable optionG= () ->{
        System.out.println("Giraffe");
        return 10;
    };
    }


}
