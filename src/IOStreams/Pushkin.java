package IOStreams;

import java.io.*;
import java.util.*;

public class Pushkin {
    public static void main(String[] args){

        StringBuilder allPoemCharacters = new StringBuilder();
        TreeSet<Character> uniqueLetters = new TreeSet<>();

        File resourcesDirectory = new File("src", "IOStreams");
        File inputFile = new File(resourcesDirectory, "eo.txt");
        File outputFile = new File(resourcesDirectory, "letters.txt");

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(inputFile)))) {
            while (scanner.hasNext()) {
                allPoemCharacters.append(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String allPoemLetters = allPoemCharacters.toString().toLowerCase().replaceAll("[^А-Яа-я]", "");

        for (int i = 0; i < allPoemLetters.length(); i++) {
            uniqueLetters.add(allPoemLetters.charAt(i));
        }

        try (PrintStream stream = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true)) {
            for (Character c : uniqueLetters) {
                int lettersCounter = 0;
                for (int i = 0; i < allPoemLetters.length(); i++) {
                    if (allPoemLetters.charAt(i) == c) {
                        lettersCounter++;
                    }
                }
                String number = String.valueOf(lettersCounter);
                stream.append(c);
                stream.append(" - ");
                stream.append(number);
                stream.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
