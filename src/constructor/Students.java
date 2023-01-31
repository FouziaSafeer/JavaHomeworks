package constructor;

public class Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
*/
    public Students(String sName,int subject1,int subject2, int subject3){

        System.out.println(sName+ " average marks are : "+ calculateAverage(subject1,subject2,subject3));


    }
    int calculateAverage(int s1,int s2, int s3){
        int totalMarksAvg=0;
        totalMarksAvg=(s1+s2+s3)/3;
        return totalMarksAvg;
    }
}
