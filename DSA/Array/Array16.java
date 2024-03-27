//REARRANGE SUCH WAY THAT EVEN ELEMENT COME RIGHT AND ODD COMES IN LEFT
public class Array16 {
    static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            } else if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 9, 111, 10};
        rearrange(arr);
        printArray(arr);
    }
}
