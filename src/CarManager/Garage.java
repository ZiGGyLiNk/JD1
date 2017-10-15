package CarManager;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Garage {

    private static Map<Object, Integer> parkingLot = new HashMap<>();

    public static void park(Object car) {

        int numberOfExactlyTheSameCars = 1;

        for (Map.Entry<Object, Integer> entry : parkingLot.entrySet()) {
            if (car.equals(entry.getKey())) {
                numberOfExactlyTheSameCars++;
            }
        }

        parkingLot.put(car, numberOfExactlyTheSameCars);

        System.out.println("You have parked " + car.toString());
    }

    public static void drive(Object car) {
        if (parkingLot.containsKey(car)) {
            int numberOfExactlyTheSameCars = 1;

            for (Map.Entry<Object, Integer> entry : parkingLot.entrySet()) {
                if (car.equals(entry.getKey())) {
                    numberOfExactlyTheSameCars++;
                }
            }

            parkingLot.remove(car, numberOfExactlyTheSameCars);
            System.out.println("You have left the parking lot driving " + car.toString());
        } else {
            System.out.println("There is no such car in the parking lot!");
        }
    }

    public static void getSameCarsNumber(Car car) {
        if (parkingLot.containsKey(car)) {
            int numberOfExactlyTheSameCars = 1;

            for (Map.Entry<Object, Integer> entry : parkingLot.entrySet()) {
                if (car.equals(entry.getKey())) {
                    numberOfExactlyTheSameCars++;
                }
            }

            System.out.println(numberOfExactlyTheSameCars);
        } else {
            System.out.println("There is no such car in the parking lot!");
        }
    }
}