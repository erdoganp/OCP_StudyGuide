package questions.chapter05.q12;

public class Q12 {
    /*
    12. How many variables in the following method are effectively final?
    effectiveley final olabilmesi için degişkenin basına final getirdiğimizde code compile olabilmeli
A. 1
++B. 2
C. 3
D. 4
E. 5
F. None of the above. The code does not compile.
     */

    public void feed(){
        int monkey=0;
        if(monkey > 0){
            var giraffe=monkey ++;  ///gireffe basına final getirilebilir
            String name; //namein basına da final getirilebilir buradaki name bu scope içinde tanımlı
            name="geoffrey";
        }
        String name="milly";
        var food =10;
        while(monkey <=10){
            food=0;

        }
        name=null;
    }
}
