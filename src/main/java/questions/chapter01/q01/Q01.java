package questions.chapter01.q01;

public class Q01 {
    //which of the following are legal entry point that can be run from command line
    //A:private static void main(String[] args)
    //B:public static final main(String[] args)
    //C:public void main(String[] args)
    //D:public static final void main(String[] args) ++
    //E:public static void main(String[] args)      ++
    //F:public static main(String[] args)
}
    class A{
        private static void main (String[] args){
            //main method must be public
        }
    }

    class B{
       // public static  final main(String[] args){
            //main method void keyworduna sahip olmalı
        //}
    }

    class C{
        public void main(String[] args){
            //main method static olmak zorunda
        }
    }

    class D{
        public static final void main(String[] args){
            //final keywordu ile kullanılabilir static oldugu için
        }
    }

    class E{
        public static void main(String[] args){
            //buda dogru kullanım
        }
    }

    class F{
      //  public static main(String[] args){
            //gerid donus tipi  void olmak zorunda
        //}
    }


