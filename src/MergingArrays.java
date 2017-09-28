import java.util.Arrays;
import java.util.Random;

/**
 * Занятие 4, задание 3.
 * @author a.bissenek
 */
public class MergingArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[random.nextInt(10) + 1];
        int[] secondArray = new int[random.nextInt(5) + 1];
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int mergedArrayIndexCounter = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(9) + 1;
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = random.nextInt(5) + 1;
        }

        for (int i = 0; i < mergedArray.length; i++) {
            if (i < firstArray.length) {
                mergedArray[mergedArrayIndexCounter++] = firstArray[i];
            }
            if (i < secondArray.length) {
                mergedArray[mergedArrayIndexCounter++] = secondArray[i];
            }
        }

        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}