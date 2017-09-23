import java.util.Scanner;
/**
 * Занятие 2, задание 1.
 * @author a.bissenek
 */
public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year number: ");
        int yearNumber = scanner.nextInt();

        System.out.println("Enter the month number: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number!");
        }

        System.out.println("Enter the day of the month: ");
        int dayNumber = scanner.nextInt();
        if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11 || monthNumber == 2 && dayNumber == 31) {
            System.out.println("Wrong day of the month!");
        } else if (monthNumber == 2 && dayNumber > 28 && !isLeapYear(yearNumber) || monthNumber == 2 && dayNumber > 29 && isLeapYear(yearNumber)) {
            System.out.println("Wrong day of the month!");
        } else if (monthNumber == 12 && dayNumber == 31) {
            System.out.println("1.1." + ++yearNumber);
        } else if (dayNumber == 30 || dayNumber == 31) {
            System.out.println("1." + ++monthNumber + "." + yearNumber);
        } else if (monthNumber == 2 && dayNumber == 28 && !isLeapYear(yearNumber) || monthNumber == 2 && dayNumber == 29 && isLeapYear(yearNumber)) {
            System.out.println("1.3." + yearNumber);
        } else {
            System.out.println(++dayNumber + "." + monthNumber + "." + yearNumber);
        }
    }
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
