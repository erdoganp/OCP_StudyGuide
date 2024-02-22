package questions.chapter08.q20;
/*

Which lambdas can replace the new Sloth() call in the main() method and produce the
same output at runtime? (Choose all that apply.)
import java.util.List;
interface Yawn {
String yawn(double d, List<Integer> time);
}
class Sloth implements Yawn {
public String yawn(double zzz, List<Integer> time) {
return "Sleep: " + zzz;
} }

public class Vet {
public static String takeNap(Yawn y) {
return y.yawn(10, null);
}
public static void main(String... unused) {
System.out.print(takeNap(new Sloth()));
} }
A. (z,f) ->{ String x = ""; return "Sleep: " + x }  //COMPILE ERROR-noktalı virgül kullanılmamıs return olmasına ragmen
B. (t,s) ->{ String t = ""; return "Sleep: " + t; } //COMPILE ERROR-String t yi tekrar tanımlamıs
C. (w,q) ->{"Sleep: " + w} //COMPILE ERROR-return statement yok
D. (e,u) ->{ String g = ""; "Sleep: " + e } //COMPILE ERROR-return statement yok
++E. (a,b) ->"Sleep: " + (double)(b==null ? a : a) //sorun yok
F. (r,k) ->{ String g = ""; return "Sleep:"; } //aynı sonucu vermez
G. None of the above, as the program does not compile

 */

import java.util.List;

interface  Yawn{
    String yawn(double d, List<Integer> time);
}

 class Sloth  implements Yawn{
    public String yawn(double zzz, List<Integer> time){
        return "Sleep: " + zzz;
    }


}
public class Vet{
    public static String takeNap(Yawn y){
        return  y.yawn(10, null);
    }

    public static void main(String[] args) {
        System.out.println(takeNap(new Sloth()));

        System.out.println(takeNap( (a,b) ->"Sleep: " + (double)(b==null ? a : a)));
    }
}
