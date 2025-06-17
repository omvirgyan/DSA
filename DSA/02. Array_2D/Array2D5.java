package DSA.Array_2D;

public class Array2D5 {
    public static int[] searchElement(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[]{-1, -1}; // Initialize result array to store row and column indices

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return if element is found
                }
            }
        }
        return result; // Return {-1, -1} if element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int[] result = searchElement(matrix, target);
        
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
