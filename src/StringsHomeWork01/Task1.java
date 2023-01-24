package StringsHomeWork01;

public class Task1 {
    public static void main(String[] args) {
      /*  ) Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
         print the character in the middle of the String.
        For Example String str=hello =>l*/

        String str="Friends";
        if(!str.isEmpty()){
            //for (int i = 0; i < str.length(); i++) {
           // System.out.println(str.length());
                int j=str.length()/2;
           // System.out.println(j);
                System.out.println(str.substring(j ,j+1));

            }else{
        System.out.println("String is empty");}

        }

    }

