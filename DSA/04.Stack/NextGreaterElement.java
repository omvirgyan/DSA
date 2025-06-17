import java.util.Stack;

public class NextGreaterElement {
    Stack<Integer> stack = new Stack<>();

    // int[] nextGreater(int[] arr) {
    //     int[] res = new int[arr.length];
    //     res[arr.length - 1] = -1;
    //     stack.push(arr[arr.length - 1]);

    //     for (int i = arr.length - 2; i >= 0; i--) {
    //         while (!stack.isEmpty() && stack.peek() <= arr[i]) {
    //             stack.pop();
    //         }
    //         if (stack.isEmpty()) {
    //             res[i] = -1;
    //         } else {
    //             res[i] = stack.peek();
    //         }
    //         stack.push(arr[i]);
    //     }
    //     return res;
    // }

    //  another Approch
    
    public int[] nextGreater(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
        }
    
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
    
        return res;
    }
    
    public static void main(String[] args) {
        NextGreaterElement st = new NextGreaterElement();
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] ans = st.nextGreater(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
