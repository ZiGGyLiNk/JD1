import java.util.Arrays;
import java.util.Random;

/**
 * Занятие 4, задание 1.
 * @author a.bissenek
 */
public class MovingArrayElements {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int temp = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}