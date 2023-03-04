package setTasks;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetTask2 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
     Each student object should have name and studentID. Display name of each student.*/
    public static void main(String[] args) {
     //   HashSet<Student>students=new HashSet<>();
        Set<Student> students=new HashSet<>();// we van achieve polymorphisums
        students.add(new Student("asdf",123));
        students.add(new Student("fghj",124));
        students.add(new Student("asdfddd",124));
        students.add(new Student("asddddf",125));
        for (Student s:students) {
            System.out.println(s.getName());

        }


    }
  /*      HashMap<String,String> studentinfo=new HashMap<>();
        studentinfo.put("Hassan","Primary");
        studentinfo.put("Haider","Secondary");
        studentinfo.put("Anaum","College");
        studentinfo.put("fizzy","University");

        System.out.println(studentinfo.keySet());

    }*/


}

    class Student {
        private String name;
        private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }

        public int getStudentID() {
            return studentID;
        }
        public void displayName(){
            System.out.println(name);
        }
    }

