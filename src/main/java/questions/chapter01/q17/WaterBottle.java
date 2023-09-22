package questions.chapter01.q17;

public class WaterBottle {
    /*
     A. Line 8 generates a compiler error.
    B. Line 9 generates a compiler error.
    C. Empty =
    ++D. Empty = false
    E. Brand =
    ++F. Brand = null
    ++G. Code = 0.0
    H. Code = 0f
    * */

    private String brand;
    private boolean empty;
    public static float code; // code static variable ını sınıf ismi üzerinden erişebiliriz veya main methodu bu sınıfta oldugu için
                                //direk code yazıp da erişebilirz

    public static void main(String[] args){
            WaterBottle wb=new WaterBottle();
        System.out.println("Empty= " +wb.empty);
        System.out.println("Brand= " + wb.brand);
        System.out.println("Code= "  + WaterBottle.code);
    }
}
