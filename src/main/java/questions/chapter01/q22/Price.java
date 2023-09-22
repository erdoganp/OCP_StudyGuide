package questions.chapter01.q22;

public class Price {
    /*
    Given the following class, which of the following lines of code can independently replace
INSERT CODE HERE to make the code compile? (Choose all that apply.)
A. int Amount = 0b11;
B. int amount = 9L;
++C. int amount = 0xE;
D. int amount = 1_2.0;
E. double amount = 1_0_.0;
++F. int amount = 0b101;
++G. double amount = 9_2.1_2;
H. double amount = 1_2_.0_0;

    */

    //int amount=0xE; //14
    int amount=0b101; //5
    //double amount=9_2.1_2;//92.12

    public void admission(){
        System.out.println(amount);
    }

    public static void main(String[] args){
        Price p=new Price();
        p.admission();
    }
}
