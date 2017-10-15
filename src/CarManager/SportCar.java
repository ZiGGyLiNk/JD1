package CarManager;

public class SportCar extends Car {

    public int acceleration;

    public SportCar(String brand, String model, int manufactureYear, String bodyType, String engineType, int acceleration) {
        super(brand, model, manufactureYear, bodyType, engineType);
        this.acceleration = acceleration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        SportCar car = (SportCar) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (bodyType != null ? !bodyType.equals(car.bodyType) : car.bodyType != null) return false;
        if (acceleration != car.acceleration) return false;
        return engineType != null ? engineType.equals(car.engineType) : car.engineType == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + manufactureYear;
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + acceleration;
        return result;
    }

    @Override
    public String toString() {
        return "SportCar: " + "brand: " + brand + ", model: " + model + ", acceleration (seconds): " + acceleration + " seconds to reach 100 km/h.";
    }
}
