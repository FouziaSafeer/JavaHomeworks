package AcessModifers;

public class Task1 {
    // //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    ////parameter=>>  int array
    //methis name=>> addNumbers
    //    //retun int
    public static void main(String[] args) {
        int[] numbere={10,20,30,40};
        Task1 task1=new Task1();
        System.out.println(task1.addNumbers(numbere));

    }




    int addNumbers(int[] arr){
       int sum=0;
        for (int num : arr) {
            sum+=num;

        }
        return sum;
    }




}
