package stringsHomeWork02;

public class ReverseSentencesTask4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
        String str ="This is sentence i want to reverse";
       String [] strArr=str.split( "[ ]");
        System.out.println(strArr.length);
        System.out.println(strArr[0].length());
        for (int j = 0; j < strArr.length; j++) {


        for (int i = strArr[j].length()-1; i >=0 ; i--) {
            System.out.print(strArr[j].charAt(i));

        }System.out.print(" ");

        }




        }}




