package DSA.Array_2D;
import java.util.Scanner;

public class Array2D2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix (separated by space):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of all elements: " + sumOfAllElements(matrix));
        System.out.println("Sum of diagonal elements: " + sumOfDiagonalElements(matrix));
        System.out.println("Sum of corner elements: " + sumOfCornerElements(matrix));
        
        System.out.println("Matrix:");
        printMatrix(matrix);
        scanner.close();
    }

    // Method to find the sum of all elements in the matrix
    public static int sumOfAllElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    // Method to find the sum of diagonal elements in the matrix
    public static int sumOfDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // Method to find the sum of corner elements in the matrix
    public static int sumOfCornerElements(int[][] matrix) {
        int sum = matrix[0][0] + matrix[0][matrix.length - 1] + matrix[matrix.length - 1][0]
                + matrix[matrix.length - 1][matrix.length - 1];
        return sum;
    }
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
