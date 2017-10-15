package CarManager;

public class FamilyCar extends Car {

    public int passengerCapacity;

    public FamilyCar(String brand, String model, int manufactureYear, String bodyType, String engineType, int passangerCapacity) {
        super(brand, model, manufactureYear, bodyType, engineType);
        this.passengerCapacity = passangerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        FamilyCar car = (FamilyCar) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (bodyType != null ? !bodyType.equals(car.bodyType) : car.bodyType != null) return false;
        if (passengerCapacity != car.passengerCapacity) return false;
        return engineType != null ? engineType.equals(car.engineType) : car.engineType == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + manufactureYear;
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + passengerCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "FamilyCar: " + "brand: " + brand + ", model: " + model + ", capacity: " + passengerCapacity + " people.";
    }
}
