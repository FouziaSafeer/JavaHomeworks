package methodsHomeWork;

public class EvenOddNumberMethod {
    public static void main(String[] args) {
       // Create a method that will take a number and prints whether the number is even or odd.
          int number=44;
          EvenOddNumberMethod numbercheck=new EvenOddNumberMethod();
          numbercheck.evenOddNumber(number);
    }



    void evenOddNumber(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }








}
