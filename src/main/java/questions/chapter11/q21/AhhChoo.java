package questions.chapter11.q21;

public class AhhChoo {
    /*

    21. Which changes, when made independently, allow the following program to compile? (Choose
all that apply.)
1: public class AhChoo {
2: static class SneezeException extends Exception {}
3: static class SniffleException extends SneezeException {}
4: public static void main(String[] args) {
5: try {
6: throw new SneezeException();
7: } catch (SneezeException | SniffleException e) {
8: } finally {}
9: } }
A. Add throws SneezeException to the declaration on line 4.
B. Add throws Throwable to the declaration on line 4.
++C. Change line 7 to } catch (SneezeException e) {.
D. Change line 7 to } catch (SniffleException e) {.
E. Remove line 7.
F. The code compiles correctly as is.
G. None of the above

     */

    static class SneezeException extends Exception{

    }
    static class SniffleException extends SneezeException{

    }

    public static void main(String[] args) {
        try{
            throw new SneezeException();
            /**bir catch blogu içinde birden fazla exception tanıtırsak bunlar birbirinin parenti olmamalı
             * eger bu sekilde kullanırsak compile error verir disjoint der
             *
             * */
        }//catch (SneezeException | SniffleException e){
        catch (SneezeException e){

        }
        finally {

        }
    }
}
