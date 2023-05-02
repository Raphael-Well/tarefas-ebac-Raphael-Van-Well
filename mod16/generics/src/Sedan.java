public class Sedan extends Car {
    public Sedan(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving Sedan");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sedan");
    }
}
