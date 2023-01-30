package methodsHomeWork;

import java.util.Scanner;

public class TaskGrades {
    public static void main(String[] args) {
        // Write a method to return whether given number is prime or not?
        //6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
        //score > 90 - A
        //score >80 - B
        //score >70 - C
        //score > 50 - D
        //anything else - F
        //
        //2

        System.out.println("Please enter the students number 0-100");
        Scanner input=new Scanner(System.in);
        int numbers=input.nextInt();
       TaskGrades result=new TaskGrades();
        System.out.println(result.getGrade(numbers));
    }

 char getGrade(int score) {
     if (score > 90 ) {
         return 'A';
     }
     if (score > 80) {
         return 'B';
     }
     if (score > 70) {
         return 'C';
     }
     if (score > 50) {
         return 'D';
     }
     if (score <= 50)
     { return 'F';}
     return 'N';


 }


}