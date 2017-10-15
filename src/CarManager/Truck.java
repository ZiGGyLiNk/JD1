package CarManager;

public class Truck extends Car {

    public int carryingCapacity;

    public Truck(String brand, String model, int manufactureYear, String bodyType, String engineType, int carryingCapacity) {
        super(brand, model, manufactureYear, bodyType, engineType);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Truck car = (Truck) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (bodyType != null ? !bodyType.equals(car.bodyType) : car.bodyType != null) return false;
        if (carryingCapacity != car.carryingCapacity) return false;
        return engineType != null ? engineType.equals(car.engineType) : car.engineType == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + manufactureYear;
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + carryingCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Truck: " + "brand: " + brand + ", model: " + model + ", carrying capacity (tones): " + carryingCapacity + ".";
    }
}
