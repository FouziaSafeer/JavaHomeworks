package class20Homework;

public class Shape {
    /*
1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 In circle class create a method to calculate the area of circle. Test your code*/
    int radius;
    Shape(int radius){
       this.radius=radius;
    }
}
class Circle extends Shape{
    double pie = 3.14;
    Circle(int radius) {
        super(radius);

    }
     public  void area(){
            double areaOfCircle=2*pie*radius;
            System.out.println("Area of circle : "+areaOfCircle);




    }


}
