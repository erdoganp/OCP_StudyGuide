package questions.chapter07.q07;
/*

What is the output of the following program?
1: interface Aquatic {
2: int getNumOfGills(int p);
3: }
4: public class ClownFish implements Aquatic {
5: String getNumOfGills() { return "14"; }
6: int getNumOfGills(int input) { return 15; }
7: public static void main(String[] args) {
8: System.out.println(new ClownFish().getNumOfGills(-1));
9: } }
A. 14
B. 15
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
+++E. The code will not compile because of line 6. //access seviyesini düsürmemesi gerekir
F. None of the above

* */
interface Aquantic{
    int getNumberOfGills(int p);
}
//public class ClownFish implements  Aquantic{
//    String getNumberOfGills(){
//        return "14";
//    }

/**
 * interface de methodlar implicit olarak public dir.
 * bu methodları override eden sınıf public olarak belirtmesi gerekir eger belirtmezse access levelini package seviyesine dusurmus olur buda COMPILE ERRROR verir
 * */
//   int getNumberOfGills(int input){
//        return 15;
//    }

//    public static void main(String[] args) {
//        System.out.println(new ClownFish().getNumberOfGills(-1));
//    }
//}
