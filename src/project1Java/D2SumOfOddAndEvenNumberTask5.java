package project1Java;

public class D2SumOfOddAndEvenNumberTask5 {
    public static void main(String[] args) {
        //)Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array
        int [][] numbers={{12,14,15,78},{10,20,30,40,45}};
        int oddsum=0;
        int evenSum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
               // System.out.println(numbers[i][j]);
                if(numbers[i][j]%2==0){
                   // System.out.print(numbers[i][j]+" ");
                   evenSum+=numbers[i][j];
            }

                else {System.out.println();
                   // System.out.print(numbers[i][j]+" ");
                    oddsum+=numbers[i][j];

                }
                }

        }
        System.out.println("Even sum: "+evenSum);
        System.out.println(("Odd Sum: "+oddsum));
    }
}
