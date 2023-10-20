package questions.chapter02.q02;

public class Q02 {
/*
    What data type (or types) will allow the following code snippet to compile? (Choose all
    that apply.)
    byte apples = 5;
    short oranges = 10;
    _____ bananas = apples + oranges;
++    A. int
++    B. long
    C. boolean
++    D. double
    E. short
    F. byte*/

    //eger iki operand üzerinde işlemler yappılıyorsa otomatik olarak üst tipe castin yapılır

void method1(){
    byte apples=5;
    short oranges=10;

    int banana=apples + oranges;
}

void method2(){
    byte apples=5;
    short oranges=10;
    long banana=apples + oranges;
}

void methodd3(){
    byte apples=5;
    short oranges=10;
    double banana=apples + oranges;
}

}
