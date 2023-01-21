package casssesHomeWork;

public class PhoneTask1 {
    public static void main(String[] args) {
        //1) Create a Class “Phone”. Create 3 Objects of it:
        // iPhone, Pixel, Samsung with specific  attributes and behaviors.
        phone iphone=new phone();
        iphone.phoneName="iphone";
        iphone.phonePrice=1000;

        phone pixel=new phone();
        phone samsung=new phone();
        System.out.println(iphone.phonePrice);
        samsung.Colour();
        iphone.Colour();
    }
}
