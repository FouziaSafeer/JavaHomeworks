package methodsHomeWork;

import java.util.Scanner;

public class HelloInDiffrentLanguage {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    public static void main(String[] args) {
        System.out.println("Select county of your choice 1.USA 2. UK 3. Pakistan 4. China ");
        Scanner input=new Scanner(System.in);
        String country=input.next();
        HelloInDiffrentLanguage sayHello=new HelloInDiffrentLanguage();
        sayHello.greeting(country);

    }
    void greeting(String country){
        switch (country){
            case "USA":
            { System.out.println("Hello");
            break;}
            case "UK":
            { System.out.println("Hi ya");
            break;}
            case"Pakistan":
            { System.out.println("Asalamoalikum");
            break;}
            case"China":
            { System.out.println("Ni how");
            break;}
            default:
            {  System.out.println("Invalid choice:");}
        }
    }
}
