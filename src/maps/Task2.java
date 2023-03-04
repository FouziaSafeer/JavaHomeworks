package maps;

import java.util.TreeMap;

public class Task2 {
    /*) Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/
    public static  void main(String[] args) {


        TreeMap<Integer,Person> details=new TreeMap<>();
        details.put(12345,new Person("fouzia","safeer",40,40000));
        details.put(12346,new Person("faiza","safeer",38,450000));
        details.put(12347,new Person("sadia","safeer",47,140000));
        details.put(12348,new Person("asiya","safeer",48,490000));
       // System.out.println(details);
        var entrySet =details.entrySet();// printing by entery set


        for (var e:entrySet) {


            System.out.println(e.getKey()+" " );
            e.getValue().printUserDetails();}

    }
}
class Person{
    private String name;
    private String LastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void printUserDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("LastName :"+this.LastName);
        System.out.println("Age :"+this.age);
        System.out.println("Salary :"+this.salary);
    }
}