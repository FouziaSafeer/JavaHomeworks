package casssesHomeWork;

public class D2ArrayEvenOdd {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
        int [][]numbers={{10,11,12,14},
                        {15,16,17,18},
                        {19,20,21,22}};
        for(int i=0;i< numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                if(numbers[i][j]%2==0){
                System.out.print(numbers[i][j]+" ");

        }}
            System.out.println();
    }
}}
