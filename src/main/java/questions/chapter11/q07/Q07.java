package questions.chapter11.q07;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q07 {

    /*

What does the following method print?
11: public void tryAgain(String s) {
12: try (FileReader r = null, p = new FileReader("")) {
13: System.out.print("X");
14: throw new IllegalArgumentException();
15: } catch (Exception s) {
16: System.out.print("A");
17: throw new FileNotFoundException();
18: } finally {
19: System.out.print("O");
20: }
21: }
A. XAO
B. XOA
C. One line of this method contains a compiler error.
D. Two lines of this method contain compiler errors.
++E. Three or more lines of this method contain compiler errors.
F. The code compiles, but a NullPointerException is thrown at runtime.
G. None of the above


     */

    public static void main(String[] args) {



    }

    public void tryAgain(String s){
/**
HATALAR
 1)satır 46 da resourceler noktalı virgül ile ayrılmalı
 2)p degiskeni tipi belli değil
 3)Satır 55 de throw edilen checked Exception method imzasında throws ile belirtilmemiş
 4)method da s ile belirtilen değişken satır 54 de s  tekrar kullanılmıs


 */
//        try (FileReader r=null, p=new FileReader("")){
//
//            System.out.println("X");
//            throw new IllegalArgumentException();
//
//        }catch (Exception s){
//            System.out.println("A");
//            throw new FileNotFoundException();
//        }finally{
//            System.out.println("0");
//        }

    }
}
