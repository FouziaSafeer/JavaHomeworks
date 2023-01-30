package project1Java;

public class FibonacciSeriesTask8 {
    public static void main(String[] args) {
         //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
        int a =0;
        int b=1;
       // int [] number={0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i <5 ; i++) {

            System.out.println(a);
           b+=a;
            System.out.println(b);
            a+=b;
            }

            System.out.println();
        }


        }


