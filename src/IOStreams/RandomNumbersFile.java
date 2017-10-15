package IOStreams;

import java.io.*;
import java.util.*;

public class RandomNumbersFile {
    public static void main(String[] args) throws IOException {
        File resourcesDirectory = new File("src", "IOStreams");
        File outputFile = new File(resourcesDirectory, "numbers.txt");
        boolean fileCreated = outputFile.createNewFile();

        int numberOfWholeNumbersToAdd = 1000;
        int boundForRandom = 1000;
        Random random = new Random();

        try (PrintStream stream = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true)) {
            for (int i = 0; i < numberOfWholeNumbersToAdd; i++) {
                String number = String.valueOf(random.nextInt(boundForRandom));
                stream.append(number);
                stream.append(" ");
            }
        }
        sorter(outputFile);
    }

    private static void sorter(File file) {
        ArrayList<Integer> arrayToSortNumbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                arrayToSortNumbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        arrayToSortNumbers.sort(Comparator.naturalOrder());

        try (PrintStream stream = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)), true)) {
            for (Integer arrayToSortNumber : arrayToSortNumbers) {
                String number = String.valueOf(arrayToSortNumber);
                stream.append(number);
                stream.append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
