package questions.chapter03.q10;

public class Q10 {
    /*
    Given the following method, how many lines contain compilation errors? (Choose all
that apply.)
10: private DayOfWeek getWeekDay(int day, final int thursday) {//method parametresi olarak final int tanımlayamayız
11: int otherDay = day;
12: int Sunday = 0;
13: switch(otherDay) {
14: default:
15: case 1: continue; //continue switch de kullanılmaz
16: case thursday: return DayOfWeek.THURSDAY;//method paramtresi sorunlu oldugu içn burada da hata verir
17: case 2,10: break;
18: case Sunday: return DayOfWeek.SUNDAY; //Sunday final olmadıgı için kullanamayız
19: case DayOfWeek.MONDAY: return DayOfWeek.MONDAY; //burada DayofWeek.Monday int tipinde değildir
20: }
21: return DayOfWeek.FRIDAY;
22: }

A. None, the code compiles without issue.
B. 1
C. 2
D. 3
++E. 4
F. 5
G. 6
H. The code compiles but may produce an error at runtime.
     */
}
