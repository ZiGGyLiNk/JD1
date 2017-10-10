import java.util.Arrays;
import java.util.HashSet;

public class WordsFrequency {
    public static void main(String[] args) {

        String englishText = "Computer science is the study of how to manipulate, manage, transform and encode" +
                " information. There are many different areas in computer science.";

        System.out.println(uniqueWordsCounter(englishText));
    }

    public static int uniqueWordsCounter (String text) {
        String[] uniqueWordsFromText = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        return new HashSet<>(Arrays.asList(uniqueWordsFromText)).size();
    }
}