package constructor;

public class Student {



    /*Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method.*/
        String name;
        String address;


    public Student(String sName,String sAddress){
        this.name=sName;
        this.address =sAddress;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.address);

    }

    public static void main(String[] args) {
        Student fizzy=new Student( "Fouzia","Birmingham");
        fizzy.displayInfo();
    }
}
