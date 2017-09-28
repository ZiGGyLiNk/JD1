import java.util.Arrays;
import java.util.Random;

/**
 * Занятие 4, задание 2.
 * @author a.bissenek
 */
public class RemovingEqualNumbers {
    public static void main(String[] args) {

        int[] originalArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(originalArray));

        for (int i = 0; i < originalArray.length; i++) {
            int temp = originalArray[i];
            for (int k = i + 1; k < originalArray.length; k++) {
                if (originalArray[i] == originalArray[k]) {
                    temp = 0;
                    originalArray[k] = temp;
                }
            }
            originalArray[i] = temp;
        }

        System.out.println(Arrays.toString(originalArray));

        int[] newArray = Arrays.stream(originalArray).filter(i -> i != 0).toArray();
        System.out.println("Final result: " + Arrays.toString(newArray));
    }
}