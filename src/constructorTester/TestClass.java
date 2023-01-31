package constructorTester;

import constructor.Task3;

public class TestClass {
    public static void main(String[] args) {
        Task3 obj1=new Task3();
       // Task3 obj2=new Task3(4);//private error out side package
      //  Task3 obj3=new Task3("outside pakage test");//protected error outside package
      //  Task3 obj4=new Task3(4,"out side package test");//default error outside package
    }
}
