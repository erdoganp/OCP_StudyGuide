package questions.chapter03.q25;

public class Q25 {
    public static void main(String[] args) {
        String instrument="violin";
        final String CELLO="cello";
        String viola="viola";
        int p=-1;
        switch (instrument){
            case "bass" :break; //literaller cadselerde kullanılabilir
            case CELLO:p++; //CELLO final oldugu için case lerde kullanılabilir
            default:p++; //default a girer ve alttaki break e kadar calısır
            case "VIOLIN":p++;
            case "viola" : ++p;break;

        }
        System.out.println(p);
    }
}
