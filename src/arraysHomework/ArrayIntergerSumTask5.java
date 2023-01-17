package arraysHomework;

public class ArrayIntergerSumTask5 {
    public static void main(String[] args) {
        //5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
        int[] intnumbers={10,20,30,40,50};
        int sum=0;

            for (int j = 0; j < intnumbers.length; j++) {
                sum+=intnumbers[j];

            }
            System.out.println("Sum= "+sum);


    }
}
