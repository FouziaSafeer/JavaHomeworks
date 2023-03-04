package maps;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
        LinkedHashSet<String>names=new LinkedHashSet<>();
        names.add("fouzia");
        names.add("faiza");
        names.add("sadia");
        names.add("Asia");
        names.add("bushra");



        for (String s:names){
            System.out.print(s+" ");
        }


    }
}