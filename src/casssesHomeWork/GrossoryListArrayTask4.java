package casssesHomeWork;

public class GrossoryListArrayTask4 {
    public static void main(String[] args) {
        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops


        String[][] grossaryList={{"Cucmber","onion","Potatoes","Raddish"},
                                {"Mangoes0","Apples","Bananas","orangeres","Pears"},
                                {"Cheese","Milk","Yougart"},
                                {"Gulab jaman","Chilli mili","Halwa"}};
        for (int i = 0; i < grossaryList.length ; i++) {
            for (int j = 0; j < grossaryList[i].length; j++) {
                System.out.print(grossaryList[i][j]+" ");

            }
            System.out.println();

        }
    }
}
