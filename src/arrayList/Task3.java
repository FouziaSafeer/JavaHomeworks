package arrayList;

import java.util.ArrayList;

public class Task3 {
    /*3)Create an arrayList of words. Remove every word that ends with “e”. */
    public static void main(String[] args) {

        ArrayList<String>makeup=new ArrayList<>();
        makeup.add("Lipstick");
        makeup.add("Eyeline");
        makeup.add("Blushone");
        makeup.add("Foundation");
        makeup.add("Mascarae");//wrong spell for testing





        for(int i=0; i< makeup.size(); i++)// problem in
        {if(makeup.get(i).endsWith("e")){
            makeup.remove(i);
        }
        }  System.out.println(makeup);



}}