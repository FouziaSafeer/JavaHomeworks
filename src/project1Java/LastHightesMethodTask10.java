package project1Java;

import java.util.Arrays;

public class LastHightesMethodTask10 {
    public static void main(String[] args) {
        int number[]={5, 10, 7, 55,15,45, 25};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");


        }
        System.out.println();
        int size= number.length;
        System.out.println(size);
        size=size-2;

        System.out.println(number[size]);


        //for loops method

        int [] numbers = {5, 10, 7, 55,15,45, 25};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers [i];
            }

        }

        System.out.println("The second largest number is "+secondLargest);




    }
}
