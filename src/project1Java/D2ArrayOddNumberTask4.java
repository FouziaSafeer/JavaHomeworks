package project1Java;

public class D2ArrayOddNumberTask4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
    int[][] mixednumbers={{10,25,23,74},{45,85,44,26}};

        for (int i = 0; i < mixednumbers.length; i++) {
            for (int j = 0; j < mixednumbers[i].length; j++) {
                if (mixednumbers[i][j]%2==0){
                    System.out.println(mixednumbers[i][j]);
                }

            }

        }
    }
}
