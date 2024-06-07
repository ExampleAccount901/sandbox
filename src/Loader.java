import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Loader {
    public static void main(String[] args) throws IOException {
        String filePath = "resources/input_small.csv";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int[] numbers = new int[1000];
        int i = 0;

        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(",");
            String firstWord = words[0];
            int num = Integer.parseInt(firstWord);
            numbers[i++] = num;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        reader.close();
    }
}