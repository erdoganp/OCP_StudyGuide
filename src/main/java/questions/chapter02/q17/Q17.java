package questions.chapter02.q17;

public class Q17 {
    /*
    Given the following code snippet, what are the values of the variables after it is executed?
(Choose all that apply.)
int ticketsTaken = 1;
int ticketsSold = 3;
ticketsSold += 1 + ticketsTaken++; 5-2
ticketsTaken *= 2; 4
ticketsSold += (long)1; 6
A. ticketsSold is 8.
B. ticketsTaken is 2.
++C. ticketsSold is 6.
D. ticketsTaken is 6.
E. ticketsSold is 7.
++F. ticketsTaken is 4.
G. The code does not compile.
     */

    public static void main(String[] args){
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long)1;

        System.out.println(ticketsSold);
        System.out.println(ticketsTaken);
    }
}
