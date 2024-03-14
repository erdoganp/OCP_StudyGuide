package questions.chapter09.q15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*

Which options are true of the following code? (Choose all that apply.)
3: ________q = new LinkedList<>();
4: q.add(10);
5: q.add(12);
6: q.remove(1);
7: System.out.print(q);
++A. If we fill in the blank with List<Integer>, the output is [10].
B. If we fill in the blank with Queue<Integer>, the output is [10]. //queue da olur fakat sildiğimizde queue da indexleme olmadıgı içiin obje veririz remove(1) dedğimizmde 1 objesi olmadıgı içi [10,12] kalır
++C. If we fill in the blank with var, the output is [10].
D. One or more of the scenarios does not compile.
E. One or more of the scenarios throws a runtime exception.

 */

public class Q15 {
    public static void main(String[] args) {
        List<Integer> q2=new LinkedList<>();
        var q3=new LinkedList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(12);

        q.remove(1);
        System.out.println(q);

    }

}
