package questions.chapter03.q08;

public class Q08 {
    /*
    8. What is the output of calling printType(11)?
31: void printType(Object o) {
32: if(o instanceof Integer bat) {
33: System.out.print("int");
34: } else if(o instanceof Integer bat && bat < 10) {
35: System.out.print("small int");
36: } else if(o instanceof Long bat || bat <= 20) {
37: System.out.print("long");
38: } default {
39: System.out.print("unknown");
40: }
41: }

A. int
B. small int
C. long
D. unknown
E. Nothing is printed.
F. The code contains one line that does not compile.
++G. The code contains two lines that do not compile.
H. None of the above
     */

void printType(Object o){

    if(o instanceof Integer bat){
        System.out.println("int");
    } else if (o instanceof Integer bat && bat< 10) {
        System.out.println("small int");
    }
//    } else if (o instanceof Long bat || bat <=20) { //veya kullanıldıgında derleme hatası verir
//        System.out.println("long");
//
//    }default{ //if de default kullanılmaz
//        System.out.println("unknown");
//    }
}

}
