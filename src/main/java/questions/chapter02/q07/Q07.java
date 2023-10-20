package questions.chapter02.q07;

public class Q07 {
/*7. What is the output of the following code snippet?
    int ph = 7, vis = 2;
    boolean clear = vis > 1 & (vis < 9 || ph < 2); T
    boolean safe = (vis > 2) && (ph++ > 1); F
    boolean tasty = 7 <= --ph;F
System.out.println(clear + "-"+ safe + "-"+ tasty);
    A. true-true-true
    B. true-true-false
    C. true-false-true
  ++D. true-false-false
    E. false-true-true
    F. false-true-false
    G. false-false-true
    H. false-false-false*/

    public static void main(String[] args){
        int ph=7,vis=2;
        boolean clear=vis >1 &(vis < 9 || ph < 2);
        boolean safe=(vis > 2) && (ph ++ > 1);
        boolean tasty =7 <= --ph;

        System.out.println(clear + "-" + safe + "-" +tasty);
    }
}
