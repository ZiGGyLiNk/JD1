import java.util.Arrays;
import java.util.Random;

/**
 * Занятие 4, задание 4.
 * @author a.bissenek
 */
public class MultiDimensionalArrayToSingleDimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] multiDimensionalArray = new int[random.nextInt(5) + 1][];
        for (int i = 0; i < multiDimensionalArray.length; i++) {
            int innerArraySize = random.nextInt(5) + 1;
            multiDimensionalArray[i] = new int [innerArraySize];
        }

        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int k = 0; k < multiDimensionalArray[i].length; k++) {
                multiDimensionalArray[i][k] = random.nextInt(9) + 1;
            }
        }
        System.out.println("Original array: " + Arrays.deepToString(multiDimensionalArray));
        System.out.println("Linerized array: " + Arrays.toString(linerize(multiDimensionalArray)));
    }
    private static int[] linerize (int[][] multiDimensionalArray) {
        int linerizedArrayLength = 0;
        for (int[] i : multiDimensionalArray) {
            linerizedArrayLength += i.length;
        }
        int[] linerizedArray = new int[linerizedArrayLength];
        for (int i = 0; i < linerizedArrayLength; i++) {
            for (int[] j : multiDimensionalArray) {
                for (int k : j) {
                    linerizedArray[i++] = k;
                }
            }
        }
        return linerizedArray;
    }
}