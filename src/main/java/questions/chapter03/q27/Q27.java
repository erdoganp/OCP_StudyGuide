package questions.chapter03.q27;

public class Q27 {
    /*
    27. What is printed by the following code snippet?
23: byte amphibian = 1;
24: String name = "Frog";
25: String color = switch(amphibian) {
26: case 1 ->
{ yield "Red"; }
27: case 2 ->
{ if(name.equals("Frog")) yield "Green"; }
28: case 3 ->
{ yield "Purple"; }
29: default ->
throw new RuntimeException();
30: };
31: System.out.print(color);

A. Red
B. Green
C. Purple
D. RedPurple
E. An exception is thrown at runtime.
++F. The code does not compile.
     */
    public static void main(String[] args) {
        byte amphibian=1;
        String name="Frog";
//        String color=switch (amphibian){
//            case 1 ->{yield "Red";}
//            case 2 ->{if(name.equals("Frog")) yield "Green";} //if kullanıldıgı için case içerisinde else de kullanılmak zorunda yield ile deger dönmeli
//            case 3 ->{yield "Purple";}
//            default -> throw new RuntimeException();
//        };
    }
}
