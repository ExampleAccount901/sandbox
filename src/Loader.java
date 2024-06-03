import java.util.Arrays;
import java.util.Random;

public class Loader {
    public static void main(String[] args) {
        int[][] matrix = new int[1][8];
        Random gen = new Random();

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = gen.nextInt(2);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            String line = Arrays.toString(row);
            System.out.println(line);
        }

        System.out.println(computeSum(matrix));
    }

    // TODO: compute the sum
    public static int computeSum(int[][] matrix) {
        int compute = 0;
        for (int i= 0; i < matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++)
                compute += matrix [i][j];
        }
        return compute;
    }
}