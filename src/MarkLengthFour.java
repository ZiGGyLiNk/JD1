import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
/**
 * Lesson 9, task 1.
 * @author a.bissenek
 */
public class MarkLengthFour {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        printList(list);

        markLength4(list);

        printList(list);
    }

    public static void markLength4(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == 4) {
                iterator.add("****");
            }
        }
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }
}