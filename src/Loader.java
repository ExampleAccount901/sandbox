import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Loader {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("resources/input_small.csv");
        FileUtils utils = new FileUtils(filePath);
        long count = utils.countLetters();
        System.out.println(filePath + " has " + count + " letters.");
    }
}