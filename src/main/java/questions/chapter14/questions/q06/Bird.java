package questions.chapter14.questions.q06;

public class Bird {


    protected transient String name;

    public void setName(String name){
        this.name =name;
    }

    public String getName(){

        return name;
    }
    public Bird(){
        System.out.println("Bird constructor ");
        this.name="Matt";
    }
}
