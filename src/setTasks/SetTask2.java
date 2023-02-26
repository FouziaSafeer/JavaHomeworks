package setTasks;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

public class SetTask2 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
     Each student object should have name and studentID. Display name of each student.*/
    public static void main(String[] args) {
        HashMap<String,String> studentinfo=new HashMap<>();
        studentinfo.put("Hassan","Primary");
        studentinfo.put("Haider","Secondary");
        studentinfo.put("Anaum","College");
        studentinfo.put("fizzy","University");

        System.out.println(studentinfo.keySet());

    }
}
