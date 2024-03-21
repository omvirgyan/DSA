package DSA.Array_2D;

class Array2D1 {
    public static void main(String[] args) {
        // Initializing a 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the 2D array
        System.out.println("The 2D array:");

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
