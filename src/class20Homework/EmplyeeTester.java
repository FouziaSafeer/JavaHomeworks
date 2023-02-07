package class20Homework;

public class EmplyeeTester {
    public static void main(String[] args) {
        fullTime emp1=new fullTime("Fouzia","123l",145);
        emp1.display();
      //  emp1.infoPartTime(); cannot acees sibling class function.
        emp1.calcpay(12,15);
        PartTime pemp=new PartTime("Faiza","147L",150,10,15);

    }
}
