package questions.chapter11.q24;

public class SnowStorm {

    /*

    24. What is the output of the following program?
public class SnowStorm {
static class WalkToSchool implements AutoCloseable {
public void close() {
throw new RuntimeException("flurry");
} }
public static void main(String[] args) {
WalkToSchool walk1 = new WalkToSchool();
try (walk1; WalkToSchool walk2 = new WalkToSchool()) {
throw new RuntimeException("blizzard");
} catch(Exception e) {
System.out.println(e.getMessage()
+ " " + e.getSuppressed().length);
}
walk1 = null;
} }
A. blizzard 0
B. blizzard 1
++C. blizzard 2
D. flurry 0
E. flurry 1
F. flurry 2
G. None of the above

     */

    static class WalkToSchool implements AutoCloseable{

        public void close(){
            throw new RuntimeException("furry");
        }
    }

    public static void main(String[] args) {
        WalkToSchool walk1 = new WalkToSchool();
        try(walk1;WalkToSchool walk2 =new WalkToSchool()){
            /**once blizzard ı fırlatır ve catch de yakalar daha sonra resource leri kaparken 2 adet daha exception fırlatır*/
            throw new RuntimeException("blizzard");
        }catch (Exception e){
            System.out.print(e.getMessage() + " " + e.getSuppressed().length);
        }

       // walk1 =null; //try with resource da effectively final olmalıdr objeler burada atama yaparsak compile error verir
    }
}
