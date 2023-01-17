package arraysHomework;

public class ArrayTask1 {
    public static void main(String[] args) {
       // 1) Create an array of chars and store grades into it: A,B,C,D,E,F.
        // Then print a grade B (use 2 different ways of creating an array).
    char[] alphabets={'A','B','C','D','E','F'};
        for (int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i]+" ");

        }
        System.out.println();
        System.out.println("----------2nd method ---------------");
            char[] charachter=new char[6];
            charachter[0]='A';
            charachter[1]='B';
            charachter[2]='C';
            charachter[3]='D';
            charachter[4]='E';
            charachter[5]='F';
        for (int i = 0; i < charachter.length; i++) {
            System.out.print(charachter[i]+" ");

        }



    }



}
