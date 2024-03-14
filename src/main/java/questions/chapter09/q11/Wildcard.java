package questions.chapter09.q11;

import test.A;

import java.util.*;

/*

Which of these statements can fill in the blank so that the Wildcard class compiles successfully?
(Choose all that apply.)
3: public class Wildcard {
4: public void showSize(List<?> list) {
5: System.out.println(list.size());
6: }
7: public static void main(String[] args) {
8: Wildcard card = new Wildcard();
9: __________________;
10: card.showSize(list);
11: } }

A. List<?> list = new HashSet <String>()
++B. ArrayList<? super Date> list = new ArrayList<Date>()
C. List<?> list = new ArrayList<?>()
D. List<Exception> list = new LinkedList<java.io.IOException>()
++E. ArrayList <? extends Number> list = new ArrayList <Integer>()
F. None of the above


 */
public class Wildcard {
    public void showSize(List<?> list){
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card=new Wildcard();
        //List<?> list=new HashSet<String>(); bu sekilde olamaz cunku list ve set farklı tipler
        ArrayList<? super Date> list=new ArrayList<Date>();//Sorun yok
        //List<?> list2 =new ArrayList<?>(); sag tarafta ? olmaz
        //List<Exception> list2=new LinkedList<java.io.IOException>();//bu sekilde olmaz cunku IOException Exception sınıfınınn sub tipi değildir
        ArrayList<? extends Number> list2 =new ArrayList<Integer>();//sorun yok
    }
}
