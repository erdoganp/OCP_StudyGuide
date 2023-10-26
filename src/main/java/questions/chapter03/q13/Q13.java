package questions.chapter03.q13;

public class Q13 {
/*
2: boolean keepGoing = true;
3: int result = 15, meters = 10;
4: do {
5: meters--
;
6: if(meters==8) keepGoing = false;
7: result -=
2;
8: } while keepGoing;
9: System.out.println(result);
A. 7
B. 9
C. 10
D. 11
E. 15
F. The code will not compile because of line 6.
++G. The code does not compile for a different reason.
 */


    public static void main(String[] args) {
        boolean keepGoing=true;

        int result=15,meters=10;

//        do{
//            meters--;
//            if(meters==8) keepGoing=false;
//            result -=2;
//       // }while keepGoing; parantes olmadıgı için derleme hatası verir
//
//        System.out.println(result);

        for(var penguin : new int[2])
            System.out.println(penguin);
    }
}
