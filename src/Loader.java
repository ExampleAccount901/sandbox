import java.io.*;
import java.util.*;


public class Loader {
    public static void main(String[] args) throws IOException {
        String input = "resources/input_small.csv";
        String output = "resources/output_sorted.csv";
        reverseFile(input, output);

    }


    public static void reverseFile(String inputFile, String outputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("resources/input_small.csv"));
            for (int i = 0; i <1000; i++) {
            String list = reader.readLine();
                String[] myarray = list.split(",");
                Collections.reverse(Arrays.asList(myarray));
                String done=Arrays.toString(myarray);
                System.out.printf(done);



            }






        }}













