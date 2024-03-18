public class Array13 {
    static void reverseArray(int[] arr, int st, int len) {
        int temp = 0;
        for (int i = st; i < st + (len - st) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - 1 - i + st];
            arr[len - 1 - i + st] = temp;
        }
    }

    static void rotateKTimes(int[] array, int K) {
        int len = array.length;
        K = K % len;
        reverseArray(array, 0, len - K);
        reverseArray(array, len - K, len);
        reverseArray(array, 0, len);
    }

    static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println(); // Print new line after printing the array
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 5, 7, 8, 8, 9};
        rotateKTimes(ar, 0);
        printArray(ar);
    }
}
