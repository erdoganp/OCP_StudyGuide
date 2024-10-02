package questions.chapter15.questions.q15;

public class Q15 {
    /*

    15. Which can fill in the blank and have the code run without error? (Choose all that apply.)
17: conn.setAutoCommit(false);
18:
19: var larry = conn.setSavepoint();
20: var curly = conn.setSavepoint();
21: var moe = conn.setSavepoint();
22: var shemp = conn.setSavepoint();
23:
24: ;
25:_______________
26: conn.rollback(curly);


A. conn.rollback(larry)
B. conn.rollback(curly) //aynısını iki defa cagıramayı<
++C. conn.rollback(moe)
++D. conn.rollback(shemp)
E. conn.rollback()
F. The code does not compile.


     */
/**26. satırda curly e donus yapıldıgı için 26. satırdan once yapılan bir save point 26. satırdaki save pointi kapsaması gerekiyo
 * moe ve shemp savepointleri curly i kapsıyor ama larry curly i kapsamıyor
 * */

}
