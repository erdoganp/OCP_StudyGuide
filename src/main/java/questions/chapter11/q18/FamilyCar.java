package questions.chapter11.q18;

import java.io.Closeable;

public class FamilyCar {
    /*
    18. What is the output of the following code?
import java.io.*;
public class FamilyCar {
static class Door implements AutoCloseable {
public void close() {
System.out.print("D");
} }
static class Window implements Closeable {
public void close() {
System.out.print("W");
throw new RuntimeException();
} }
public static void main(String[] args) {
var d = new Door();
try (d; var w = new Window()) {
System.out.print("T");
} catch (Exception e) {
System.out.print("E");
} finally {
System.out.print("F");
} } }
A. TWF
B. TWDF
++C. TWDEF
D. TWF followed by an exception
E. TWDF followed by an exception
F. TWEF followed by an exception
G. The code does not compile.



     */

    static class Door implements AutoCloseable{
        public void close(){
            System.out.print("D");
        }
    }

    static class Window implements Closeable {

        public void close(){
            System.out.print("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        var d = new Door(); //dogru kullanılmıs effectively final olarak
        try(d; var w =new Window()){ //burada son tanımlanan objek once kapanır
            System.out.print("T");
        }catch (Exception e){
            System.out.print("E");
        }finally {
            System.out.print("F");
        }
    }
}
