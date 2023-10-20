package questions.chapter02.q13;

public class Q13 {
/*
    What is the output of the following code snippet?
    boolean sunny = true, raining = false, sunday = true;
    boolean goingToTheStore = sunny & raining ^ sunday; T
    boolean goingToTheZoo = sunday && !raining; T
    boolean stayingHome = !(goingToTheStore && goingToTheZoo);

    System.out.println(goingToTheStore + "-"+ goingToTheZoo+ "-"+stayingHome);
    A. true-false-false
    B. false-true-false
    C. true-true-true
    D. false-true-true
    E. false-false-false
  ++F. true-true-false
    G. None of the above

 */

    public static void main(String[] args){

        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);

        System.out.println(goingToTheStore + "-"+ goingToTheZoo+ "-"+stayingHome);

    }
}
