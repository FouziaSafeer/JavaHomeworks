package project1Java;

import java.util.Scanner;

public class ArraySumTask1 {
    public static void main(String[] args) {
        //  1)Using Scanner create an array of integer values.
        //  After the array is created, calculate the sum of all stored elements in that array.
        System.out.println("How many number you want to save in array?");
        Scanner input = new Scanner(System.in);
        int numberCount = input.nextInt();
        int[] array = new int[numberCount];
        System.out.println("Please enter " + numberCount + " numbers");
        for (int i = 0; i < numberCount; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < numberCount; j++) {
            sum += array[j];
        }
        System.out.println("Total sum " + sum);
    }
}
