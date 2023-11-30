package questions.chapter05.q18;

public class StringBuilders {

    /*
    A. s1 = a
    ++B. s1 = s1
    C. s2 = s2
   ++ D. s2 = s2b
   ++ E. s3 = a
    F. The code does not compile.
     */
    public static StringBuilder work(StringBuilder a,StringBuilder b){
        a=new StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        var s1=new StringBuilder("s1");
        var s2=new StringBuilder("s2");
        var s3=work(s1,s2);
        System.out.println("s1 = " + s1); //pass by value mekanıizmazı ile çalısır orginal deger değiştirmez s1=s1
        System.out.println("s2 = "+ s2);
        System.out.println("s3 = " + s3);
    }
}
