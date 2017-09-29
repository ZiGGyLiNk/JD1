import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RomanNumbersToArabic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Roman number and press Enter: ");
        String romanNumber = scanner.nextLine();
        Pattern p = Pattern.compile("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        System.out.println(p.matcher(romanNumber).find() ? convertedRomanNumber(romanNumber) : "Incorrect format!");
    }
    private static int convertedRomanNumber (String romanNumber) {
        String processedRomanNumberString = romanNumber.replace("CM", "900 ").replace("CD ", "400 ").replace("XC", "90 ").replace("XL", "40 ").replace("IX", "9 ").replace("IV", "4 ").replace("M", "1000 ").replace("D", "500 ").replace("C", "100 ").replace("L", "50 ").replace("X", "10 ").replace("V", "5 ").replace("I", "1 ").trim();
        String[] processedRomanNumberArray = processedRomanNumberString.split(" ");
        int[] processedRomanNumberArrayToSumUp = new int[processedRomanNumberArray.length];
        for (int i = 0; i < processedRomanNumberArray.length; i++) {
            processedRomanNumberArrayToSumUp[i] = Integer.parseInt(processedRomanNumberArray[i]);
        }
        int finalResult = 0;
        for (int i : processedRomanNumberArrayToSumUp) {
            finalResult += i;
        }
        return finalResult;
    }
}