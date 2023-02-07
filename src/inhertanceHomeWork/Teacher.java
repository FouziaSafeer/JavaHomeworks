package inhertanceHomeWork;

public class Teacher {/*Write a Java program called Teacher.
 Identify features and 4 behaviour of that Class.
  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
   Test all 4 classes*/
    String Tname;
    String subject;
    int salary;
    int age;

}
class MathTeacher extends Teacher{
    String calculas;
    String geomatry;


}
class ChemistryTeacher extends Teacher{
    String labTeacher;
    String theoryTeacher;


}
class PianoTeacher extends Teacher{
    String music;
    int lessonno;


}

class School {
    public static void main(String[] args) {

    }
}