package questions.chapter11.q14;

public class Q14 {

    /*

    14. Assuming -g:vars is used when the code is compiled to include debug information, what is
the output of the following code snippet?
var huey = (String)null;
Integer dewey = null;
Object louie = null;
if(louie == huey.substring(dewey.intValue())) {
System.out.println("Quack!");
}
A. A NullPointerException that does not include any variable names in the stack
trace
B. A NullPointerException naming huey in the stack trace
++C. A NullPointerException naming dewey in the stack trace
D. A NullPointerException naming louie in the stack trace
E. A NullPointerException naming huey and louie in the stack trace
F. A NullPointerException naming huey and dewey in the stack trace
G. None of the above


     */

    public static void main(String[] args) {

        var huey= (String)null;

        Integer dewey =null;
        Object louie=null;

        if(louie==huey.substring(dewey.intValue())){ //burada dewey.intValue() methodunda null pointer exception verir
            System.out.println("Quack!");
        }
    }
}
