package arrayList;

import java.util.LinkedList;

public class Task7 {
    /*Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
         Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {
            Card americanExpress=new Card(3.5,"Visa");
            Card santender=new Card(5,"Visa");
            Card netwest=new Card(5,"Visa");
            LinkedList<Card> cards=new LinkedList<>();
            cards.add(americanExpress);
            cards.add(santender);
            cards.add(netwest);

            for (Card l :cards) {
                    l.deposit();
                    l.withdraw();
                    System.out.println("**********************");

            }

    }
}
class Card{
        double interestRate;
        String cardType;

        public Card(double interestRate, String cardType) {
                this.interestRate = interestRate;
                this.cardType = cardType;
        }

        void deposit(){
                System.out.println("Deposit feature with card "+cardType);
        }
        void withdraw(){
                System.out.println("With this "+cardType+" card you can withdraw");
        }
}
