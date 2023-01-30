package AcessModifers;

import arraysHomework.ReverseSting;

public class Task2 {
    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public static void main(String[] args) {

        String str1=" I am Bored";
        ReverseSting str=new ReverseSting();
        System.out.println(str.reverseString(str1));
    }

}
