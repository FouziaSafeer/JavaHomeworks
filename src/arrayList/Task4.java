package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task4 {
    /*4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
    public static void main(String[] args) {


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("drink");
        drinks.add("coke");
        drinks.add("pani");
        drinks.add("milk");
        drinks.add("7up");
        drinks.add("mirind");
        for (int i = 0; i < drinks.size(); i++)
        {
            if( (drinks.get(i).contains("a")||drinks.get(i).contains("e")))
            {
                drinks.set(i,"water");
            }

        }System.out.println(drinks);

    }
}
