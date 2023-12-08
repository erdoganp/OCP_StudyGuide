package questions.chapter06.q09;

public class Q09 {
    /*
    9. Which of the following statements about overridden methods are true? (Choose allthat apply.)
A. An overridden method must contain method parameters that are the same or covariant with the method parameters in the inherited method.//parametreler aynı olmak zorunda return type convariant olabilir
++B. An overridden method may declare a new exception, provided it is not checked. //UNCHECKED exception fırlatabiliriz subclass da ama  parent da tanımlanmamıs checked exception ı subclass da fırlatamayız
C. An overridden method must be more accessible than the method in the parent class.//aynı seviyede veya daha genis acces olabilir
D. An overridden method may declare a broader checked exception than the method in the//daha genis exception fırlatamaz.
++E. If an inherited method returns void, then the overridden version of the method must return void.//buda dogrudur cunku return type ya aynı olacak yada convariant.void in bir convariantı olmadıgı için ager parent void se override de da void olmak zorunda
F. None of the above
     */


    void overlaodedMethod(Object object){

    }
    void overridedMethod(Integer integer){

    }

    class A extends Q09{

        void overlaodedMethod(Number number){

        }

        void overridedMethod(Integer integer) throws IllegalArgumentException{

        }
    }
}
