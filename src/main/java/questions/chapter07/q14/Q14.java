package questions.chapter07.q14;

public class Q14 {


    // Which statements about sealed classes are correct? (Choose all that apply.)

//++    A. A sealed interface restricts which subinterfaces may extend it.
//      B. A sealed class cannot be indirectly extended by a class that is not listed in its permits clause.
//++    C. A sealed class can be extended by an abstract class.
//++    D. A sealed class can be extended by a subclass that uses the non-sealed modifier.
//++    E. A sealed interface restricts which subclasses may implement it.
//      F. A sealed class cannot contain any nested subclasses.
//     G. None of the above
}

sealed interface SealedInterface permits SubInterface, SuperClass {

}

sealed class SealedClass permits SampleAbstract {

}

non-sealed abstract class SampleAbstract extends SealedClass {
}

non-sealed interface SubInterface extends SealedInterface {
}

final class SuperClass implements SealedInterface {
}

class Sample implements SubInterface {

}

class Child extends Sample {
}

