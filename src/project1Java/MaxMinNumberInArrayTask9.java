package project1Java;

public class MaxMinNumberInArrayTask9 {
    public static void main(String[] args) {
       // 9)Maximum and minimum number in the array?
        
    
    int numbers[]={2,99,4,25,12,78,10,101,1};
    int max=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("Maximum : "+ max);
        //for minimum*/
        int min=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }

        }





       System.out.println("Minimum : "+min);




    
    
}}
