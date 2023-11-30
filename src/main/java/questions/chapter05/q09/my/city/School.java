package questions.chapter05.q09.my.city;

import questions.chapter05.q09.my.school.Classroom;

/*
9. Given the following class definitions, which lines in the main() method generate a compiler
error? (Choose all that apply.)
A. None: the code compiles fine.
++B. Line 5
++C. Line 6
++D. Line 7
E. Line 8
++F. Line 9

 */
public class School {
    public static void main(String[] args) {
      //  System.out.println(Classroom.globalKey);
        //Classroom room=new Classroom(101,"Mrs Anderson");
        //System.out.println(room.roomNumber);
        System.out.println(Classroom.floor);
        //System.out.println(Classroom.teacherName);

    }
}
