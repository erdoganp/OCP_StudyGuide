package questions.chapter04.q15;

import java.util.Arrays;

public class Q15 {
    /*
    What is the output of the following? (Choose all that apply.)
var arr = new String[] { "PIG", "pig", "123"};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.binarySearch(arr, "Pippa"));
A. [pig, PIG, 123]
B. [PIG, pig, 123]
++C. [123, PIG, pig]
D. [123, pig, PIG]
++E. -3
F. -2
G. The results of binarySearch() are undefined in this example

     */

    public static void main(String[] args) {
        var arr=new String []{"PIG","pig","123"};
        Arrays.sort(arr); //Once sayılar sonra buyuk harf daha sonra kucuk harf sıralanır
         System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,"Pippa")); //eger aranılan deger yoksaonce var gibi sıralar ve indexinin -1 ini verir .-3


    }
}
