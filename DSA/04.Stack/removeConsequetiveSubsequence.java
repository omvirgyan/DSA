import java.util.Stack;
public class removeConsequetiveSubsequence {
    Stack<Integer> stack = new Stack<Integer>();
    int[] subsequence(int[] arr){
    for (int i = 0; i < arr.length; i++){
      if(stack.size() == 0) {
        stack.push(arr[i]);
      }
      else if(stack.peek() != arr[i]){
        stack.push(arr[i]);
      }
      else if(stack.peek() == arr[i]){
        if(stack.peek() != arr[i+1]){
          stack.pop();
        }
      }
    }
    int ans[]=new int[stack.size()];
    for(int i = ans.length-1; i >= 0; i--){
        ans[i] = stack.pop();
    }
    return ans;
    }

    public static void main(String[] args) {
        removeConsequetiveSubsequence rcs=new removeConsequetiveSubsequence();
       int arr[]={1,1,2,2,2,3,10,10,10,4,4,4,5,7,7,7,2,0};
       int[] result = rcs.subsequence(arr);
       for (int i : result) {
           System.out.print(i + " ");
       }
      
    }
}
