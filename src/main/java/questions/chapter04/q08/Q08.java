package questions.chapter04.q08;

public class Q08 {
    /*
    Which of the following return 5 when run independently? (Choose all that apply.)
var string = "12345";
var builder = new StringBuilder("12345");
++A. builder.charAt(4)
++B. builder.replace(2, 4, "6").charAt(3)
C. builder.replace(2, 5, "6").charAt(2)
D. string.charAt(5)
E. string.length
++F. string.replace("123", "1").charAt(2)
G. None of the above
     */

    public static void main(String[] args) {
        var string="12345";
        var builder=new StringBuilder("12345");

        System.out.println(builder.charAt(4));
        System.out.println(builder.replace(2,4,"6").charAt(3));
        System.out.println(builder.replace(2,5,"6").charAt(2));
       // System.out.println(string.charAt(5));
       // string.length;
        System.out.println(string.replace("123","1").charAt(2));

    }
}
