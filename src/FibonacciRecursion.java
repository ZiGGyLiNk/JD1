import java.util.Scanner;
/**
 * Занятие 3, задание 2.
 * @author a.bissenek
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = 0;
        long b = 1;

        System.out.println("Input a number:");
        long c = scanner.nextLong();
        fib(a, b, c);
    }

    private static void fib(long a, long b, long c) {
        long d = a + b;
        a = b;
        b = d;
        if (d < c) {
            System.out.print(d + " ");
            fib(a, b, c);
        }
    }
}