package project1Java;

public class SwapNumberTask6 {
    public static void main(String[] args) {
        //6)Write a program to swap 2 numbers without a temporary variable?
        int a=10;
        int b=5;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b= "+b);
    }
}
