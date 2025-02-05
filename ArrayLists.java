import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Subaru");
        cars.add("Toyota");

        cars.add(0, "Mazda");

        cars.get(1);
        System.out.println(cars.size());

        for(String car : cars){
            System.out.println(car);
        }

    }
}