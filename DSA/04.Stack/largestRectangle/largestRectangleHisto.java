package largestRectangle;
import java.util.Stack;
public class largestRectangleHisto {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        int max=-1;
        stack.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty()  && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        stack.clear();
        stack.push(0);
        pse[0]=-1;
         for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
                             
        largestRectangleHisto lrh=new largestRectangleHisto();
        int[] arr={5};
        System.out.println(lrh.largestRectangleArea(arr));

    }
}