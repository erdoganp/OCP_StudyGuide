package questions.chapter08.q04;
/*

Which lambda can replace the MySecret class to return the same value? (Choose all
that apply.)
interface Secret {
String magic(double d);
}
class MySecret implements Secret {
public String magic(double d) {
return "Poof";
} }
++A. (e) ->"Poof"
B. (e) ->{"Poof"}
C. (e) ->{ String e = ""; "Poof" }
D. (e) ->{ String e = ""; return "Poof"; }
E. (e) ->{ String e = ""; return "Poof" }
++F. (e) ->{ String f = ""; return "Poof"; }

*/

 interface Secret {
    String magic(double d);
}

public class MySecret implements  Secret{
    public String magic(double a) {
        return  "Poof";
    }


    public static void main(String[] args) {
        Secret lambda1=(e) -> "Poof";
//        Secret lambda2=(e) ->{"Poof"}; //COMPILE ERROR cunku süslü parantez ile return gerekir
//       Secret lambda3=(e) ->{String e =""; "Poof"}; //calısmaz cunku e paramtresi tekrar tanımlanmıs body de
//        Secret lambda4=(e) ->{String e="";return  "Poof";};////calısmaz cunku e paramtresi tekrar tanımlanmıs body de
//        Secret lambda5=(e) ->{String e="";return "Poof"};//calısmaz cunku e paramtresi tekrar tanımlanmıs body de
        Secret lambda6=(e) ->{String f=""; return "Poof";};

    }
}
