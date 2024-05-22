package questions.chapter11.q12;

import java.io.FileNotFoundException;
import java.io.IOException;

/*

12. Which of the following changes, when made independently, would make this code compile?
(Choose all that apply.)
1: import java.io.*;
2: public class StuckTurkeyCage implements AutoCloseable {
3: public void close() throws IOException {
4: throw new FileNotFoundException("Cage not closed");
5: }
6: public static void main(String[] args) {
7: try (StuckTurkeyCage t = new StuckTurkeyCage()) {
8: System.out.println("put turkeys in");
9: }
10: } }
A. Remove throws IOException from the declaration on line 3.
++B. Add throws Exception to the declaration on line 6.
++C. Change line 9 to } catch (Exception e) {}.
D. Change line 9 to } finally {}.
E. The code compiles as is.
F. None of the above

 */

public class StuckTurkeyCage implements AutoCloseable{
    public void close() throws IOException{

        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) throws Exception {
        try(StuckTurkeyCage t= new StuckTurkeyCage()){
            System.out.println("put turkeys in");
        }
    }

    public void method2(){
        try(StuckTurkeyCage t= new StuckTurkeyCage()){
            System.out.println("put turkeys in");
        }catch (Exception e) {

        }
    }
}
