package AcessModifers;

public class Task3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
    public static void main(String[] args) {

       String str="abcdefig13254jhbkjhLOMOhoHIOUplueo";

        Task3 task3=new Task3();

        System.out.println( task3.vowels(str));
    }


    private  String vowels(String str1){
        str1=str1.replaceAll("[^aeiouAEIOU]","");
        return str1;
    }
}
