package questions.chapter13.questions.q02;

import test.B;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Bank {
    /*

    2. Given that the sum of the numbers from 1 (inclusive) to 10 (exclusive) is 45, what are the
possible results of executing the following program? (Choose all that apply.)
1: import java.util.concurrent.locks.*;
2: import java.util.stream.*;
3: public class Bank {
4: private Lock vault = new ReentrantLock();
5: private int total = 0;
6: public void deposit(int value) {
7: try {
8: vault.tryLock();
9: total += value;
10: } finally { vault.unlock(); }
11: }
12: public static void main(String[] unused) {
13: var bank = new Bank();
14: IntStream.range(1, 10).parallel()
15: .forEach(s ->
bank.deposit(s));
16: System.out.println(bank.total);
17: } }
++A. 45 is printed.
B. A number less than 45 is printed.
C. A number greater than 45 is printed.
++D. An exception is thrown.
E. None of the above, as the code does not compile

     */

/**
 * burada deposit v1 ve deposit v2 olarak iki method tanımladık
 * depositv2 aslında kullanılması gereken durum çunlku eger kilit alınmamıssa bıralılamayacakta
 * bundan dolayı once alındıgını kontrol ediyoruz.
 * bu kontrol v1 de yapılmadıgı için exceptionda fırtabilme durumu sözkonusu
 * bundan dolayı A ve D dogrudur
 *
 * */
    private Lock vault= new ReentrantLock();

    private int total=0;

    public void deposit(int value){

        try {
            vault.tryLock();
            total +=value;

        }finally {
            vault.unlock();
        }

    }

    private void depositv2(int value){
        boolean result=false;

        try{

            result=vault.tryLock();
            total += value;

        }finally {
            if(result)
                vault.unlock();
        }

    }

    public static void main(String[] args) {

        var bank =new Bank();
        IntStream.range(1,10).parallel()
                .forEach(s->bank.deposit(s));
        System.out.println(bank.total);
    }


}
