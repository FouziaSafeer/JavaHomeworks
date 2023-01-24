package StringsHomeWork01;

public class Task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).
        String day="Monday";
        for (int i = day.length()-1; i >=0 ; i--) {
            System.out.print(day.charAt(i));

        }
    }
}
