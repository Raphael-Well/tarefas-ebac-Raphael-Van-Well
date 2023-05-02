public abstract class Car {
    protected String make;
    protected String model;
    protected Integer year;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void drive();
    public abstract void stop();
}

