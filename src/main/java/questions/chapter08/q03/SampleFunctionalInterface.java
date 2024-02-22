package questions.chapter08.q03;

@FunctionalInterface //zorunlu değil
public interface SampleFunctionalInterface {

    void singleAbstractMethod(); //abstract method

    default  void sampleDefaultMethod(){ //default method
        System.out.println("sample default method");
    }

    private void samplePrivateMethod(){
        System.out.println("Private method");
    }

    /**
     * Object sınıfındaki abstract methodlardır bunlar
     * */
    public boolean equals(Object ob);

    public int hashCode();

    public String toString();



}
