package questions.chapter01.q7;

public class KitchenSink {
/*
A. The output includes: # forks = 0.
B. The output includes: # knives = 0.
C. The output includes: # cups = 0.   ++
D. The output includes a blank line.
E. The output includes one or more lines that begin with whitespace. ++
F. The code does not compile.
* */
    private int numForks;

    public  static  void main (String[] args){
        int numKnives;
        /// string blocklarda tırnağın içindeki tüm ifadeler string olarak algılanır parametrik degildir.
        System.out.println("""
                "# forks = " + numForks + 
                 " #knives = " + numKnives + 
                # cups=0""");
    }
}
