import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Loader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("resources/input_small.csv"));
        for (String line : lines) {
            String[] words = line.split(",");
            String[] words2 = new String[4];
            System.arraycopy(words, 1, words2, 0, 4);
            String result = String.join(" ", words2);
            System.out.println(result);
        }
    }
}













