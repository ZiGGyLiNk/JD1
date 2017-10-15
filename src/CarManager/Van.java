package CarManager;

public class Van extends Car {

    public boolean hasSlidingDoors;

    public Van(String brand, String model, int manufactureYear, String bodyType, String engineType, boolean hasSlidingDoors) {
        super(brand, model, manufactureYear, bodyType, engineType);
        this.hasSlidingDoors = hasSlidingDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Van car = (Van) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (bodyType != null ? !bodyType.equals(car.bodyType) : car.bodyType != null) return false;
        if (hasSlidingDoors != car.hasSlidingDoors) return false;
        return engineType != null ? engineType.equals(car.engineType) : car.engineType == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + manufactureYear;
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + (hasSlidingDoors ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Van: " + "brand: " + brand + ", model: " + model + ", has sliding door(s): " + hasSlidingDoors + ".";
    }
}
