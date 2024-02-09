package questions.chapter07.q17;

/*
Which lines of the following interface declarations do not compile? (Choose all that apply.)
1: public interface Omnivore {
2: int amount = 10;
3: static boolean gather = true;
4: static void eatGrass() {}
5: int findMore() { return 2; }
6: default float rest() { return 2; }
7: protected int chew() { return 13; }
8: private static void eatLeaves() {}
9: }
A. All of the lines compile without issue.
B. Line 2
C. Line 3
D. Line 4
++E. Line 5
F. Line 6
++G. Line 7
H. Line 8

*/

public interface Omnivore {

    int amount =10;
    static boolean gather =true;

    static void eatGrass(){}

//    int findMore(){return 2;} //static olmayan methodlar gövdesiz olmak zorunda bir interface içinde

    default float rest(){ //default methodlar body içerirler
        return 2;
    }

//    protected int chew(){ //interface içinde protected access modifier olamaz
//        return 13;
//    }

    private static void eatLeaves(){ //private static method olabilir

    }
}
