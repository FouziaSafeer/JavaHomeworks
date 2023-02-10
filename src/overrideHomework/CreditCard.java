package overrideHomework;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.*/
    double balance;
    double interest;

    void calculateIntereest(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("Interest of CreditCard:  "+(balance/interest));

    }
}
class Visa extends CreditCard{

}

class AX extends CreditCard{
    void calculateIntereest(double balance,double interest) {

        System.out.println("Interest of AX:  " + (balance / interest));
    }
}
class Tester{
    public static void main(String[] args) {
        CreditCard cc= new CreditCard();
        cc.calculateIntereest(5000,3.5);
        Visa visa=new Visa();
        visa.calculateIntereest(400,2);
        AX ax=new AX();
        ax.calculateIntereest(1000,3);
    }
}