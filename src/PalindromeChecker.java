import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your palindrome and press Enter: ");
        String potentialPalindrome = scanner.nextLine();
        System.out.println(isPalindrome(potentialPalindrome) ? "This is a palindrome" : "This is not a palindrome");
    }
    private static boolean isPalindrome (String potentialPalindrome) {
        String processedPotentialPalindrome = potentialPalindrome.replaceAll("\\s","").toLowerCase();
        return processedPotentialPalindrome.startsWith(new StringBuilder(processedPotentialPalindrome).reverse().toString());
    }
}