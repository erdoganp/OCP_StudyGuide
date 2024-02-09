package questions.chapter07.q01;

public record Iguana(int age) {
    //private static final int age=10; Record parametresinde aynı isimde static instance tanımlanamaz .COMPILE-ERROR
    private static final int age2=10;
}
