package questions.chapter02.q04;

public class Q04 {
/*
    What is the output of the following code snippet?
            3: boolean canine = true, wolf = true;
            4: int teeth = 20;
            5: canine = (teeth != 10) ^ (wolf=false);
            6: System.out.println(canine+", "+teeth+", "+wolf);
    A. true, 20, true
  ++B. true, 20, false
    C. false, 10, true
    D. false, 20, false
    E. The code will not compile because of line 5.
    F. None of the above.*/

  public static void main(String[] args){
        boolean canine =true,wolf=true;
        int teeth=20;
        canine =(teeth !=10) ^ (wolf=false);

        System.out.println(canine+ ", "+teeth+", "+wolf);

    }
}
