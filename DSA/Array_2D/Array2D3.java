package DSA.Array_2D;

public class Array2D3 {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {1, 2, 3},
            {4, 4, 6}
        };

        countOccurrencesAndPrintTotal(array);
    }

    public static void countOccurrencesAndPrintTotal(int[][] array) {
        int[] occurrences = new int[10]; // Assuming elements are between 0 and 9
        
        // Count occurrences of each element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                occurrences[array[i][j]]++;
            }
        }
        
        // Print the occurrences of each element
        System.out.println("Occurrences:");
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + ": " + occurrences[i]);
            }
        }
        
        // Calculate and print the total number of occurrences
        int totalOccurrences = 0;
        for (int i = 0; i < occurrences.length; i++) {
            totalOccurrences += occurrences[i];
        }
        System.out.println("Total occurrences: " + totalOccurrences);
    }
}

