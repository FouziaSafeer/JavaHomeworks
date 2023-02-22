package arrayList;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 500; i+=2) {
            numbers.add(i);
          //if(numbers.get(i)%5==0){
            //  numbers.remove(i);  //words.removeIf(s -> s.endsWith("a"));
              numbers.removeIf(j ->j%5==0);
          }
        System.out.println(numbers);
            }

        }



