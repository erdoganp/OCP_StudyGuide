package questions.chapter03.q17;

public class Q17 {
    public static void main(String[] args) {
        /*

        17. What distinct numbers are printed when the following method is executed? (Choose all
that apply.)
private void countAttendees() {
int participants = 4, animals = 2, performers = -1;
while((participants = participants+1) < 10) {}
do {} while (animals++ <= 1);
for( ; performers<2; performers+=2) {}
System.out.println(participants);
System.out.println(animals);
System.out.println(performers);
}
A. 6
++B. 3
C. 4
D. 5
++E. 10
F. 9
G. The code does not compile.
H. None of the above
         */
        int participants = 4, animals = 2, performers = -1;
        while((participants = participants+1) < 10) {}
        do {} while (animals++ <= 1);
        for( ; performers<2; performers+=2) {}
        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);
    }
}
