package questions.chapter02.q16;

public class Q16 {
    /*
    How many lines of the following code contain compiler errors?
int note = 1 * 2 + (long)3;
short melody = (byte)(double)(note *= 2);
double song = melody;
float symphony = (float)((song == 1_000f) ? song * 2L : song);
A. 0
++B. 1
C. 2
D. 3
E. 4
     */
    public static void main(String[] args){
        //int note = 1 * 2 + (long)3; DOES NOT Compile
        //short melody = (byte)(double)(note *= 2);
        //double song = melody;
        //float symphony = (float)((song == 1_000f) ? song * 2L : song);
    }
}
