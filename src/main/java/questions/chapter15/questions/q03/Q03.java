package questions.chapter15.questions.q03;

public class Q03 {

    /*

    3. Which of the options can fill in the blank to make the code compile and run without error?
(Choose all that apply.)
var sql = """
UPDATE habitat SET environment = null
WHERE environment = ? """;
try (var ps = conn.prepareStatement(sql)) {
_______________
ps.executeUpdate();
}
A. ps.setString(0, "snow"); /indeksler 0 dan baslamaz
++B. ps.setString(1, "snow");
C. ps.setString("environment", "snow"); //ilk deger bind variabledaki indeks degeri olmak zorunda
++D. ps.setString(1, "snow"); ps.setString(1, "snow");
E. ps.setString(1, "snow"); ps.setString(2, "snow"); //bind variable olarak sadece bir deger var 2 de hata verir
F. ps.setString("environment", "snow"); ps.setString("environment","snow"); //ilk deger indeks degeri olmalı

     */
}
