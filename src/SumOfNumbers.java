import java.util.Scanner;
/**
 * Занятие 3, задание 1.
 * @author a.bissenek
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number:");
        int a = scanner.nextInt();
        int sum = 0;
        calculateSum(a, sum);
    }

    private static void calculateSum(int a, int sum) {
        if (a != 0) {
            sum = sum + a % 10;
            a = a / 10;
            calculateSum(a, sum);
        } else {
            System.out.println(sum);
        }
    }
}
