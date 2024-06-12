import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Loader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("resources/input_small.csv"));
        String[] temp = new String[4000];
        String[] result = new String[4000];
        int offset = 0;
        for (String line : lines) {
            String[] words = line.split(",");
            System.arraycopy(words, 1, temp, offset, 4);
            offset += 4;
        }
        int counter = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() <= 5) {
                result[counter] = temp[i];
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(result));

        String[] result2 = new String[counter];

    }
}













