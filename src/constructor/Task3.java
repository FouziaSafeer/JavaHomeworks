package constructor;

public class Task3 {
    /*Write a java class that have 4 constructors with
    4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.*/
        private Task3(int a){
            System.out.println(" This is private constructor within class"+ a);

            }
        protected Task3(String s){
            System.out.println(" This is protected constructor "+ s);

        }
        Task3(int a ,String s){
            System.out.println(" This is default constructor"+a+ " " +s);
        }
        public Task3(){
            System.out.println(" This is public constructor, Java is taking alot of time");

        }

    public static void main(String[] args) {


        Task3 insideClass=new Task3(5);
        Task3 insideClass1=new Task3(4,"hello");
        Task3 insideClass2=new Task3("same class test");
        Task3 insideClass3=new Task3();

}}
