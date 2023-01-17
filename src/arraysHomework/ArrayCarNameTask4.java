package arraysHomework;

public class ArrayCarNameTask4 {
    public static void main(String[] args) {
        //4) Create an array that can store names of cars and store 6 elements into it.
        // Print all values from the array.
        String [] carsName={"BMW","Audi","Tesla","Z4","Ferrari","Toyota"};
        for (int i = 0; i < carsName.length; i++) {
            System.out.println((i+1)+") "+carsName[i]);

        }
    }
}
