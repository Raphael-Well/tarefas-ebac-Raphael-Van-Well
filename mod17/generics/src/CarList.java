import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new SUV("Ford", "Explorer", 2021));
        carList.add(new Sedan("Toyota", "Camry", 2022));

        for (Car car : carList) {
            car.drive();
            car.stop();
        }
    }
}

