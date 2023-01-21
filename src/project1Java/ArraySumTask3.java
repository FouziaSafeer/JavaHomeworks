package project1Java;

public class ArraySumTask3 {
    public static void main(String[] args) {
        // Create a 2D array of integer values. Print the sum of all numbers.

        int[][] numbers={{10,20,30},
                         {60,50,40}};
       int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
                sum+=numbers[i][j];
            }

        }
        System.out.println("Total sum of all numbers in arrays is "+ sum);

        }




    }

