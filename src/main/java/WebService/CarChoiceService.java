package WebService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarChoiceService implements ICarChoiceService {
    // The data from the database can be considered here

    // A list of cars that can be stored in the database
    private static List<String> cars;

    // "PostConstruct" - used on a method that needs to be executed after dependency injection, to perform any initialization.
    @PostConstruct
    private void generateCars(){
        cars = new ArrayList<>();
        cars.add("Porche");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add("Ford");
    }

    @Override
    public String getCar() {
        Random rand = new Random();
        int randomCarIndex = rand.nextInt(cars.size());
        return cars.get(randomCarIndex);
    }
}
