package questions.chapter08.q15;

import java.util.function.Predicate;

/*

Which lambda expression, when entered into the blank line in the following code, causes the
program to print hahaha? (Choose all that apply.)
import java.util.function.Predicate;
public class Hyena {
private int age = 1;
public static void main(String[] args) {
var p = new Hyena();
double height = 10;
int age = 1;
testLaugh(p, );
age = 2;
}
static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
var r = joke.test(panda) ? "hahaha" : "silence";
System.out.print(r);
}
}
++A. var ->p.age <= 10
B. shenzi ->age==1
C. p ->true
D. age==1
E. shenzi ->age==2
++F. h ->h.age < 5
G. None of the above, as the code does not compile

* */
public class Hyena {

    private  int age=1;

    public static void main(String[] args) {
        var p= new Hyena();
        double height=10;

        int age=1;

        testlagh(p,var ->p.age <=10); //olur cunku var dye bir degisken tanımlıyoruz ve ustteki p objesinin ageini kullanıyoruz yani instance variableini
        //testlagh(p,shenzi ->age ==1); // COMPILE-ERROR ,cunku age alt tarafda degişmis
        //testlagh(p,p->true); //COMPILE-ERROR olmaz cunku p diye tekrar bir değişken tanımlıyoruz ama ust taraftaa p olusturulmustu
       // testlagh(p,age==1); // // COMPILE-ERROR ,cunku age alt tarafda degişmis
       // testlagh(p,shenzi->age ==2);// COMPILE-ERROR ,cunku age alt tarafda degişmis
        testlagh(p,h->h.age<5); //olur cunku h adında baska bir obje tanımlıyoruz
        age=2;
    }

    static void testlagh(Hyena panda, Predicate<Hyena> joke){
        var r=joke.test(panda) ? "hahaha" : "silence";
        System.out.println(r);
    }
}
