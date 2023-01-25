package stringsHomeWork02;

public class PalindromeStringTask5 {
    public static void main(String[] args) {
        //5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String str="madam";//aba, dad,Mum,
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
          //  System.out.print(str.charAt(i));
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)){
            System.out.println("String is palindrom");
        } else  {
            System.out.println("String is not Palindfrom "+rev);

        }
    }

    }

