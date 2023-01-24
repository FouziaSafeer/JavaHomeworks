package project1Java;

public class DublicateNumbersInArrayTask11 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?
     boolean flag=false;
     String arr[]={"Java","C","C++","Phython","Java","C"};
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j< arr.length;  j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found dublicate elements:"+arr[i]);
                    flag=true;
                }

            }

        }
    }
}
