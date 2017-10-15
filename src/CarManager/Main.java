package CarManager;

public class Main {
    public static void main(String[] args) {
        Car car1 = new FamilyCar("Toyota", "Auris", 2010, "hatchback", "diesel", 8);
        Car car2 = new FamilyCar("Tesla", "Model S", 2016, "sedan", "electic", 5);
        Car car3 = new SportCar("Pontiac", "G8 GT", 2012, "sedan", "petrol", 5);
        Car car4 = new SportCar("Ferrari", "F12berlinetta", 2017, "coupe", "petrol", 3);
        Car car5 = new Truck("Chevrolet", "Silverado", 2015, "pick-up", "diesel", 800);
        Car car6 = new Truck("Volvo", "FH", 2017, "truck", "petrol", 8000);
        Car car7 = new Van("Ford", "Transit", 2008, "minibus", "diesel", true);


        Garage.park(car1);
        Garage.park(car1);
        Garage.park(car1);
        Garage.park(car2);
        Garage.park(car2);
        Garage.getSameCarsNumber(car1);
        Garage.getSameCarsNumber(car2);
    }
}
