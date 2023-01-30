package arraysHomework;

public class ReverseSting {

    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.  //2) Create a method that will take a String as a parameter and returns reversed String.
    //    // Method should be available to all classes within your project and accessible by class name.
    public String reverseString(String str){
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        String rev= str1.toString();
        return rev;
    }
}
