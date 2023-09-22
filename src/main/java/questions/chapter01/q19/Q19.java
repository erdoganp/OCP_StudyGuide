package questions.chapter01.q19;

public class Q19 {
    /*
    Which are true about the following code? (Choose all that apply.)

    ++A. The output is 100.
    B. The output is 200.
    C. The code does not compile.
    ++D. num1 is a primitive.
    E. num2 is a primitive.
    *
    * */

    public static void main(String[] args){

        var num1 = Long.parseLong("100"); //parseLong primitive döner
        var num2 = Long.valueOf("100"); //valueof wrapper döner
        System.out.println(Long.max(num1, num2));

    }

}
