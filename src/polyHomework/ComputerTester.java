package polyHomework;

public class ComputerTester {
    public static void main(String[] args) {


        Apple apple = new Apple("M1", 15, 200, "apple", "Silver");
       //  WebDriver[] browsers={ new Chrome(),new Safari(),new FireFox()};Apple, Lenovo, HP, Dell.
        Computer [] laptop={    new HP("HP101",15,200,"HP","Online"),
                                new Apple("M1",13,150,"Apple","Silver"),
                                new Dell("Dell101",15,500," HP ",256),
                                new Lenovo("L123",16,600,"Lenovo","Windows")};
        for(Computer computer :laptop){////to see all browser// dynamics poly morphices
        computer.display();
        computer.company();
        computer.storage();

        System.out.println("--------------------");
    }
}}