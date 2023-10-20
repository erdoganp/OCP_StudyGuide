package questions.chapter02.q09;

public class Q09 {
   /* What are the unique outputs of the following code snippet? (Choose all that apply.)
    int a = 2, b = 4, c = 2;
    System.out.println(a > 2 ? --c: b++);
    System.out.println(b = (a!=c ? a : b++));
    System.out.println(a > b ? b < c ? b : 2 : 1);
  ++ A. 1
    B. 2
    C. 3
    D. 4
    E. 5
    F. 6
    G. The code does not compile.*/

    public static void main(String[] args){
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c: b++); //4
        System.out.println(b = (a!=c ? a : b++)); //5
        System.out.println(a > b ? b < c ? b : 2 : 1);//1

        int x=5;

        x=x++; //post decreament veya post increament da değer dönmediği için assign yapıldıgında aynı deger doner.




    }
}
