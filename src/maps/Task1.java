package maps;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/


        HashMap<Integer,String>bestbuy=new HashMap();
        bestbuy.put(7664847 , " Printer");
        bestbuy.put(7664848 , " TV");
        bestbuy.put(7664849 , " Washing machine");
        bestbuy.put(7664852 , " Cpu");
          System.out.println(bestbuy);// simple printing

         var entrySet =bestbuy.entrySet();// printing by entery set


        for (var e:entrySet) {


        System.out.println(e);}
    }
}
