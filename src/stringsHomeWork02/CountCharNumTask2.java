package stringsHomeWork02;

public class CountCharNumTask2 {
    public static void main(String[] args) {
        //2) Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
    String str="ABCDEFGabcde123456789@!£$%^&456ghiu*()";
        String str2=str.replaceAll("[A-Za-z0-9]","1");
        System.out.println(str2);
        int count=0;
        for (int i = 0; i < str2.length()-1; i++) {
            if(str2.charAt(i)=='1'){
                count++;
            }


        }System.out.println("Alphanumeric characters :"+ count);

    }
}
