package arraysHomework;

public class ArrayCountriesCapitalTask6 {
    public static void main(String[] args) {
        // Create an array of countries.
        // While retrieving all values from an array print capital for each country choose any five countries.
        String [] countriesNames={"Pakistan","England","Canada","America","Saudi Arabia"};
        String [] capitals={"Islamabad","London","Ottawa","WashingtonDc","Riyaad"};
        for (int i = 0; i < countriesNames.length; i++) {
            System.out.println(" Country "+countriesNames[i]+" and  its capital is: "+capitals[i]);
        }
    }
}
