package questions.chapter01.q16;

public class Q16 {
    /**
     *Which are true about this code? (Choose all that apply.)

     ++* A. It outputs two lines.
     * B. It outputs three lines.
     * C. It outputs four lines.
     * D. There is one line with trailing whitespace.
    ++ * E. There are two lines with trailing whitespace.
     * F. If we indented each line five characters, it would change the output.
     *
     *
     */

public  static  void main(String[] args){


    var blocky = """
      squirrel \s
      pigeon \
      termite""";
    System.out.print(blocky);
}
}
