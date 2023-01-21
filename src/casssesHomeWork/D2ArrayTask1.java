package casssesHomeWork;

public class D2ArrayTask1 {
    public static void main(String[] args) {
        //) Create a 2D array(shorter way) in which first array will consist of 4 names
        // and second array will contain grades.
        // Then your program should print name of the students that has A and B grade (edited)
     String[][] names={{"fizzy","Asli","Areeba","Urwa"},{"A","B","C","D"}};
        System.out.println( names[0][0]+" scores "+names[1][0]);
        System.out.println( names[0][1]+" scores "+names[1][1]);
        System.out.println( names[0][2]+" scores "+names[1][2]);
        System.out.println( names[0][3]+" scores "+names[1][3]);
       // System.out.println(names[2][1]);
    }
}
