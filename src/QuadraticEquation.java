import java.util.Scanner;
/**
 * Занятие 2, задание 3.
 * @author a.bissenek
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        System.out.println("Input c:");
        int c = scanner.nextInt();

        double disc = discriminant(a, b, c);

        if (isPositive(disc)) {
            double x1 = (-b - Math.sqrt(disc)) / (2 * a);
            double x2 = (-b + Math.sqrt(disc)) / (2 * a);
            System.out.println("Root 1 is " + x1 + '\n' + "Root 2 is " + x2);
        } else if (isZero(disc)) {
            double x1 = -b / (2 * a);
            System.out.println("A single root is " + x1);
        } else {
            System.out.println("Discriminant value is negative!");
        }
    }
    private static double discriminant(int a, int b, int c) {return (b * b - 4 * a * c);}

    private static boolean isPositive(double discriminant) {return (discriminant > 0);}

    private static boolean isZero(double discriminant) {return (discriminant == 0);}
}