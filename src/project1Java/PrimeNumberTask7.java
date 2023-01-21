package project1Java;

import java.util.Scanner;

public class PrimeNumberTask7 {
    public static void main(String[] args) {
        //7)Write a java program to check whether a given number is prime or not? 1,2.3,5,7,11,13....
        System.out.println("Enter any number :  ");
        Scanner input = new Scanner((System.in));
       int number = input.nextInt();
       int count=0;
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
              count++;
              if(count>2){break;}
            }
        }if(count==2) {
            System.out.println("Prime number");
        }else {

            System.out.println("Not Prime");
        }

}}
