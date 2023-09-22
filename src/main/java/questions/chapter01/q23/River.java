package questions.chapter01.q23;

public class River {
    /*
    Which statements about the following class are true? (Choose all that apply.)
++A. Line 3 generates a compiler error.
++B. Line 6 generates a compiler error.
C. Line 7 generates a compiler error.
++D. Line 10 generates a compiler error.
E. The program prints 3 on line 10.
F. The program prints 4 on line 10.
G. The program prints 50.0 on line 11.
H. The program prints 49.0 on line 11.
    * */

int Depth=1;
//float temp=50.0;

public void flow(){
    for (int i=0;i<1;i++){
        int depth=2;
        depth++;
      //  temp --;
}

    //System.out.println(depth);
    //System.out.println(temp);

}
public static void main(String... s){
    new  River().flow();
}

}
