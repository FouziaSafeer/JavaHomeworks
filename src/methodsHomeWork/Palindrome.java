package methodsHomeWork;

public class Palindrome {
    //Create a method that will print whether given String is palindrome or not.


    public static void main(String[] args) {
        String str="MADAm";
        Palindrome checkPalindrome=new Palindrome();
        checkPalindrome.palindrome(str);
    }

    void palindrome(String input){
        StringBuilder str1=new StringBuilder(input);
        str1.reverse();
        String rev=str1.toString();
        //System.out.println(rev);
        if(input.equalsIgnoreCase(rev)){
        System.out.println("Its palindrom String");}
        else {
            System.out.println("Its not Palindrom String");
        }


    }
}
