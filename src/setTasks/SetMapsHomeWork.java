package setTasks;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMapsHomeWork {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */

    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Islamabad");
        cities.add("London");
        cities.add("Ottawa");
        cities.add("Paris");
        cities.add(("Abbotabad"));
        cities.add("Rome");
        cities.add("Florence");
        cities.add("Ankara");
        System.out.println(cities);
        // cities.remove("Abbotabad");


        cities.removeIf(x->x.startsWith ("A"));
        System.out.println(cities);

    }
}
