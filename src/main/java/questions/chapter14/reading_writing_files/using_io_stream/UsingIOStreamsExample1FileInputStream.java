package questions.chapter14.reading_writing_files.using_io_stream;

import java.io.*;

public class UsingIOStreamsExample1FileInputStream {


    public static void main(String[] args) throws IOException {



        var fileInputStream= new FileInputStream("extras/chapter14/source-data.txt");
        var fileOutputStream=new FileOutputStream("extras/chapter14/source-data-out.txt");

        copyStream(fileInputStream, fileOutputStream);




    }

    static void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;

        while ((b=in.read()) !=-1){

            System.out.println((char) b + " ");
            out.write(b);
        }
        out.close();

    }

}
