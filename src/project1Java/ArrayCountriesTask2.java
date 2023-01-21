package project1Java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCountriesTask2 {
    public static void main(String[] args) {
//Using Scanner create an array of countries. When an array is created,
// retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
        System.out.println("How many Countries do you want to save");
        Scanner input=new Scanner(System.in);
        int countriesNumber= input.nextInt();
        String[] countriesName= new String[countriesNumber];
        String[] capital=new String[countriesNumber];
        for (int i = 0; i <countriesNumber ; i++) {
            System.out.println("Please enter country name");
            countriesName[i]= input.next();
            System.out.println("Please enter capital of "+countriesName[i]);
            capital[i]= input.next();
        }
        System.out.println();
       // for (int i = 0; i <countriesNumber; i++) {
            for (int j = 0; j < countriesName.length; j++) {
                System.out.println(countriesName[j]+" capital is  "+capital[j] );

            }

        System.out.println("second method of printing");


        System.out.println(Arrays.toString(countriesName));
        System.out.println(Arrays.toString(capital));

    }}
