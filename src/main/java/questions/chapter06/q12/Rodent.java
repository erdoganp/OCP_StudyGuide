package questions.chapter06.q12;
/*
How many lines of the following program contain a compilation error?
1: public class Rodent {
2: public Rodent(Integer x) {}
3: protected static Integer chew() throws Exception {
4: System.out.println("Rodent is chewing");
5: return 1;
6: }
7: }
8: class Beaver extends Rodent {
9: public Number chew() throws RuntimeException {
10: System.out.println("Beaver is chewing on wood");
11: return 2;
12: } }
A. None
B. 1
++C.2
D. 3
E. 4
F. 5

 */
/**
 *  //parent sınıfta paremetreli constructor tanımlandıgı iiçin default constructoructori otomatik olarak olusturması ignore ediliyor
 *  sub sınıf da mecbur olarak ust sınıfın paremetreli constructorını super ile cagırmak zorunda.
 *  2.problem ise parent sınıfta bulunan static method alt sınıfda hidden edilmesi gerekiyor.
 *  ama alt sınıfta static olarak imzalanmamıs ve Number donus tipi verilmiş
 * */
public class Rodent {
    public Rodent(Integer x){

        }
    protected static Integer chew() throws Exception{
        System.out.println("Rodent is chewing");
        return 1;
    }

//    class Beaver extends Rodent{
//        public  Integer chew() throws RuntimeException{
//            System.out.println("Beawer is chewing on wood");
//            return 2;
//        }
//    }
}
