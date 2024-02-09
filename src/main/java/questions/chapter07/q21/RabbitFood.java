package questions.chapter07.q21;

import java.time.LocalDate;
/*

Given the following record declaration, which lines of code can fill in the blank and allow
the code to compile? (Choose all that apply.)
public record RabbitFood(int size, String brand, LocalDate expires) {
public static int MAX_STORAGE = 100;
public RabbitFood() {
;
}
}
A. size = MAX_STORAGE
B. this.size = 10
C. if(expires.isAfter(LocalDate.now())) throw newRuntimeException()
D. if(brand==null) super.brand = "Unknown"
E. throw new RuntimeException()
++F. None of the above//COMPILE ERROR verir this kullanılmadıkgı için

*/

public record RabbitFood(int size, String brand, LocalDate expires) {

    public static int MAX_STORAGE=100;


    /**
     * Burada onemli olan sey eger bir constructor tanımı yapıldıysa
     * bu constructor içinde this ile canonical constructor cagrısı yapılmak zorunda
     * yani
     * this(10,"BMW",LocalDate.now())
     * */
   // public RabbitFood(){

    //}
}
