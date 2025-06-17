package DSA.Array_2D;
import java.util.Arrays;
import java.util.Comparator;
public class Array2D6 {

    public static void main(String[] args) {
        int[][] array = {
            {5, 4, 3},
            {2, 1, 6},
            {9, 8, 7}
        };

        System.out.println("Original array:");
        printArray(array);

        // Sorting the 2D array
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; // Change this line to sort based on different columns
            }
        });

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
