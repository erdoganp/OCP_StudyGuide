package questions.chapter09.q14;

/*

Which of the following lines can be inserted to make the code compile? (Choose all
that apply.)
class W {}
class X extends W {}
class Y extends X {}
class Z<Y> {
// INSERT CODE HERE
}
++A. W w1 = new W();
++B. W w2 = new X();
C. W w3 = new Y();
D. Y y1 = new W();
E. Y y2 = new X();
F. Y y1 = new Y();

 */
public class W {
}

class X extends W{

}
class Y extends X{

}
class Z <Y>{ //burada Y tip parametresi olarak kullanılıyor bundan dolayı Y classını override ediyor.
    W w1=new W();
    W w2=new X();
  //  W w3=new Y();
   // Y y1=new W();
    //Y y2=new X();
    //Y y1=new Y();
}
