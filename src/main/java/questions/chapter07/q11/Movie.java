package questions.chapter07.q11;
/*

What is the result of the following code? (Choose all that apply.)
1: public class Movie {
2: private int butter = 5;
3: private Movie() {}
4: protected class Popcorn {
5: private Popcorn() {}
6: public static int butter = 10;
7: public void startMovie() {
8: System.out.println(butter);
9: }
10: }
11: public static void main(String[] args) {
12: var movie = new Movie();
13: Movie.Popcorn in = new Movie().new Popcorn();
14: in.startMovie();
15: } }
A. The output is 5.
++B. The output is 10.
C. Line 6 generates a compiler error.
D. Line 12 generates a compiler error.
E. Line 13 generates a compiler error.
F. The code compiles but produces an exception at runtime

* */

public class Movie {

    private int butter =5;
    private Movie(){}

    protected class Popcorn{
        private Popcorn(){}

        public static int butter=10;
        public void startMovie(){
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie=new Movie();
        Movie.Popcorn in=new Movie().new Popcorn();
        in.startMovie();
    }
}
