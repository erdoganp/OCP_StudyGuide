package questions.chapter14.reading_writing_files.using_io_stream;

import java.io.*;

public class UsingIOStreamsExample3FileInputStream {

    public static void main(String[] args) throws IOException {


        var fileInputStream =new FileInputStream("extras/chapter14/source-data.txt");
        var fileOutputStream =new FileOutputStream("extras/chapter14/source-data-out.txt");
        copyStream(fileInputStream, fileOutputStream);
    }

    static void copyStream(InputStream in, OutputStream out) throws IOException {

        int batchSiza =9;
        var buffer = new byte[batchSiza];
        int lengthRead;

/**write ın overloaded versionunda belirli bir buffer belirleme var ve burada belirtilen deger kadar okuma ve yazma yapıyor
 * parca parca verileri yazıyor*/
        while ((lengthRead  =in.read(buffer, 0, batchSiza)) >0){
            System.out.println("lengthRead : " + lengthRead);
            out.write(buffer, 0 , lengthRead);
            out.flush();
        }

    }
}
