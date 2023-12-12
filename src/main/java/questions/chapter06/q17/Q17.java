package questions.chapter06.q17;

public class Q17 {
    /*
17. Which of the following are true? (Choose all that apply.)
A. this() can be called from anywhere in a constructor. //hayır ilk calısan state olmak zorunda .
B. this() can be called from anywhere in an instance method.//instance methodlarda this() kullanılmaz constaractor içinde kullanılır
++C. this.variableName can be called from any instance method in the class. //dogru this.variable name a instance methodlar üzerinden ulasabiliriz
D. this.variableName can be called from any static method in the class.//yanlıs ,static context den this ile ulasım saglanılamaz
E. You can call the default constructor written by the compiler using this().//yanlıs,eger this() ile bir kullanım yapmıssak biz bir constructor tanımlamısız demektir bu durumda compiler bize otomatik olarak constructor uretmez
++F. You can access a private constructor with the main() method in the same class.//Dogru

     */
    private Q17(){

    }

    int a;

    void method(){
        this.a=5;

    }

//    static void method2(){
//        this.a=6;
//    }

    public static void main(String[] args) {
        Q17 b=new Q17();
    }
}
