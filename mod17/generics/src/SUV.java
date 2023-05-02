public class SUV extends Car {
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving SUV");
    }

    @Override
    public void stop() {
        System.out.println("Stopping SUV");
    }
}



