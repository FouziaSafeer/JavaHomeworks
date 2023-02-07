package inhertanceHomeWork;

public class Task1 {
    public static void main(String[] args) {

        A classA=new A();
        classA.add(5);
        B classB=new B();
        classB.add(2,5);
        C classC=new C();
        classC.add(2,3,5);


    }




    /*HW: Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.*/
}
class A{
    int number1=2;
    void add(int number1){
        System.out.println("sum class A"+number1);
    }
}
class B extends A{
    int number2=2;


    void add(int number1,int number2) {
        System.out.println("Sum here sum class B :"+(number1+number2));
    }
}
class C extends B{
    int number3=2;
   void  add(int number1,int number2,int number3){
    System.out.println("sum here is sum class C "+(number1+number2+number3));
}}