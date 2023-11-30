package questions.chapter05.q14;

public class RopeSwing {
    /*
    How many lines in the following code have compiler errors?
    A. 0
    B. 1
    C. 2
    D. 3
  ++  E. 4
    F. 5
     */
    private static final String leftRope;
    private static final String rightRope;
    //private static final String bench;
    private static final String name="name";

    static {
        leftRope="left";
        rightRope="right";
    }
    static {
       // name="name";
        //rightRope="right";
    }

    public static void main(String[] args) {
        //bench="bench";
    }
}
