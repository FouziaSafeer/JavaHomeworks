package arrayList;

import java.time.Instant;
import java.util.ArrayList;

public class Task6 {
    /*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented
     behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
      Car class has it’s own attribute as carModel and Class Pet has petType attribute.
       Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {


        Insurance teslacar = new Car("Car insurance", "tesla y model");
        Insurance catpet = new Pet("Pet Insurance", "cat");
        Insurance healthinsurance = new Health("Health insurance");
        ArrayList<Insurance> insurance = new ArrayList<>();
        insurance.add(teslacar);
        insurance.add(catpet);
        insurance.add(healthinsurance);
        for (Insurance x : insurance) {
            x.getQuote();
            x.cancelInsurance();

        }

    }
}

abstract class Insurance {
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Quote for car insurance!!");

    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel car insurance");

    }
}

class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Pet insurance quote");

    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel Pet insurance");

    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Quote for Health insurance");

    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel health insurance");
    }
}