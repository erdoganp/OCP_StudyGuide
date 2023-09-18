package questions.chapter01.q8;

public class Q8 {

    /*
    Which of the following code snippets about var compile without issue when used in a
method? (Choose all that apply.)
A. var spring = null;
B. var fall = "leaves";             ++
C. var evening = 2; evening = null;
D. var night = Integer.valueOf(3);  ++
E. var day = 1/0;                    ++
F. var winter = 12, cold;
G. var fall = 2, autumn = 2;
H. var morning = ""; morning = null;    ++

    * */
    public static  void main(String[]args){

        //var spring=null;//vara  null ile initial edilemez
        var fall="leaves" ;

        //var evening =2;evening=null; //varda coklu deger ataması yapılamaz
        var night=Integer.valueOf(3);

        var day=1/0;

        //var winter=12,cold;

       // var fall3 =2; autumn=2

        var morning="";morning=null;
    }



}
