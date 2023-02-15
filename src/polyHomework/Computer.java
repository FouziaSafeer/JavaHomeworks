package polyHomework;

public class Computer {
    /* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.*/
    String model;
    int displaysize;
    int memoery;
    String company;

    public Computer(String model, int displaysize, int memoery,String company) {
        this.model = model;
        this.displaysize = displaysize;
        this.memoery = memoery;
        this.company=company;
    }

    void display(){
        System.out.println("Parent class"+ model+ " display size"+ displaysize);
    }
    void storage(){
        System.out.println("Storage  of parent class computer "+ memoery);

    }
    void company(){
        System.out.println("Company name of the laptop "+company);
    }
}
class Apple extends Computer

{
        String color;
    public Apple(String model, int displaysize, int memoery,String company,String color) {
        super(model, displaysize, memoery,company);


    }
    void display(){
        System.out.println("Parent class"+ model+ " display size"+ displaysize+ " colour "+color);
    }
    void storage(){
        System.out.println("Storage  of parent class computer "+ memoery+ " colour "+ color);

    }
    void company(){
        System.out.println("Company name of the laptop "+company+ " colour "+ color);
    }
}
class Lenovo extends Computer

{
    String operatingsystem;
    public Lenovo(String model, int displaysize, int memoery,String company,String operatingsystem ) {
        super(model, displaysize, memoery,company);
    }
    void display(){
        System.out.println("Parent class"+ model+ " display size"+ displaysize+" have OS :"+ operatingsystem);
    }
    void storage(){
        System.out.println("Storage  of parent class computer "+ memoery+" have OS :"+ operatingsystem);

    }
    void company(){
        System.out.println("Company name of the laptop "+company+" have OS :"+ operatingsystem);
    }




}
class HP extends Computer

{
    String buyingOption;

    public HP(String model, int displaysize, int memoery,String company,String buyingOption) {
        super(model, displaysize, memoery,company);
    }
    void display(){
        System.out.println("Parent class"+ model+ " display size"+ displaysize+" have buying option of "+buyingOption);
    }
    void storage(){
        System.out.println("Storage  of parent class computer "+ memoery+" have buying option of "+buyingOption);


}}
class Dell extends Computer {
    int ram;

    public Dell(String model, int displaysize, int memoery, String company, int ram) {
        super(model, displaysize, memoery, company);
    }

    void display() {
        System.out.println("Parent class" + model + " display size" + displaysize + " have ram " + ram);
    }

    void storage() {
        System.out.println("Storage  of parent class computer " + memoery + " have ram " + ram);
    }
}


