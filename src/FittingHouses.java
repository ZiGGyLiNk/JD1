import java.util.Scanner;
/**
 * Занятие 2, задание 2.
 * @author a.bissenek
 */
public class FittingHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input e:");
        int e = scanner.nextInt();
        System.out.println("Input f:");
        int f = scanner.nextInt();
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        System.out.println("Input c:");
        int c = scanner.nextInt();
        System.out.println("Input d:");
        int d = scanner.nextInt();

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("2 houses will fit here");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("2 houses will fit here");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("2 houses will fit here");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("2 houses will fit here");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("2 houses will fit here");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("2 houses will fit here");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("2 houses will fit here");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("2 houses will fit here");
        } else {
            System.out.println("2 houses will NOT fit here");
        }
    }
}
