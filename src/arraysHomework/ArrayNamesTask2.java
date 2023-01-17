package arraysHomework;

public class ArrayNamesTask2 {
    public static void main(String[] args) {
        //Batyr Hommadov,Esther Imamun,Evgenii Aleksandrov,Asem Ezedyar,Mina Hanna,Natalia Gusina,Olga Shibaeva,
        //Saud Shafqat,Urwa Waseem
        String [] names={"1)Fouzia Safeer","2)Batyr Hommadov","3)Esther Imamun","4)Evgenii Aleksandrov","5)Asem Ezedyar","6)Mina Hanna",
                "7)Natalia Gusina","8)Olga Shibaeva","9)Saud Shafqat","10)Urwa Waseem","11)Adem"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }System.out.println("---------------------");
        String[]names2=new String[11];
        names2[0]="1)Fouzia Safeer";
        names2[1]="2)Batyr Hommadov";
        names2[2]="3)Esther Imamun";
        names2[3]="4)Evgenii Aleksandrov";
        names2[4]="5)Asem Ezedyar";
        names2[5]="6)Mina Hanna";
        names2[6]="7)Natalia Gusina";
        names2[7]="8)Olga Shibaeva";
        names2[8]="9)Saud Shafqat";
        names2[9]="10)Urwa Waseem";
        names2[10]="11Adem";
        for (int i = 0; i <names2.length ; i++) {
            System.out.println(names2[i]);
        }

}}
