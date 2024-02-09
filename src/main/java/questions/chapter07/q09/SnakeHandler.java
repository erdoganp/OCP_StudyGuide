package questions.chapter07.q09;
/*

Which of the following statements can be inserted in the blank so that the code will compile
successfully? (Choose all that apply.)
abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}
public class SnakeHandler {
private Snake snakey;
public void setSnake(Snake mySnake) { this.snakey = mySnake; }
public static void main(String[] args) {
new SnakeHandler().setSnake( );
}
}
++A. new Cobra()
B. new Snake()
C. new Object()
D. new String("Snake")
++E. new GardenSnake()
++F. null
G. None of the above. The class does not compile, regardless of the value inserted in the
* */

import java.util.List;

abstract class Snake{

}
class Cobra extends Snake{

}



class GardenSnake extends Snake{}

public class SnakeHandler {

    private  Snake snake;
    public void setSnake(Snake mySnake){this.snake =mySnake;}

    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Cobra());
        new SnakeHandler().setSnake(new GardenSnake());
        //new SnakeHandler().setSnake(new Object); //Object veremeyiz cunku Object Snakein ust sınıfı
        //new SnakeHandler().setSnake(new String("Snake")); //String ile Snake arasınnda hiyerarsik bir yapı yok
        new  SnakeHandler().setSnake(null);
        //new SnakeHandler().setSnake(new Snake); //Snake bir abstract sınıf oldugu için newlenemez
    }
}
