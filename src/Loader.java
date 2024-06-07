import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Loader {
    public static void main(String[] args) throws IOException {
        String filePath = "resources/input_small.csv";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] lines = new String[1000];
        int i = 0;

        while (reader.ready()) {
            String line = reader.readLine();
            lines[i] = line;
            i++;
        }
        Arrays.sort(lines);
        System.out.println(Arrays.toString(lines));

        reader.close();
    }
}