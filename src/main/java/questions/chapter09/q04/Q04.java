package questions.chapter09.q04;

import test.A;

import java.util.*;

public class Q04 {
    /*

    4. Which of these statements compile? (Choose all that apply.)
A. HashSet<Number> hs = new HashSet<Integer>();
++B. HashSet<? super ClassCastException> set = newHashSet<Exception>();
C. List<> list = new ArrayList<String>();
D. List<Object> values = new HashSet<Object>();
E. List<Object> objects = new ArrayList<? extends Object>();
++F. Map<String, ? extends Number> hm = new HashMap<String,
Integer>();
     */

    public static void main(String[] args) {
        //HashSet<Number> hs=new HashSet<Integer>();//bu sekilde olmaz cunku eger yazıldıysa iki tarafta aynı olmak zorunda
        HashSet<? super ClassCastException> set=new HashSet<Exception>(); //bu Dogru cunku class cast exception ,Exception clasının alt clasıdır
       // List<> list =new ArrayList<String>(); //Bu sekilde olmaz cunku sol taraf bos bırakılmaz
        //List<Object> values=new HashSet<Object>();//Bu sekilde olmaz cunku HashSet ile Listin bir inheritance yapısı yok .Farklı tipler
       // List<Object> objects =new ArrayList<? extends  Object>();//bu sekilde olmaz cunku sol tarafta belirtilmesi gerek wildcartın
        Map<String,? extends  Number> hm=new HashMap<String,Integer>(); //bu dogru

    }
}
