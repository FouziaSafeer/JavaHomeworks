package constructor;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
    String bookName;
    int bookNo;
    String bookType;

    Book(String bName,int bNo,String bType){
        this.bookName=bName;
        this.bookNo=bNo;
        this.bookType=bType;
        System.out.println("BookName : "+bName+"Book number: "+bNo + "Book Type:"+ bType);
    }
    Book(String bName){
        this.bookName=bName;
        System.out.println(bName);
    }

    public static void main(String[] args) {
        Book s1=new Book("Chemistry");
        Book b2=new Book("bio",1122,"Science");
    }
}
