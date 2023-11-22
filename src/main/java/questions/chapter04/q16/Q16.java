package questions.chapter04.q16;

public class Q16 {
    /*
    What is included in the output of the following code? (Choose all that apply.)
var base = "ewe\nsheep\\t";
int length = base.length();
int indent = base.indent(2).length();
int translate = base.translateEscapes().length();
var formatted = "%s %s %s".formatted(length, indent, translate);
System.out.format(formatted);
++A. 10
++B. 11
C. 12
D. 13
E. 14
F. 15
++G. 16

     */
    public static void main(String[] args) {

        var base = "ewe\nsheep\\t";
        int length = base.length(); //11
        int indent = base.indent(2).length();//16 herbir satıra 2 bosluk ekliyor ve son satırın sonunda /n yoksa /n ekliyor. 4+1
        int translate = base.translateEscapes().length();//10
        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);
    }
}
