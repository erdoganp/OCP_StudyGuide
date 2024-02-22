package questions.chapter08.q21;
/*

Which of the following are valid functional interfaces? (Choose all that apply.)
public interface Transport {
public int go();
public boolean equals(Object o);
}
public abstract class Car {
public abstract Object swim(double speed, int duration);
}
public interface Locomotive extends Train {
public int getSpeed();
}
public interface Train extends Transport {}
abstract interface Spaceship extends Transport {
default int blastOff();
}
public interface Boat {
int hashCode();
int hashCode(String input);
}
++A. Boat
B. Car
C. Locomotive
D. Spaceship
++E. Transport
++F. Train
G. None of these is a valid functional interface.

 */
@FunctionalInterface //object sınıfından gelen method sayılmaz yani hashcode().Birtane oldugu için functional interfacedir
public interface Boat {
    int hashCode();
    int hasCode(String input);
}


@FunctionalInterface //Functional interface dir cunku object methodları sayılmaz
 interface Transport{
    public int go();
    public boolean equals(Object o);
}

//@FunctionalInterface ---Functional interface değildir  cunku abstract class imzalıdır
 abstract class Car{
    public  abstract Object swim(double speed, int duration);
}
//@FunctionalInterface ---Functional interface değildir  cunku abstract class imzalıdır
 interface Locomotive extends Train{ //train sınıfından abstract method kalıttıgı için Functional interface degildir
    public int getSpeed();
}
@FunctionalInterface
 interface  Train extends Transport{ //Transport dan bir tane go methodu geldiği için FUnctioal interface dir

}

//@FunctionalInterface ---compile erorr verir default method body olmak zorunda
abstract  interface  Spaceship extends Transport{
    //default int blastOff();
}