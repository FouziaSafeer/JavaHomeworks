package class20Homework;

public class Employee {
    /*2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/
    String empName;
    String empID;
    int empPay;
    Employee(String empName,String empID,int empPay){
        this.empName=empName;
        this.empID=empID;
        this.empPay=empPay;
    }
    void display(){
        System.out.println("Employess "+empName+ " works hard emp id "+ empID+" and should be paid "+empPay);
    }
}
class fullTime extends Employee{
    int contructHours;
    int rate;
    fullTime(String empName, String empID, int empPay) {
        super(empName, empID, empPay);
        }
        void calcpay(int contructHours,int rate){
            System.out.println(empName+ " works  "+ contructHours+" these hours  "+ rate+ " its rate");
            System.out.println("Total paid should be: " +contructHours*rate);
        }


}
class PartTime extends Employee{

    PartTime(String empName, String empID, int empPay, int weekHour, int hourrate) {
        super(empName, empID, empPay);
        infoPartTime(weekHour,hourrate);

       // int this.weekHour=weekHour;

    }
        void infoPartTime(int hourrate,int weekHour){
            System.out.println(empName +" with id "+empID+" employee pay "+empPay +" weekly hours ");
            System.out.println("Total paid should be: "+hourrate*weekHour);

        }


}
