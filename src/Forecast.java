import java.util.Scanner;
/**
 * Занятие 3, задание 3.
 * @author a.bissenek
 */
public class Forecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number of days:");
        int numberOfDays = scanner.nextInt();

        int precValueSum = 0;
        int maxPrecValue = 0;

        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Input a precipitation value:");
            int precValue = scanner.nextInt();
            precValueSum += precValue;
            if (maxPrecValue < precValue) {
                maxPrecValue = precValue;
            }
        }
        int averagePrecValue = precValueSum / numberOfDays;
        System.out.print("Number of days: " + numberOfDays + '\n' + "Total rainfall: " + precValueSum + '\n' + "Average rainfall: " + averagePrecValue + '\n' + "Maximum daily rainfall: " + maxPrecValue);
    }
}