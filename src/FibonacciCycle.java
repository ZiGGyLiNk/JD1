import java.util.Scanner;
/**
 * Занятие 3, задание 2.
 * @author a.bissenek
 */
public class FibonacciCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = 0;
        long b = 1;

        System.out.println("Input a number:");
        long c = scanner.nextLong();

        for (int i = 0; i < c; i++) {
            long d = a + b;
            a = b;
            b = d;
            if (d < c) {
            System.out.print(d + " ");
            } else {
                break;
            }
        }
    }
}