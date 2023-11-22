package questions.chapter03.q28;

public class Q28 {
    /*

    What is the output of calling getFish("goldie")?
40: void getFish(Object fish) {
41: if (!(fish instanceof String guppy))
42: System.out.print("Eat!");
43: else if (!(fish instanceof String guppy)) {
44: throw new RuntimeException();
45: }
46: System.out.print("Swim!");
47: }
A. Eat!
B. Swim!
C. Eat! followed by an exception.
D. Eat!Swim!
E. An exception is printed.
++F. None of the above
     */
    void getFish(Object fish) {
        if (!(fish instanceof String guppy))
             System.out.print("Eat!");
//         else if (!(fish instanceof String guppy)) { //guppy instance of da yukarıda true dondugu için tanımlanmıs olacak tekrar tanımlanmasına izin vermeyecektir
//             throw new RuntimeException();
//         }
         System.out.print("Swim!");
         }
}
