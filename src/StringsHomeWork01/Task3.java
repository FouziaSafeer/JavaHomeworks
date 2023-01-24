package StringsHomeWork01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/
        Scanner input=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String mumName=input.next();
        System.out.println("Dad’s first name?");
        String dadName=input.next();
        System.out.println("Boy or Girl?");
        String babyGender=input.next();
        String babyName;
        int midOfdadName=dadName.length()/2;
        int endOfdadName=dadName.length();
        int midOfMumname=mumName.length()/2;
        int endofMumname=mumName.length();

       // System.out.println(midOfdadName+" "+endOfdadName);
        //System.out.println(midOfMumname+ " "+endofMumname);

        if(babyGender.equalsIgnoreCase("boy")){


            babyName=dadName.substring(0,midOfdadName)+mumName.substring(midOfMumname,endofMumname);

            System.out.println("Suggested baby name: "+babyName.toUpperCase());

        }else{
            babyName=mumName.substring(0,midOfMumname)+dadName.substring(midOfdadName,endOfdadName);
         
            System.out.println("Suggested baby name: "+babyName.toUpperCase());
        }


    }
}
