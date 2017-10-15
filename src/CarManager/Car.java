package CarManager;

public abstract class Car {
    public String brand;
    public String model;
    public int manufactureYear;
    public String bodyType;
    public String engineType;

    public Car(String brand, String model, int manufactureYear, String bodyType, String engineType) {
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.bodyType = bodyType;
        this.engineType = engineType;
    }
}
