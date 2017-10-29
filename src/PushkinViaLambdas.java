import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class PushkinViaLambdas {

    public static void main(String[] args) throws IOException {

        Map characterCounterMap = Files.lines(Paths.get("C:\\Users\\bissenek_a\\IdeaProjects\\jd1\\src\\pushkin.txt"))
                .map(line -> line.toLowerCase().replaceAll("[^А-Яа-я]", "").split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(characterCounterMap);
    }
}
