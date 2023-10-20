package questions.chapter02.q21;

public class Q21 {
    /*
    21. What is the result of executing the following code snippet?
int myFavoriteNumber = 8;
int bird = ~myFavoriteNumber;
int plane =-myFavoriteNumber;
var superman = bird == plane ? 5 : 10;
System.out.println(bird + "," + plane + "," + --superman);
A. -7,-8,9
B. -7,-8,10
C. -8,-8,4
D. -8,-8,5
E. -9,-8,9
F. -9,-8,10
G. None of the above

     */

    public static void main(String[] args){
        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber; //bitwise complement operator sayının 1 fazlasının negatifine esittir
        int plane =-myFavoriteNumber;
        var superman = bird == plane ? 5 : 10;
        System.out.println(bird + "," + plane + "," + --superman);
    }
}
