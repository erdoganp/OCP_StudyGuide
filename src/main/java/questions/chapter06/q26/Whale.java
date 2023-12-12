package questions.chapter06.q26;
/*

What is the output of the following code?
4: public abstract class Whale {
5: public abstract void dive();
6: public static void main(String[] args) {
7: Whale whale = new Orca();
8: whale.dive(3);
9: }
10: }
11: class Orca extends Whale {
12: static public int MAX = 3;
13: public void dive() {
14: System.out.println("Orca diving");
15: }
16: public void dive(int... depth) {
17: System.out.println("Orca diving deeper "+MAX);
18: } }
A. Orca diving
B. Orca diving deeper 3
C. The code will not compile because of line 4.
+++D. The code will not compile because of line 8.
E. The code will not compile because of line 11.
F. The code will not compile because of line 12.
G. The code will not compile because of line 17.
H. None of the above
 */

public abstract  class Whale {
    public abstract void dive();

    public static void main(String[] args) {
        Whale whale =new Orca();
       // whale.dive(3);burada kodumuz derleme hatası verir ,cunku Whale referansı ile dive(parameter) methoduna ulasamayız.
                       //buradan ulasacagımız method dive() dır ,cunku whale sınıfında dive methodu var ve override edilmiş.
                        //bundan dolayı eger parametreli dive(parameter) cagırırsak compile error alırız.
                        //sorun olmaması için
                        //1.ya Whale sınıfında abstract bir dive(parameter) methodu olacak
                        //2. yada dive metdodunu parametresiz cagıracagız
        whale.dive();//bu sekilde calısmada problem yasamayız

            }
}

class Orca extends Whale{
    static public int MAX=3;
    public void dive(){
        System.out.println("Orca diving");
    }

    public void dive(int... depth){
        System.out.println("orcaa diving deeper "+ MAX);
    }
}
