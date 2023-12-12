package questions.chapter06.q13;

public class Q13 {
    /*

    13. Which of these classes compile and will include a default constructor created by the
compiler? (Choose all that apply.)
++A.
public class Bird {}
B.
public class Bird {
public bird() {} //COMPILE ERROR
}
C.
public class Bird {
public bird(String name) {}//COMPILE ERROR
}
D.
public class Bird {
public Bird() {}    //explicit olarak tanımlandıgı için Compliler tekrar tanımlamaz
}
E.
public class Bird {
Bird(String name) {} //parametreli constructor tanımlandıgı için compiler otomatik olarak tanımlamaz
}
F.
public class Bird {
private Bird(int age) {}//parametreli oldugu için compiler otomatik olarak tanımlamaz
}
++G.
public class Bird {
public Bird bird() { return null; }
}
     */
//class Bird{
//
//    }
class Bird{

    public Bird bird(){
        return null;
    }
}
}
