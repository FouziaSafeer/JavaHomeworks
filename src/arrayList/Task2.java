package arrayList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {


    /*)Create an arraylist of cars and retrieve all the values using 3 different ways.*/
    ArrayList<String>cars=new ArrayList<>();
    cars.add("Honda");
    cars.add("Audi");
    cars.add("BMW");
    cars.add("Tesla");
    cars.add("Z4");
     /*   for (int i = 0; cars.size() > i; i++) {
            String arg = args[i];

        }*/
    //first methos
        System.out.println(cars);
        System.out.println("____________________");
      // second methos
        for (String arr:cars) {
            System.out.println(arr);

        }
        System.out.println("____________________");
       // System.out.println( cars.iterator());

       //3rd method
        int i=0;

       while(cars.size()>i){
           System.out.println(cars.get(i));
          i++;
       }



}}
