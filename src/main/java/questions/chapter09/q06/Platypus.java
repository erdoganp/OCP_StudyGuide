package questions.chapter09.q06;

import java.util.*;

/*

Which of the following can fill in the blank to print [7, 5, 3]? (Choose all that apply.)
8: public record Platypus(String name, int beakLength) {
9: @Override public String toString() {return "" + beakLength;}
10:
11: public static void main(String[] args) {
12: Platypus p1 = new Platypus("Paula", 3);
13: Platypus p2 = new Platypus("Peter", 5);
14: Platypus p3 = new Platypus("Peter", 7);
15:
16: List<Platypus> list = Arrays.asList(p1, p2, p3);
17:
18: Collections.sort(list, Comparator.comparing );
19:
20: System.out.println(list);
21: }
22: }
A.
(Platypus::beakLength) //beaklength e göre kucukten buyuge
++B.
(Platypus::beakLength).reversed() //beaklength e göre kucukten buyuge sonra reversed eder yani DOGRU
C.
(Platypus::name)
.thenComparing(Platypus::beakLength)
D.
(Platypus::name)
.thenComparing(
Comparator.comparing(Platypus::beakLength)
.reversed()) //reversed i içerde yaptıgı için genel durumu degistirmz
E.
(Platypus::name)
.thenComparingNumber(Platypus::beakLength) //Comparingnumber dye bir method yok
.reversed()
++F.
(Platypus::name)
.thenComparingInt(Platypus::beakLength)
.reversed()
G. None of the above
 */

public record Platypus(String name, int beaklength) {
    @Override
    public String toString(){
        return ""+ beaklength;
    }

    /**
     * Kurallar
     * thenComparingInt
     * thenComparingDouble
     * thenComparingLong
     *methodları vardır Function interfaceini implemente eder
     * */

    public static void main(String[] args) {
        methodA();
        methodB();
        methodC();
        methodD();
        methodF();
    }

    public static void methodA(){
        Platypus p1= new Platypus("Paula", 3);
        Platypus p2=new Platypus("Peter", 5);
        Platypus p3=new Platypus("Peter", 7);

        List<Platypus> list= Arrays.asList(p1,p2,p3);
        Collections.sort(list, Comparator.comparing(Platypus :: beaklength));
        System.out.println(list);
    }
    public static void methodB() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
        Collections.sort(list, Comparator.comparing(Platypus::beaklength).reversed());
        System.out.println(list);

    }

    public static void methodC() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Platypus::beaklength));
        System.out.println(list);

    }

    public static void methodD() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Comparator.comparing(Platypus::beaklength).reversed()));
        System.out.println(list);

    }


    public static void methodE() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
//        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparingNumber(Platypus::beaklength).reversed());  //thenComparingNumber dye bir method yok
        System.out.println(list);

    }

    public static void methodF() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparingInt(Platypus::beaklength).reversed());
        System.out.println(list);

    }



}
