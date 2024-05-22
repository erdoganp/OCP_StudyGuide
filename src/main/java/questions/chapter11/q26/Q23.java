package questions.chapter11.q26;

import java.io.IOException;

public class Q23 {
    /*

    26. Which lines can fill in the blank to make the following code compile? (Choose all that apply.)
void rollOut() throws ClassCastException {}
public void transform(String c) {
try {
rollOut();
} catch (IllegalArgumentException | ) {
}
}
A. IOException a //olmaz cunku IOException bir checked exception dır ve oncesinde throw edilmesi gerekir
++B. Error b //olur cunku unchecked exception dır ve IllegalArgumentException ile child parent iliskisi yoktur
C. NullPointerException c // c olarak parametre aldıgı için olmaz cunku method da c var
D. RuntimeException d // Runtime exception olmaz cunku IllegalArgumentException ile childparent iliskisi var
E. NumberFormatException e //NumberFormatException olmaz cunku IllegalArgumentException ile child parent iliskisi var
++F. ClassCastException f // olur sorun yok cunku unchecked exceptiondır ve IllegalArgumentException ile childparent ilişkisi yoktur
G. None of the above. The code contains a compiler error regardless of what is inserted
into the blank.


     */

    void rollOut() throws  ClassCastException{

    }

    public void transform(String c){

        try {
            rollOut();
        }catch (IllegalArgumentException |  ClassCastException f){

        }
    }
}
