package maps;

import java.util.HashMap;

public class Task3 {
    /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/
    public static void main(String[] args) {


        HashMap<String, Integer> empDetails = new HashMap<>();
        empDetails.put("fouzia",14000);
        empDetails.put("faiza",15000);
        empDetails.put("Sadia",148000);
        empDetails.put("asiya",17000);


        var entrySet =empDetails.entrySet();// printing by entery set

        int highestSal=0;
        String name="";
        for (var entry:entrySet){
            if(entry.getValue()>highestSal){
                highestSal= entry.getValue();
                name= entry.getKey();
            }
        }
        System.out.println(name+" =$"+highestSal);

    }
}