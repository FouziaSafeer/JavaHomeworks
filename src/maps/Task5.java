package maps;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /*5)Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
        ArrayList<Integer>sum=new ArrayList<>();
        sum.add(12);
        sum.add(12);
        sum.add(15);
        sum.add(15);
        sum.add(6);
        int sum1=0;
        for (int i:sum) {
            sum1=i+sum1;

        }
        System.out.println(sum1);
    }
}
