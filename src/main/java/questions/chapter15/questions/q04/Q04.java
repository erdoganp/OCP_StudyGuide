package questions.chapter15.questions.q04;

public class Q04 {

    /*
    4. Suppose that you have a table named animal with two rows. What is the result of the following
code?
6: var conn = new Connection(url, userName, password);
7: var ps = conn.prepareStatement(
8: "SELECT count(*) FROM animal");
9: var rs = ps.executeQuery();
10: if (rs.next()) System.out.println(rs.getInt(1));
A. 0
B. 2
++C. There is a compiler error on line 6  // Connection sınıfı bir interface dir new anahtar kelimesi kullanılmaz ve DriverManagerin getConnection methodu yardımıyla obje olusturulur
D. There is a compiler error on line 10.
E. There is a compiler error on another line.
F. A runtime exception is thrown.

     */
}
