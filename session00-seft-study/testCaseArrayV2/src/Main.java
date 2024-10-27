import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //declaring the ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("VinFast");

        cars.add(0, "Mazada");
        System.out.println(cars);

        System.out.println(cars.get(2));

        cars.set(4, "K");
        System.out.println(cars);
    }
}