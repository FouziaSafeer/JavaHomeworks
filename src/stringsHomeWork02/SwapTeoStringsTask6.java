package stringsHomeWork02;

public class SwapTeoStringsTask6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String str1="Fouzia";
        String str2="Safeer";
        str1=str1+str2;
        System.out.println(str1);
        str2=str1.substring(0, (str1.length()-str2.length()));
        System.out.println(str2);
        str1=str1.substring(str2.length());
        System.out.println(str1);
    }
}
