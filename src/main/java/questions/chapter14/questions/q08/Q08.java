package questions.chapter14.questions.q08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Q08 {

    /*

    8. Assuming that the /fox/food-schedule.
csv file exists with the specified contents, what
is the expected output of calling printData() on it?
/fox/food-schedule.
csv
6am,Breakfast
9am,SecondBreakfast
12pm,Lunch
6pm,Dinner
void printData(Path path) throws IOException {
Files.readAllLines(path) // r1
.flatMap(p ->
Stream.of(p.split(","))) // r2
.map(q ->
q.toUpperCase()) // r3
.forEach(System.out::println);
}
++A. The code will not compile because of line r1.
B. The code will not compile because of line r2.
C. The code will not compile because of line r3.
D. It throws an exception at runtime.
E. It does not print anything at runtime.
F. None of the above

     */





    public static void main(String[] args) throws IOException {
        printData2(Path.of("extras/chapter14/fox/food-schedule.csv"));
    }


    /**readAllLines methodu streamm donmez List doner bundan dolayı stream methodlarını kullanamayız*/
    void printData(Path path) throws  IOException{
//        Files.readAllLines(path)
//                .flatMap(p-> Stream.of(p.split(",")))
//                .map(q->q.toUpperCase())
//                .forEach(System.out::println);

    }

    static void printData2(Path path) throws IOException{

        Files.readAllLines(path)
                .stream()
                .flatMap(p-> Stream.of(p.split(",")))
                .map(q->q.toUpperCase())
                .forEach(System.out::println);
    }


}
