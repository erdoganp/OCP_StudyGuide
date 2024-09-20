package questions.chapter14.questions.q09;

import java.io.*;

public class Q09 {
    /*

    9. Given the following method, which statements are correct? (Choose all that apply.)
public void copyFile(File file1, File file2) throws Exception {
var reader = new InputStreamReader(new FileInputStream(file1));
try (var writer = new FileWriter(file2)) {
char[] buffer = new char[10];
while(reader.read(buffer) != -1)
{
writer.write(buffer);
// n1
}
}
}
A. The code does not compile because reader is not a buffered stream.
B. The code does not compile because writer is not a buffered stream.
++C. The code compiles and correctly copies the data between some files.
D. The code compiles and correctly copies the data between all files.
++E. If we check file2 on line n1 within the file system after five iterations of the while
loop, it may be empty.
F. If we check file2 on line n1 within the file system after five iterations, it will contain
exactly 50 characters.
++G. This method contains a resource leak.

     */

    public static void main(String[] args) throws Exception {

        File file1= new File("file1.txt");
        FileWriter fw= new FileWriter(file1);
        fw.write("ABCDEFGHIJKLMNOPRSTUVYZ");
        fw.close();

        File file2=new File("file2.txt");
        //copyFile(file1, file2);
        copyFile2(file1, file2);

    }


    public static void copyFile(File file1, File file2) throws FileNotFoundException {

        var reader =new InputStreamReader(new FileInputStream(file1)); //reader kapatılmadıgı için recource weak olusur
        try(var writer =new FileWriter(file2)){
            char[] buffer =new char[10];
            while(reader.read(buffer) !=-1){
                writer.write(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void copyFile2(File file1, File file2) throws Exception{
        var reader =new InputStreamReader(new FileInputStream(file1));
        try(var writer =new FileWriter(file2)){
            char[] buffer =new char[10];

            int lengthRead;
            while((lengthRead =reader.read(buffer))>0){
                writer.write(buffer, 0, lengthRead);
            }
        }


    }
}
