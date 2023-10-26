package questions.chapter03.q11;

public class Q11 {
    enum Animal{BIRD,FISH,MAMAL}

    void printLocation(Animal a){
        long type=switch (a){
            case BIRD -> 1;
            case FISH -> 2;
            case MAMAL -> 3;
            default -> 4;
        };
        System.out.println(type);
    }

    public static void main(String[] args) {

        Q11 q=new Q11();
        q.printLocation(Animal.MAMAL);

    }
}
