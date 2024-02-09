package questions.chapter07.q10;

import java.util.ArrayList;
import java.util.List;

/*
What types can be inserted in the blanks on the lines marked X and Z that allow the code to
compile? (Choose all that apply.)
interface Walk { private static List move() { return null; } }
interface Run extends Walk { public ArrayList move(); }
class Leopard implements Walk {
public move() { // X
return null;
}
}
class Panther implements Run {
public move() { // Z
return null;
}
}
++A. Integer on the line marked X
++B. ArrayList on the line marked X
++C. List on the line marked X
D. List on the line marked Z
++E. ArrayList on the line marked Z
F. None of the above, since the Run interface does not compile
G. The code does not compile for a different reason.

 */

interface  Walk {

    /**
     *  1)move methodunu private tanıttıgı için move methodu extend edilmez yarın bu interface i implemente eden sınıf bu methodu override etmez cunku göremez zaten
     *  2)eger bu method private değilde public static olsaydı static oldugu için hidden olacaktı yani yine override edilmeyecekti
     * */
    private static List move(){ //burası onemli
        return null;
    }
}

interface Run extends Walk {
    public ArrayList move();
}
public class Leopard  implements Walk{
    public Integer move(){ //X -Integer donebiliriz cunku primitive değil
        return null;
    }
}

class Leopard2 implements Walk{
    public ArrayList move(){ //X -Arraylist donebiliriz cunku primitive degil
        return null;
    }
}

class  Leopard3 implements Walk{
    public List move(){ // X -liste donebiliriz cunku primitive değil
        return null;
    }
}
/**
 * burada sadece arraylist donebiliriz cunku override edilen methodlar ya kendi tipinde yada alttipinde donus yapmak zorunda ,covariant olmalı yani
 * */
class Panther implements Run{
    public ArrayList move(){  //Z
        return null;
    }
}


