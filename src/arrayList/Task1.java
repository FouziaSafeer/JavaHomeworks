package arrayList;

import java.util.ArrayList;

public class Task1 {
    /*1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fouzia");
        names.add("Faiza");
        names.add("Sadia");
        names.add("Asia");
        names.add("Ayesha");
        System.out.println("Is arrayList is empty\n "+names.isEmpty());
        System.out.println("Is arrayList have my name Fouzia? \n "+names.contains("Fouzia"));
        System.out.println("how long is this array list? \n"+names.size());
        System.out.println(names);
    }
}
