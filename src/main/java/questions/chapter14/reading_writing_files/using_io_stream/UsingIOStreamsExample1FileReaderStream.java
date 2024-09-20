package questions.chapter14.reading_writing_files.using_io_stream;

import java.io.*;

public class UsingIOStreamsExample1FileReaderStream {


    public static void main(String[] args) throws IOException {


        var fileReader= new FileReader("extras/chapter14/source-data.txt");
        var fileWriter=new FileWriter("extras/chapter14/source-data-out.txt");

        copyStream(fileReader, fileWriter);



    }





    static void copyStream(Reader in, Writer out) throws IOException {
        int b;

        while ((b=in.read()) !=-1){

            System.out.println((char) b + " ");
            out.write(b);
        }
        out.close();

    }
}
