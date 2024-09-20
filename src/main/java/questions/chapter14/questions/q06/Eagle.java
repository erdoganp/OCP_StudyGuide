package questions.chapter14.questions.q06;

import java.io.*;

public class Eagle  extends Bird implements Serializable {



    {
        this.name="Olivia";
    }

    public Eagle(){
        this.name="Bridget";

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var e=new Eagle();
        e.name="Adeline";
      //  e.surname="reis";

        ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("eagles.serial"));
        objectOutputStream.writeObject(e);

        ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("eagles.serial"));
        Eagle eagle =(Eagle) objectInputStream.readObject();
        System.out.println(eagle.name );

        /**
         *Oncelikle Eagle sınıfı Serializable fakat Bird sınıfı serializable değil
         * Bundan dolayı Bird sınıfının  hicbir uyesi serilazable edilmeyecek
         *
         * deserialization işleminde ise serilazable olmayan parent sınıfının constructorı cagrılır
         * de deserialization işleminde Eagle sınıfının hicbir üyesi calıstırılmaz cunku yok
         * */
    }
    }

