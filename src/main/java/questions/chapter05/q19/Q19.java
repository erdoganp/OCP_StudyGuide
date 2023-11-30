package questions.chapter05.q19;

public class Q19 {
    /*
    Which of the following will compile when independently inserted in the following code?
(Choose all that apply.)
A. Insert at line 6: value1 = "green";
++B. Insert at line 6: value2 = "purple";
++C. Insert at line 6: value3 = "orange";
D. Insert at line 9: value1 = "magenta";
++E. Insert at line 9: value2 = "cyan";
F. Insert at line 9: value3 = "turquoise";
     */
    final String value1="red";
    static String value2="blue";
    String value3="yellow";
    {
        value2="purple";
        value3="yellow";
    }
    static {

        value2="cyan";



    }
}
